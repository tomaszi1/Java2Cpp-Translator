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
    private boolean isParExpression = false;

    public Expression(JavaParser.ExpressionContext ctx) {
        this.ctx = ctx;
        parentClass = ContextHolder.classDeclarations.peek();
        parentMethod = ContextHolder.methodDeclaration;
        List<JavaParser.ExpressionContext> ctxList = ctx.expression();
        for (JavaParser.ExpressionContext exCtx : ctx.expression()) {
            expressions.add(new Expression(exCtx));
        }
    }

    public Expression(JavaParser.ParExpressionContext ctx) {
        this(ctx.expression());
        isParExpression = true;
    }

    public boolean isPointerType() {
        if (ctx.primary() != null) {
            String s = ctx.primary().getText();
            if (parentMethod.containsObject(s)
                    || parentClass.hasObjectMember(ctx.primary().getText()))
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
        StringBuilder sb = new StringBuilder();
        if (isParExpression)
            sb.append("(");
        if (ctx.Identifier() != null
                && expressions.get(0).isPointerType()) {
            sb.append(expressions.get(0).toString());
            sb.append("->");
            sb.append(ctx.Identifier().getText());
        } else {
            Iterator<Expression> iter = expressions.iterator();
            for (ParseTree pt : ctx.children) {
                if (pt instanceof JavaParser.ExpressionContext) {
                    sb.append(iter.next().toString());
                } else {
                    sb.append(pt.getText());
                }
                sb.append(" ");
            }
            sb.setLength(sb.length() - 1);
        }
        if (isParExpression)
            sb.append(")");
        return sb.toString();
    }

    public void setParExpression(boolean isParExpression) {
        this.isParExpression = isParExpression;
    }

}
