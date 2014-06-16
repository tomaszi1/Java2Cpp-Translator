package com.translator.structure;

import com.translator.parser.JavaParser;

public class BlockStatement extends SyntaxTreeElement {

    private final JavaParser.BlockStatementContext ctx;
    private Statement statement;
    private LocalVariableDeclaration localVariableDeclaration;

    public BlockStatement(JavaParser.BlockStatementContext ctx) {
        super(ctx);
        this.ctx = ctx;
        JavaParser.LocalVariableDeclarationStatementContext varDeclSt = ctx.localVariableDeclarationStatement();
        if (varDeclSt != null)
            localVariableDeclaration = new LocalVariableDeclaration(varDeclSt.localVariableDeclaration());

        JavaParser.StatementContext stCtx = ctx.statement();
        if (stCtx != null) {
            statement = new Statement(stCtx);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (statement != null)
            sb.append(statement);
        else
            sb.append(localVariableDeclaration).append(";");
        return sb.toString();
    }
}
