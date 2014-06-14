package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Statement {

    private final JavaParser.StatementContext ctx;
    private final List tokensList = new LinkedList();
    private Expression expression;

    public Statement(JavaParser.StatementContext ctx) {
        this.ctx = ctx;
        for (ParseTree pt : ctx.children) {
            if (pt instanceof TerminalNode) {
                tokensList.add(pt.getText() + " ");
            } else if (pt instanceof JavaParser.ExpressionContext) {
                tokensList.add(new Expression((JavaParser.ExpressionContext) pt));
            } else if (pt instanceof JavaParser.ParExpressionContext) {
                tokensList.add(new Expression((JavaParser.ParExpressionContext) pt));
            } else if (pt instanceof JavaParser.StatementContext) {
                tokensList.add(new Statement((JavaParser.StatementContext) pt));
            } else if (pt instanceof JavaParser.StatementExpressionContext) {
                tokensList.add(new Expression(((JavaParser.StatementExpressionContext) pt).expression()));
            } else if (pt instanceof JavaParser.BlockContext) {
                tokensList.add(new Block((JavaParser.BlockContext) pt));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object token : tokensList) {
            sb.append(token);
        }
        return sb.toString();
    }

}
