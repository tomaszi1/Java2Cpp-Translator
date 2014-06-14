
package com.translator.parser;

import com.translator.structure.ClassDeclaration;
import com.translator.output.ContextHolder;

public class TranslationListener extends JavaBaseListener {

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
        ClassDeclaration classDecl = new ClassDeclaration(ctx);
        ContextHolder.classDeclarations.push(classDecl);
        ContextHolder.translationUnit.addClassDeclaration(classDecl);
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
        ContextHolder.classDeclarations.pop();
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.enterClassBodyDeclaration(ctx);
        ContextHolder.classDeclarations.peek().addDeclaration(ctx);
    }

}
