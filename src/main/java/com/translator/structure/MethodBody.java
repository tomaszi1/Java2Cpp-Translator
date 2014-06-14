
package com.translator.structure;

import com.translator.output.Output;
import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class MethodBody {

    private final List<BlockStatement> blockStatements = new LinkedList<>();

    public MethodBody(JavaParser.MethodBodyContext ctx) {
        for (JavaParser.BlockStatementContext stCtx : ctx.block().blockStatement()) {
            blockStatements.add(new BlockStatement(stCtx));
        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for (BlockStatement st : blockStatements) {
            b.append(Output.indent(0));
            b.append(st);
            b.append("\n");
        }
        return b.toString();
    }

}
