package com.translator.structure;

import com.translator.output.ContextHolder;
import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.ArrayList;
import java.util.List;

public class ClassBodyDeclaration extends SyntaxTreeElement {

    JavaParser.ClassBodyDeclarationContext ctx;
    private FieldDeclaration fieldDecl;
    private MethodDeclaration methodDecl;

    public ClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super(ctx);
        this.ctx = ctx;
        if (ctx.memberDeclaration() != null) {
            if (ctx.memberDeclaration().methodDeclaration() != null) {
                methodDecl = new MethodDeclaration(ctx.memberDeclaration().methodDeclaration());
                ContextHolder.methodDeclaration = methodDecl;
                methodDecl.initMethodBody();
            } else if (ctx.memberDeclaration().fieldDeclaration() != null) {
                fieldDecl = new FieldDeclaration(ctx.memberDeclaration().fieldDeclaration());
            }
        }
    }

    @Override
    public String toString() {
        if (fieldDecl != null)
            return fieldDecl.toString() + ";";
        if (methodDecl != null)
            return methodDecl.toString();
        return Output.indent(0) + ctx.getText();
    }

    List<String> getIdentifiers() {
        if (fieldDecl != null)
            return fieldDecl.getIdentifiers();
        else if (methodDecl != null) {
            List<String> idList = new ArrayList<>();
            idList.add(methodDecl.getIdentifier());
            return idList;
        }
        return new ArrayList<>();
    }

    boolean isStatic() {
        for (JavaParser.ModifierContext modCtx : ctx.modifier()) {
            if (modCtx.getText().equals("static"))
                return true;
        }
        return false;
    }

    boolean isObjectType() {
        if (fieldDecl != null && fieldDecl.returnsObject()) {
            return true;
        }
        if (methodDecl != null && methodDecl.returnsObject()) {
            return true;
        }
        return false;
    }

}
