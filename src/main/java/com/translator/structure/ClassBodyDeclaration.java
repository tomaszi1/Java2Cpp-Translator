package com.translator.structure;

import com.translator.parser.JavaParser;

public class ClassBodyDeclaration {

    JavaParser.ClassBodyDeclarationContext ctx;
    private FieldDeclaration fieldDecl;
    private MethodDeclaration methodDecl;

    public ClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        this.ctx = ctx;
    }

    public void setFieldDeclaration(FieldDeclaration fieldDecl) {
        this.fieldDecl = fieldDecl;
    }

    public void setMethodDeclaration(MethodDeclaration methodDecl) {
        this.methodDecl = methodDecl;
    }

    @Override
    public String toString() {
        if (fieldDecl != null)
            return fieldDecl.toString() + ";";
        if (methodDecl != null)
            return methodDecl.toString();
        return ctx.getText();
    }

}
