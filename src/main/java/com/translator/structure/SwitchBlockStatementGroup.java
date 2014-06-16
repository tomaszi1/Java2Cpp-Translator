package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SwitchBlockStatementGroup extends SyntaxTreeElement {

    private final JavaParser.SwitchBlockStatementGroupContext ctx;
    private final List tokensList = new LinkedList();

    public SwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (ParseTree pt : ctx.children) {
            if (pt instanceof TerminalNode) {
                tokensList.add(pt.getText() + " ");
            } else if (pt instanceof JavaParser.SwitchLabelContext) {
                tokensList.add(new SwitchLabel((JavaParser.SwitchLabelContext) pt));
            } else if (pt instanceof JavaParser.BlockStatementContext) {
                tokensList.add(new BlockStatement((JavaParser.BlockStatementContext) pt));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (Object token : tokensList) {
            if (token instanceof SwitchLabel) {
                sb.append(token);
                Output.indentLevel++;
            } else if (token instanceof BlockStatement) {
                sb.append("\n").append(Output.indent(0)).append(token);
            } else {
                sb.append(Output.indent(0)).append(token);
            }
        }
        Output.indentLevel--;
        sb.append("\n");
        return sb.toString();
    }
}
