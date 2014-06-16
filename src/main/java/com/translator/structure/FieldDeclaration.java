
package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class FieldDeclaration extends SyntaxTreeElement {
    private final JavaParser.FieldDeclarationContext ctx;

    public FieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        super(ctx);
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(Output.indent(0));
        b.append(ctx.type().getText().equals("boolean") ? "bool" : ctx.type().getText()).append(" ");
        if (ctx.type().classOrInterfaceType() != null) {
            for (JavaParser.VariableDeclaratorContext varDecCtx : ctx.variableDeclarators().variableDeclarator()) {
                //if (varDecCtx.variableDeclaratorId() != null)
                b.append("*").append(varDecCtx.getText());
                b.append(", ");
            }
            b.setLength(b.length() - 2);
        } else {
            b.append(ctx.variableDeclarators().getText());
        }
        return b.toString();
    }

    List<String> getIdentifiers() {
        List<String> list = new LinkedList<>();
        for (JavaParser.VariableDeclaratorContext varDecCtx : ctx.variableDeclarators().variableDeclarator()) {
            list.add(varDecCtx.variableDeclaratorId().Identifier().getText());
        }
        return list;
    }

    boolean returnsObject() {
        if (ctx.type().classOrInterfaceType() != null)
            return true;
        return false;
    }
}
