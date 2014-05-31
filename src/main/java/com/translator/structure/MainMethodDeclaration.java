
package com.translator.structure;

import com.translator.parser.JavaParser;

public class MainMethodDeclaration {
    MethodBody methodBody; // FIXME

    MainMethodDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        methodBody = new MethodBody(ctx.memberDeclaration().methodDeclaration().methodBody());
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("int main(int argc, char *argv[]){\n");
        b.append(methodBody).append("}\n");
        return b.toString();
    }

}
