
package com.translator.structure;

import com.translator.parser.JavaParser;

public class FormalParameter extends SyntaxTreeElement {

    private final JavaParser.FormalParameterContext ctx;

    public FormalParameter(JavaParser.FormalParameterContext ctx) {
        super(ctx);
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(ctx.type().getText().equals("boolean") ? "bool" : ctx.type().getText());
        if (ctx.type().classOrInterfaceType() != null
                && !ctx.variableDeclaratorId().getText().contains("[]")
                && !ctx.type().getText().contains("[]"))
            b.append(" *");
        else
            b.append(" ");
        b.append(ctx.variableDeclaratorId().getText());

        return b.toString();
    }
}
