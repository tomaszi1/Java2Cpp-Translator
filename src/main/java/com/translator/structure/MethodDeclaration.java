
package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class MethodDeclaration {
    private final MethodBody methodBody;
    private final JavaParser.MethodDeclarationContext ctx;
    private final List<FormalParameter> formalParameters = new LinkedList<>();

    public MethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        methodBody = new MethodBody(ctx.methodBody());
        this.ctx = ctx;
    }

    public void addFormalParameter(JavaParser.FormalParameterContext ctx) {
        formalParameters.add(new FormalParameter(ctx));
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        if (ctx.type() == null)
            b.append("void ");
        else {
            b.append(ctx.type().getText());
            if (ctx.type().classOrInterfaceType() != null)
                b.append("* ");
        }
        b.append(ctx.Identifier().getText());

        b.append("(");
        for (FormalParameter param : formalParameters) {
            b.append(param).append(",");
        }
        if (!formalParameters.isEmpty())
            b.setLength(b.length() - 1);

        b.append(")");
        b.append("{\n");
        b.append(methodBody);
        b.append("}");
        return b.toString();
    }
}
