package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.List;

public class FinallyBlock extends SyntaxTreeElement {

    private final JavaParser.FinallyBlockContext ctx;
    private Block block;

    public FinallyBlock(JavaParser.FinallyBlockContext ctx) {
        super(ctx);
        this.ctx = ctx;
        block = new Block(ctx.block());
    }

    /*public List<BlockStatement> getFinallyContent() {
        return block.getBlockStatements();
    }*/
    
    @Override
    public String toString() {
        List<BlockStatement> list = block.getBlockStatements();
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (BlockStatement bs : list) {
            sb.append(Output.indent(0)).append(bs).append("\n");
        }
        return sb.toString();
    }
}
