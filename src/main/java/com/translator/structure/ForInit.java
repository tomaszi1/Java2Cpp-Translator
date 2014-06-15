package com.translator.structure;

import com.translator.parser.JavaParser;

public class ForInit {

    private final JavaParser.ForInitContext ctx;
    private ExpressionList expressionList;
    private LocalVariableDeclaration localVariableDeclaration;

    public ForInit(JavaParser.ForInitContext ctx) {
        this.ctx = ctx;
        if (ctx.expressionList() != null) {
            expressionList = new ExpressionList(ctx.expressionList());
        } else if (ctx.localVariableDeclaration() != null) {
            localVariableDeclaration = new LocalVariableDeclaration(ctx.localVariableDeclaration());
        }
    }

    @Override
    public String toString() {
        if (expressionList != null) {
            return expressionList.toString();
        } else {
            return localVariableDeclaration.toString();
        }
    }
}
