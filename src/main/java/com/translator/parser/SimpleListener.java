
package com.translator.parser;

import com.translator.RuleController;
import com.translator.exceptions.NoSuchSubruleException;
import com.translator.structure.VariableModifier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleListener extends JavaBaseListener {

    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        VariableModifier finalMod = new VariableModifier();
        try {
            RuleController.getCurrentRule().addSubRule(finalMod);
        } catch (NoSuchSubruleException ex) {
            System.out.println("Reguła niedodana");
            Logger.getLogger(SimpleListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
