package com.translator.structure;

import com.translator.output.ContextHolder;
import com.translator.parser.JavaParser;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;

public class Expression {

    private final JavaParser.ExpressionContext ctx;
    private final List<Expression> expressions = new LinkedList<>();
    private final ClassDeclaration parentClass;
    private final MethodDeclaration parentMethod;

    public Expression(JavaParser.ExpressionContext ctx) {
        this.ctx = ctx;
        parentClass = ContextHolder.classDeclarations.peek();
        parentMethod = ContextHolder.methodDeclaration;
        List<JavaParser.ExpressionContext> ctxList = ctx.expression();
        for (JavaParser.ExpressionContext exCtx : ctx.expression()) {
            expressions.add(new Expression(exCtx));
        }
    }

    public boolean isPointerType() {
        if (ctx.primary() != null) {
            if (parentMethod.containsObject(ctx.primary().getText())
                    || parentClass.containsObjectField(ctx.primary().getText()))
                return true;
        } else if (ctx.children.size() >= 3
                && ctx.children.get(1).getText().equals("(")
                && expressions.get(0).isPointerType()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        if (ctx.Identifier() != null
                && expressions.get(0).isPointerType()) {
            b.append(expressions.get(0).toString());
            b.append("->");
            b.append(ctx.Identifier().getText());
        } else {
            Iterator<Expression> iter = expressions.iterator();
            for (ParseTree pt : ctx.children) {
                if (pt instanceof JavaParser.ExpressionContext) {
                    b.append(iter.next().toString());
                } else {
                    b.append(pt.getText());
                }
            }
        }
        return b.toString();
    }

}
