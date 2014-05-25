package com.translator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.junit.Test;

public class TreeDisplayer {

    public static void main(String[] args) throws IOException {
        displayTreeOfCode("");
    }

    public static void displaySyntaxTree(String code, String baseRule) throws IOException {
        String cmd = "java org.antlr.v4.runtime.misc.TestRig Java " + baseRule + " -gui";
        String parserPath = "D:\\Dropbox\\NetBeans\\Java2Cpp-Translator\\lib\\parser";

        Process proc = Runtime.getRuntime().exec(cmd, null, new File(parserPath));
        String line;
        try (BufferedWriter stdinWriter = new BufferedWriter(new OutputStreamWriter(proc.getOutputStream()))) {
            stdinWriter.write(code);
            stdinWriter.flush();
        }
    }

    public static void displayTreeOfCode(String code) throws IOException {
        displaySyntaxTree(code, "compilationUnit");
    }


    @Test
    public void testGrun() throws IOException {
        displayTreeOfCode("");
    }

}
