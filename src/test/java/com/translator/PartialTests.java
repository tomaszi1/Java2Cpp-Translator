
package com.translator;

import com.translator.parser.SimpleListener;
import com.translator.utils.TestExecutor;
import com.translator.utils.TreeDisplayer;
import org.junit.Test;

public class PartialTests {

    @Test
    public void simpleTest() throws Exception {
        String sourceCode = ""
                + "import java.dupa.Kolekcja;"
                + "public class Klasa{"
                + "private Field pole1,pole2;"
                + "int prymityw,prym2;"
                + "public static void main(){"
                + " final int i = 5;"
                + " metoda();"
                + "}"
                + "public void metoda(){"
                + "}"
                + "}";
        TestExecutor.execute(sourceCode, new SimpleListener());

        TreeDisplayer.displaySyntaxTree(sourceCode, "compilationUnit");
    }
}
