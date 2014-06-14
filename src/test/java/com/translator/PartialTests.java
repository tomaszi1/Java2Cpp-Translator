
package com.translator;

import com.translator.parser.TranslationListener;
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
                + " if(i>3){"
                + " metoda(i,new Lol()).wykonaj(); "
                + "}else{"
                + " fuck();"
                + "}"
                + " final int i = 5;"
                + " metoda();"
                + "}"
                + "public Lol[] metoda(String[] a,Lol b){"
                + " Lol b[] = new Lol[]{1,2,3};"
                + "}"
                + "public static String metoda2(int a){"
                + "}"
                + "}";

        TreeDisplayer.displaySyntaxTree(sourceCode, "compilationUnit");
        TestExecutor.execute(sourceCode, new TranslationListener());
    }

    @Test
    public void test2() throws Exception {
        String sourceCode = ""
                + "public class Test{"
                + " private Field pole,pole2;"
                + " void costam(){"
                + "  Obiekt nazwa;"
                + " }"
                + " public void metoda(){"
                + "  pole.costam.wywolanie().costam();"
                + "  pole2.wywol();"
                + "  funkcja().trolo();"
                + " }"
                + " public Field funkcja(){"
                + " }"
                + "}";
        TestExecutor.execute(sourceCode, new TranslationListener());

        TreeDisplayer.displaySyntaxTree(sourceCode, "compilationUnit");
    }

    @Test
    public void test3() throws Exception {
        String sourceCode = ""
                + "public class Test{"
                + " private Field pole,pole2;"

                + " public void metoda(){"
                + "  funkcja().costam();"
                + " }"
                + " public Field funkcja(){"
                + " }"
                + "}";
        TestExecutor.execute(sourceCode, new TranslationListener());

        TreeDisplayer.displaySyntaxTree(sourceCode, "compilationUnit");
    }
}
