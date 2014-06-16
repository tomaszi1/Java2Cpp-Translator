package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class ExpressionList extends SyntaxTreeElement {

    private final JavaParser.ExpressionListContext ctx;
    private final List<Expression> list = new LinkedList<>();

    public ExpressionList(JavaParser.ExpressionListContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (JavaParser.ExpressionContext expCon : ctx.expression()) {
            list.add(new Expression(expCon));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Expression exp : list) {
            sb.append(exp).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
