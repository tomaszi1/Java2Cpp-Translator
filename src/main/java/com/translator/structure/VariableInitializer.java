
package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class VariableInitializer extends SyntaxTreeElement {
    private final JavaParser.VariableInitializerContext ctx;
    private final List<VariableInitializer> arrayInitializer = new LinkedList<>();
    private Expression expression;

    VariableInitializer(JavaParser.VariableInitializerContext ctx) {
        super(ctx);
        this.ctx = ctx;
        if (ctx.expression() != null)
            expression = new Expression(ctx.expression());
        else {
            for (JavaParser.VariableInitializerContext varInitCtx : ctx.arrayInitializer().variableInitializer()) 
                arrayInitializer.add(new VariableInitializer(varInitCtx));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (expression != null)
            return expression.toString();
        else {
            sb.append("{");
            for (VariableInitializer varInit : arrayInitializer) 
                sb.append(varInit.toString()).append(", ");
            sb.setLength(sb.length() - 2);
            sb.append("}");
        }
        return sb.toString();
    }


}
