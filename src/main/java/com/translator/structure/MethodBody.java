
package com.translator.structure;

import com.translator.parser.JavaParser;

public class MethodBody {
    private final Block block;

    public MethodBody(JavaParser.MethodBodyContext ctx) {
        block = new Block(ctx.block());
    }

    @Override
    public String toString() {
        return block.toString() + "\n";
    }

}
