
package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;

public class Statement {

    private final JavaParser.StatementContext ctx;
    private Expression expression;

    public Statement(JavaParser.StatementContext ctx) {
        this.ctx = ctx;
        if (ctx.statementExpression() != null)
            expression = new Expression(ctx.statementExpression().expression());
        // TODO Expression handling
    }

    @Override
    public String toString() {
        if (expression != null)
            return Output.indent(0) + expression.toString() + ";";
        return Output.indent(0) + ctx.getText();
    }

}
