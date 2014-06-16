package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CatchClause extends SyntaxTreeElement {

    private final JavaParser.CatchClauseContext ctx;
    private final List tokensList = new LinkedList();

    public CatchClause(JavaParser.CatchClauseContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (ParseTree pt : ctx.children) {
            if (pt instanceof TerminalNode) {
                tokensList.add(pt.getText() + " ");
            } else if (pt instanceof JavaParser.BlockContext) {
                tokensList.add(new Block((JavaParser.BlockContext) pt));
            } else if (pt instanceof JavaParser.VariableModifierContext) {
                if (pt.getText().contains("final")) {
                    tokensList.add("const");
                }
            } else {
                tokensList.add(pt.getText() + " ");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object token : tokensList) {
            sb.append(token);
        }
        return sb.toString();
    }
}
