package com.translator.utils;

import com.translator.TranslationUnit;
import com.translator.parser.JavaLexer;
import com.translator.parser.JavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class TestExecutor {

    public static void execute(String sourceCode) throws Exception {
        ANTLRInputStream stream = new ANTLRInputStream(sourceCode);
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        JavaParser.CompilationUnitContext tree = parser.compilationUnit();
        try {
            TranslationUnit translationUnit = new TranslationUnit(tree);
            System.out.println(translationUnit.toString());
        } catch (RecognitionException ex) {
            System.out.println("Syntax error: " + ex);
        }
        
    }
}
