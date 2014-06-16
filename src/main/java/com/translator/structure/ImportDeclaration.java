
package com.translator.structure;

import com.translator.parser.JavaParser;

public class ImportDeclaration extends SyntaxTreeElement {

    public ImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        super(ctx);
    }

}
