package com.translator.utils;

import com.translator.output.ContextHolder;
import com.translator.parser.JavaLexer;
import com.translator.parser.JavaListener;
import com.translator.parser.JavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestExecutor {

    public static void execute(String sourceCode, JavaListener listener) throws Exception {
        ANTLRInputStream stream = new ANTLRInputStream(sourceCode);
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        System.out.println(ContextHolder.translationUnit.toString());

    }
}
