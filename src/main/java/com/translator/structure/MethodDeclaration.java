
package com.translator.structure;

import com.translator.parser.JavaParser;

public class MethodDeclaration {
    private final MethodBody methodBody;
    private final JavaParser.MethodDeclarationContext ctx;

    public MethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        methodBody = new MethodBody(ctx.methodBody());
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        if (ctx.type() != null)
            b.append("void ");
        else {
            b.append(ctx.type().getText());
            if (ctx.type().classOrInterfaceType() != null)
                b.append("* ");
        }
        b.append(ctx.Identifier().getText());
        //TODO
        return b.toString();
    }
}
