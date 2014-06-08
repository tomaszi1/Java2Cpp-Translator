
package com.translator.output;

public class Output {
    public static int indentLevel = 0;

    public static String indent(int offset) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < indentLevel + offset; i++) {
            b.append("    ");
        }
        return b.toString();
    }
}
