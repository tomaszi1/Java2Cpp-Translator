
package com.translator.structure;

import com.translator.parser.JavaParser;

public class FieldDeclaration {
    private final JavaParser.FieldDeclarationContext ctx;

    public FieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(ctx.type().getText()).append(" ");
        if (ctx.type().classOrInterfaceType() != null) {
            for (JavaParser.VariableDeclaratorContext varDecCtx : ctx.variableDeclarators().variableDeclarator()) {
                if (varDecCtx.variableDeclaratorId() != null)
                    b.append("*").append(varDecCtx.getText());
                b.append(", ");
            }
            b.setLength(b.length() - 2);
        } else {
            b.append(ctx.variableDeclarators().getText());
        }
        return b.toString();
    }
}
