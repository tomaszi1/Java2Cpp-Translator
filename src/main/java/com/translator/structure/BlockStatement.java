
package com.translator.structure;

import com.translator.output.ContextHolder;
import com.translator.parser.JavaParser;

class BlockStatement {
    JavaParser.BlockStatementContext ctx;

    public BlockStatement(JavaParser.BlockStatementContext ctx) {
        this.ctx = ctx;
        JavaParser.LocalVariableDeclarationStatementContext stCtx = ctx.localVariableDeclarationStatement();
        if (stCtx != null) {
            JavaParser.LocalVariableDeclarationContext varDecl = stCtx.localVariableDeclaration();
            if (varDecl.type().classOrInterfaceType() != null) {
                for (JavaParser.VariableDeclaratorContext varDecCtx : varDecl.variableDeclarators().variableDeclarator()) {
                    ContextHolder.methodDeclaration.addLocalVariableName(varDecCtx.variableDeclaratorId().getText());
                }
            }
        }
    }

    @Override
    public String toString() {
        JavaParser.LocalVariableDeclarationStatementContext stCtx = ctx.localVariableDeclarationStatement();
        if (stCtx != null) {
            JavaParser.LocalVariableDeclarationContext varDecl = stCtx.localVariableDeclaration();
            StringBuilder b = new StringBuilder();
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
        return ctx.getText();
    }
}
