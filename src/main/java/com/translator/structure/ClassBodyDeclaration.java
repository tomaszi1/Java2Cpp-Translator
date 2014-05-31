package com.translator.structure;

import com.translator.parser.JavaParser;

public class ClassBodyDeclaration {

    JavaParser.ClassBodyDeclarationContext ctx;
    private FieldDeclaration fieldDecl;

    public ClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        this.ctx = ctx;
    }

    public void setFieldDeclaration(FieldDeclaration fieldDecl) {
        this.fieldDecl = fieldDecl;
    }

    @Override
    public String toString() {
        if (fieldDecl != null)
            return fieldDecl.toString() + ";";
        return ctx.getText();
    }

}
