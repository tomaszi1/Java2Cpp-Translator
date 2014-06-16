package com.translator.structure;

import com.translator.TranslationUnit;
import com.translator.output.ContextHolder;
import com.translator.output.Output;
import com.translator.parser.JavaParser;
import com.translator.parser.JavaParser.ClassBodyDeclarationContext;
import com.translator.parser.JavaParser.ClassDeclarationContext;
import com.translator.utils.Utils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ClassDeclaration extends SyntaxTreeElement {

    private final TranslationUnit parent;
    private final ClassDeclarationContext ctx;
    private String name;
    private final List<ClassBodyDeclaration> publicDeclarations = new LinkedList<>();
    private final List<ClassBodyDeclaration> privateDeclarations = new LinkedList<>();
    private final List<ClassBodyDeclaration> protectedDeclarations = new LinkedList<>();
    private final Map<String, ClassBodyDeclaration> allDeclarations = new HashMap<>();
    private final List<String> extendImplementList = new LinkedList<>();
    private boolean isAbstract = false;

    public ClassDeclaration(ClassDeclarationContext ctx, TranslationUnit parent) {
        super(ctx);
        this.ctx = ctx;
        this.parent = parent;
    }

    public void initClassContent() {
        name = ctx.Identifier().getText();
        if (ctx.type() != null) {
            extendImplementList.add(ctx.type().getText());
        }
        if (ctx.typeList() != null) {
            for (JavaParser.TypeContext typeCon : ctx.typeList().type()) {
                extendImplementList.add(typeCon.getText());
            }
        }
        if (ctx.parent != null && ctx.parent instanceof JavaParser.TypeDeclarationContext) { // czemu tak?
            if (((JavaParser.TypeDeclarationContext) ctx.parent).classOrInterfaceModifier().toString().contains("abstract")) {
                isAbstract = true;
            }
        }
        for (ClassBodyDeclarationContext cbdCtx : ctx.classBody().classBodyDeclaration()) {
            addDeclaration(cbdCtx);
        }
    }

    public void addDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        Utils.checkForExceptions(ctx);

        if (isMainMethod(ctx)) {
            MainMethodDeclaration mainMethDecl = new MainMethodDeclaration(ctx);
            parent.setMainMethod(mainMethDecl);
            ContextHolder.methodDeclaration = mainMethDecl;
            mainMethDecl.initMethodBody();
            return;
        }

        ClassBodyDeclaration classBodyDecl = new ClassBodyDeclaration(ctx);
        if (ctx.modifier().isEmpty()) {
            privateDeclarations.add(classBodyDecl);
            saveAllDeclarations(classBodyDecl);
            return;
        }
        JavaParser.ModifierContext modCtx = ctx.modifier().get(0);

        String modifier = modCtx.classOrInterfaceModifier().getText();

        switch (modifier) {
            case "public":
                ctx.children.remove(modCtx);
                publicDeclarations.add(classBodyDecl);
                break;
            case "protected":
                ctx.children.remove(modCtx);
                protectedDeclarations.add(classBodyDecl);
                break;
            case "private":
                ctx.children.remove(modCtx);
                privateDeclarations.add(classBodyDecl);
                break;
            default:
                privateDeclarations.add(classBodyDecl);
        }

        saveAllDeclarations(classBodyDecl);
    }

    private void saveAllDeclarations(ClassBodyDeclaration classBodyDecl) {
        for (String id : classBodyDecl.getIdentifiers()) {
            allDeclarations.put(id, classBodyDecl);
        }
    }

    private boolean isMainMethod(JavaParser.ClassBodyDeclarationContext ctx) {
        if (ctx.modifier().size() < 2) {
            return false;
        }
        if (!ctx.modifier().get(0).getText().equals("public")
                || !ctx.modifier().get(1).getText().equals("static")) {
            return false;
        }
        JavaParser.MethodDeclarationContext methCtx = ctx.memberDeclaration().methodDeclaration();
        if (methCtx == null || !methCtx.Identifier().getText().equals("main")) {
            return false;
        }
        ParseTree childCtx = methCtx.getChild(0);
        return childCtx.getText().equals("void");
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(Output.indent(0));
        /*if (isAbstract) {
            b.append("abstract ");
        }*/
        b.append("class ").append(name);
        if (!extendImplementList.isEmpty()) {
            b.append(" : ");
            for (String s : extendImplementList) {
                b.append("public ").append(s).append(", ");
            }
            b.setLength(b.length() - 2);
        }
        b.append("{\n");
        Output.indentLevel++;
        if (!publicDeclarations.isEmpty()) {
            b.append(Output.indent(-1)).append("public:\n");
        }
        for (ClassBodyDeclaration decl : publicDeclarations) {
            b.append(decl).append("\n");
        }
        if (!privateDeclarations.isEmpty()) {
            b.append(Output.indent(-1)).append("private:\n");
        }
        for (ClassBodyDeclaration decl : privateDeclarations) {
            b.append(decl).append("\n");
        }
        if (!protectedDeclarations.isEmpty()) {
            b.append(Output.indent(-1)).append("protected:\n");
        }
        for (ClassBodyDeclaration decl : protectedDeclarations) {
            b.append(decl).append("\n");
        }
        Output.indentLevel--;
        b.append(Output.indent(0)).append("}\n\n");
        return b.toString();
    }

    public ClassBodyDeclaration getDeclaration(String name) {
        return allDeclarations.get(name);
    }

    public boolean hasObjectMember(String name) {
        ClassBodyDeclaration cbDecl = allDeclarations.get(name);
        if (cbDecl != null && cbDecl.isObjectType()) {
            return true;
        }
        return false;
    }


}
