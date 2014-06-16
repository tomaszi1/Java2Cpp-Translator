package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ForControl extends SyntaxTreeElement {

    private final JavaParser.ForControlContext ctx;
    private final List tokensList = new LinkedList();

    public ForControl(JavaParser.ForControlContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (ParseTree pt : ctx.children) {
            if (pt instanceof TerminalNode) {
                tokensList.add(pt.getText() + " ");
            } else if (pt instanceof JavaParser.EnhancedForControlContext) {
                tokensList.add(new EnhancedForControl((JavaParser.EnhancedForControlContext) pt));
            } else if (pt instanceof JavaParser.ExpressionContext) {
                tokensList.add(new Expression((JavaParser.ExpressionContext) pt));
            } else if (pt instanceof JavaParser.ForInitContext) {
                tokensList.add(new ForInit((JavaParser.ForInitContext) pt));
            } else if (pt instanceof JavaParser.ForUpdateContext) {
                tokensList.add(new ForUpdate((JavaParser.ForUpdateContext) pt));
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
