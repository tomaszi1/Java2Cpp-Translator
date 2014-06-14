package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MethodDeclaration {

    private MethodBody methodBody;
    private final JavaParser.MethodDeclarationContext ctx;
    private final List<FormalParameter> formalParameters = new LinkedList<>();
    private final Set<String> localVariableNames = new HashSet<>();

    public MethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        this.ctx = ctx;
        if (ctx.formalParameters().formalParameterList() != null) {
            for (JavaParser.FormalParameterContext forParCtx : ctx.formalParameters().formalParameterList().formalParameter())
                formalParameters.add(new FormalParameter(forParCtx));
        }
    }

    public void addFormalParameter(JavaParser.FormalParameterContext ctx) {
        formalParameters.add(new FormalParameter(ctx));
    }

    public void initMethodBody() {
        methodBody = new MethodBody(ctx.methodBody());
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(Output.indent(0));
        if (ctx.type() == null)
            b.append("void ");
        else {
            b.append(ctx.type().getText());
            if (ctx.type().classOrInterfaceType() != null) {
                b.append("* ");
            } else
                b.append(" ");
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
        Output.indentLevel++;
        b.append(methodBody);
        Output.indentLevel--;
        b.append(Output.indent(0));
        b.append("}\n");
        return b.toString();
    }

    public void addLocalVariableName(String name) {
        localVariableNames.add(name);
    }

    public boolean containsObject(String name) {
        return localVariableNames.contains(name);
    }

    String getIdentifier() {
        return ctx.Identifier().getText();
    }

    boolean returnsObject() {
        if (ctx.type().classOrInterfaceType() != null)
            return true;
        return false;
    }
}
