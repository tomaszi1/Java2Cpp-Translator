
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public class VariableModifier extends Rule {

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "final";
    }

}
