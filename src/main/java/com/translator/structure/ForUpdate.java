package com.translator.structure;

import com.translator.parser.JavaParser;

public class ForUpdate {

    private final JavaParser.ForUpdateContext ctx;
    private ExpressionList expressionList;

    public ForUpdate(JavaParser.ForUpdateContext ctx) {
        this.ctx = ctx;
        if (ctx.expressionList() != null) {
            expressionList = new ExpressionList(ctx.expressionList());
        }
    }

    @Override
    public String toString() {
        return expressionList.toString();
    }

}
