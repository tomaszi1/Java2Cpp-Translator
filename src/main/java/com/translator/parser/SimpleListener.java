
package com.translator.parser;

import com.translator.structure.ClassDeclaration;
import com.translator.output.ContextHolder;
import com.translator.structure.ClassBodyDeclaration;
import com.translator.structure.FieldDeclaration;

public class SimpleListener extends JavaBaseListener {

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
        ClassDeclaration classDecl = new ClassDeclaration(ctx);
        ContextHolder.translationUnit.addClassDeclaration(classDecl);
        ContextHolder.classDeclarations.push(classDecl);
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
        ContextHolder.classDeclarations.pop();
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.enterClassBodyDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
        ContextHolder.classDeclarations.peek().addDeclaration(ctx);
        
    }

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.exitClassBodyDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        super.enterFieldDeclaration(ctx);
        ContextHolder.classBodyDeclaration.setFieldDeclaration(new FieldDeclaration(ctx));
    }

}
