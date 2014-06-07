
package com.translator.structure;

import com.translator.output.ContextHolder;
import com.translator.output.Output;
import com.translator.parser.JavaParser;

public class BlockStatement {

    private JavaParser.BlockStatementContext ctx;
    private Statement statement;

    public BlockStatement(JavaParser.BlockStatementContext ctx) {
        this.ctx = ctx;
        JavaParser.LocalVariableDeclarationStatementContext varStCtx = ctx.localVariableDeclarationStatement();
        JavaParser.StatementContext stCtx = ctx.statement();
        if (varStCtx != null) {
            JavaParser.LocalVariableDeclarationContext varDecl = varStCtx.localVariableDeclaration();
            if (varDecl.type().classOrInterfaceType() != null) {
                for (JavaParser.VariableDeclaratorContext varDecCtx : varDecl.variableDeclarators().variableDeclarator()) {
                    String str = varDecCtx.variableDeclaratorId().getText();
                    ContextHolder.methodDeclaration.addLocalVariableName(str);
                }
            }
        } else if (stCtx != null) {
            statement = new Statement(stCtx);
        }
    }

    @Override
    public String toString() {
        JavaParser.LocalVariableDeclarationStatementContext stCtx = ctx.localVariableDeclarationStatement();
        if (stCtx != null) {
            JavaParser.LocalVariableDeclarationContext varDecl = stCtx.localVariableDeclaration();
            StringBuilder b = new StringBuilder();
            b.append(Output.indent(0));
            if (!varDecl.variableModifier().isEmpty()
                    && varDecl.variableModifier().get(0).getText().equals("final")) {
                b.append("const ");
            }
            b.append(varDecl.type().getText()).append(" ");
            if (varDecl.type().classOrInterfaceType() != null) {
                for (JavaParser.VariableDeclaratorContext varDecCtx : varDecl.variableDeclarators().variableDeclarator()) {
                    if (varDecCtx.variableDeclaratorId() != null)
                        b.append("*").append(varDecCtx.getText());
                    b.append(", ");
                }
                b.setLength(b.length() - 2);
            } else {
                b.append(varDecl.variableDeclarators().getText());
            }
            return b.append(";").toString();
        }
        return statement.toString();
    }
}
