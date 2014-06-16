
package com.translator.structure;

import org.antlr.v4.runtime.ParserRuleContext;

public class SyntaxTreeElement {

    public SyntaxTreeElement(ParserRuleContext prc) {
        if (prc.exception != null)
            throw prc.exception;
    }
}
