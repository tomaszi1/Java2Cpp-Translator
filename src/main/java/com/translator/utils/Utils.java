
package com.translator.utils;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Utils {

    public static void checkForExceptions(ParserRuleContext prc) {
        for (ParseTree child : prc.children) {
            if (child instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) child;
                if (ctx.exception != null)
                    throw ctx.exception;
            }
        }
    }
}
