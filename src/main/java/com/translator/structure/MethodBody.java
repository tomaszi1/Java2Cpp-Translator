
package com.translator.structure;

import com.translator.parser.JavaParser;
import java.util.LinkedList;
import java.util.List;

public class MethodBody {

    private final List<BlockStatement> statements = new LinkedList<>();

    public MethodBody(JavaParser.MethodBodyContext ctx) {
        for (JavaParser.BlockStatementContext stCtx : ctx.block().blockStatement()) {
            statements.add(new BlockStatement(stCtx));
        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for (BlockStatement st : statements) {
            b.append(st.toString()).append("\n");
        }
        return b.toString();
    }

}
