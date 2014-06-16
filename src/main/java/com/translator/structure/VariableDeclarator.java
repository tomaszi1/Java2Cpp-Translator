
package com.translator.structure;

import com.translator.parser.JavaParser;

public class VariableDeclarator extends SyntaxTreeElement {
    private final JavaParser.VariableDeclaratorContext ctx;
    private VariableInitializer variableInitializer;

    VariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        super(ctx);
        this.ctx = ctx;
        if (ctx.variableInitializer() != null)
            variableInitializer = new VariableInitializer(ctx.variableInitializer());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.variableDeclaratorId().getText());
        if (variableInitializer != null) {
            sb.append(" = ");
            sb.append(variableInitializer.toString());
        }
        return sb.toString();
    }

    boolean isArrayType() {
        return ctx.variableDeclaratorId().getText().contains("[]");
    }

}
