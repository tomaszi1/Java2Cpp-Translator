package com.translator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.junit.Test;

public class TreeDisplayer {

    public static void displaySyntaxTree(String code, String baseRule) throws IOException {
        String cmd = "java org.antlr.v4.runtime.misc.TestRig Java " + baseRule + " -gui";
        String parserPath = "D:\\Dropbox\\NetBeans\\Java2Cpp-Translator\\lib\\parser";

        Process proc = Runtime.getRuntime().exec(cmd, null, new File(parserPath));
        try (BufferedWriter stdinWriter = new BufferedWriter(new OutputStreamWriter(proc.getOutputStream()))) {
            stdinWriter.write(code);
            stdinWriter.flush();
        }
    }

    public static void displaySyntaxTree(String code) throws IOException {
        TreeDisplayer.displaySyntaxTree(code, "compilationUnit");
    }


    @Test
    public void testGrun() throws IOException {
        displaySyntaxTree("");
    }

}
