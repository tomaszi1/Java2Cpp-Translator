package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class LocalVariableDeclaration extends SyntaxTreeElement {

    private final JavaParser.LocalVariableDeclarationContext ctx;
    List<VariableDeclarator> variableDeclarators = new LinkedList<>();

    public LocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (JavaParser.VariableDeclaratorContext varDeclCtx : ctx.variableDeclarators().variableDeclarator()) {
            variableDeclarators.add(new VariableDeclarator(varDeclCtx));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!ctx.variableModifier().isEmpty()
                && ctx.variableModifier().get(0).getText().equals("final")) {
            sb.append("const ");
        }
        sb.append(ctx.type().getText().equals("boolean") ? "bool" : ctx.type().getText()).append(" ");
        if (ctx.type().classOrInterfaceType() != null
                && !ctx.type().getText().contains("[]"))
            for (VariableDeclarator varDecl : variableDeclarators) {
                if (!varDecl.isArrayType())
                    sb.append("*").append(varDecl);
                else
                    sb.append(varDecl);
            }
        else
            for (VariableDeclarator varDecl : variableDeclarators)
                sb.append(varDecl);

        return sb.toString();
    }
}
