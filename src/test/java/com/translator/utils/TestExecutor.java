package com.translator.utils;

import com.translator.RuleController;
import com.translator.parser.JavaLexer;
import com.translator.parser.JavaListener;
import com.translator.parser.JavaParser;
import com.translator.parser.SimpleListener;
import com.translator.structure.CompilationUnit;
import com.translator.structure.Rule;
import java.lang.reflect.Method;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestExecutor {

    public static void execute(String sourceCode) throws Exception {
        TestExecutor.execute(sourceCode, new SimpleListener(), new CompilationUnit());
    }

    public static void execute(String sourceCode, JavaListener listener) throws Exception {
        TestExecutor.execute(sourceCode, listener, new CompilationUnit());
    }

    public static void execute(String sourceCode, JavaListener listener, Rule baseRule) throws Exception {
        ANTLRInputStream stream = new ANTLRInputStream(sourceCode);
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        RuleController.setCurrentRule(baseRule);

        Method method = JavaParser.class.getDeclaredMethod(baseRule.name());

        ParserRuleContext tree = (ParserRuleContext) method.invoke(parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
}
