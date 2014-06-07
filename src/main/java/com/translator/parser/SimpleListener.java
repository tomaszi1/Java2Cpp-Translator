
package com.translator.parser;

import com.translator.structure.ClassDeclaration;
import com.translator.output.ContextHolder;
import com.translator.structure.FieldDeclaration;
import com.translator.structure.FormalParameter;
import com.translator.structure.MethodDeclaration;

public class SimpleListener extends JavaBaseListener {

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
        ClassDeclaration classDecl = new ClassDeclaration(ctx);
        ContextHolder.translationUnit.addClassDeclaration(classDecl);
        ContextHolder.classDeclarations.push(classDecl);
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

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.exitClassBodyDeclaration(ctx);
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

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);
        MethodDeclaration methDecl = new MethodDeclaration(ctx);
        ContextHolder.classBodyDeclaration.setMethodDeclaration(methDecl);
        ContextHolder.methodDeclaration = methDecl;
    }

    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        super.enterFormalParameter(ctx);
        ContextHolder.methodDeclaration.addFormalParameter(ctx);
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        super.enterExpression(ctx);

    }



}
