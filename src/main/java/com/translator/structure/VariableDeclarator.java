
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public class VariableDeclarator extends Rule {

    private VariableDeclaratorId variableDeclaratorId;
    private VariableInitializer variableInitializer;

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
