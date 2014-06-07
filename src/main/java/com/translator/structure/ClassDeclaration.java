package com.translator.structure;

import com.translator.output.ContextHolder;
import com.translator.parser.JavaParser;
import com.translator.parser.JavaParser.ClassDeclarationContext;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.antlr.v4.runtime.tree.ParseTree;

public class ClassDeclaration {

    private final String name;
    private final List<ClassBodyDeclaration> publicDeclarations = new LinkedList<>();
    private final List<ClassBodyDeclaration> privateDeclarations = new LinkedList<>();
    private final List<ClassBodyDeclaration> protectedDeclarations = new LinkedList<>();
    private final Set<String> fieldNames = new HashSet<>();

    public ClassDeclaration(ClassDeclarationContext ctx) {
        name = ctx.Identifier().getText();
    }

    public void addDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        if (isMainMethod(ctx)) {
            ContextHolder.translationUnit.setMainMethod(new MainMethodDeclaration(ctx));
            return;
        }

        ClassBodyDeclaration classDecl = new ClassBodyDeclaration(ctx);
        ContextHolder.classBodyDeclaration = classDecl;
        if (ctx.modifier().isEmpty()) {
            privateDeclarations.add(classDecl);
            return;
        }
        JavaParser.ModifierContext modCtx = ctx.modifier().get(0);
        
        String modifier = modCtx.classOrInterfaceModifier().getText();

        switch (modifier) {
            case "public":
                ctx.children.remove(modCtx);
                publicDeclarations.add(classDecl);
                break;
            case "protected":
                ctx.children.remove(modCtx);
                protectedDeclarations.add(classDecl);
                break;
            case "private":
                ctx.children.remove(modCtx);
                privateDeclarations.add(classDecl);
                break;
            default:
                privateDeclarations.add(classDecl);
        }
    }

    public boolean isMainMethod(JavaParser.ClassBodyDeclarationContext ctx) {
        if (ctx.modifier().size() < 2)
            return false;
        if (!ctx.modifier().get(0).getText().equals("public")
                || !ctx.modifier().get(1).getText().equals("static"))
            return false;
        JavaParser.MethodDeclarationContext methCtx = ctx.memberDeclaration().methodDeclaration();
        if (methCtx == null || !methCtx.Identifier().getText().equals("main"))
            return false;
        ParseTree childCtx = methCtx.getChild(0);
        return childCtx.getText().equals("void");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("class ").append(name).append("{\n");
        if (!publicDeclarations.isEmpty())
            builder.append("public:\n");
        for (ClassBodyDeclaration decl : publicDeclarations) {
            builder.append(decl).append("\n");
        }
        if (!privateDeclarations.isEmpty())
            builder.append("private:\n");
        for (ClassBodyDeclaration decl : privateDeclarations) {
            builder.append(decl).append("\n");
        }
        if (!protectedDeclarations.isEmpty())
            builder.append("protected:\n");
        for (ClassBodyDeclaration decl : protectedDeclarations) {
            builder.append(decl).append("\n");
        }
        builder.append("\n}");
        return builder.toString();
    }

    public void addFieldName(String name) {
        fieldNames.add(name);
    }

    public boolean containsObjectField(String name) {
        return fieldNames.contains(name);
    }

}
