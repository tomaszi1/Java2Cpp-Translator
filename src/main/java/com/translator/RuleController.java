
package com.translator;

import com.translator.structure.Rule;

public class RuleController {

    private static Rule currentRule;

    public static Rule getCurrentRule() {
        return currentRule;
    }

    public static void setCurrentRule(Rule aCurrentRule) {
        currentRule = aCurrentRule;
    }

}
