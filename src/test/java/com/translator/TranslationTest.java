package com.translator;

import com.translator.parser.LogListener;
import com.translator.structure.LocalVariableDeclarationStatement;
import java.io.IOException;
import java.util.logging.Logger;
import org.junit.Test;

public class TranslationTest {

    private static final Logger LOG = Logger.getLogger(TranslationTest.class.getName());

    @Test
    public void simpleTest() throws Exception {
        String sourceCode = "public class Klasa{"
                + " public void Metoda(TypArg argument){"
                + "     int i = 5;"
                + " }"
                + "}";
        TestExecutor.execute(sourceCode, new LogListener());
        TreeDisplayer.displaySyntaxTree(sourceCode);
    }

    @Test
    public void simpleTest2() throws Exception {
        String sourceCode = "int i = 5;";
        LocalVariableDeclarationStatement baseRule = new LocalVariableDeclarationStatement();
        TestExecutor.execute(sourceCode, new LogListener(), baseRule);
        TreeDisplayer.displaySyntaxTree(sourceCode, baseRule.name());
    }

}
