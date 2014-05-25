package com.translator;

import com.translator.parser.JavaLexer;
import com.translator.parser.JavaListener;
import com.translator.parser.JavaParser;
import com.translator.parser.SimpleListener;
import com.translator.structure.CompilationUnit;
import com.translator.structure.Rule;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestExecutor {

    public static void execute(String sourceCode) {
        TestExecutor.execute(sourceCode, new SimpleListener(), new CompilationUnit());
    }

    public static void execute(String sourceCode, JavaListener listener) {
        TestExecutor.execute(sourceCode, listener, new CompilationUnit());
    }

    public static void execute(String sourceCode, JavaListener listener, Rule baseRule) {
        ANTLRInputStream stream = new ANTLRInputStream(sourceCode);
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        RuleController.setCurrentRule(baseRule);

        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
}
