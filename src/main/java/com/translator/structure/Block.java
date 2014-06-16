package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class Block extends SyntaxTreeElement {

    private final JavaParser.BlockContext ctx;
    private final List<BlockStatement> blockStatements = new LinkedList<>();

    public Block(JavaParser.BlockContext ctx) {
        super(ctx);
        this.ctx = ctx;
        for (JavaParser.BlockStatementContext bsCtx : ctx.blockStatement()) {
            blockStatements.add(new BlockStatement(bsCtx));
        }
    }

    public void addBlockStatemnsts(List<BlockStatement> list) {
        blockStatements.addAll(list);
    }

    public List<BlockStatement> getBlockStatements() {
        return blockStatements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        Output.indentLevel++;
        for (BlockStatement bs : blockStatements) {
            sb.append(Output.indent(0)).append(bs).append("\n");
        }
        Output.indentLevel--;
        sb.append(Output.indent(0)).append("}");
        return sb.toString();
    }

}
