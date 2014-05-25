
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;
import com.translator.exceptions.SubruleAlreadySetException;

public class Primary extends Rule {
    // TODO
    private boolean alreadySet = false;
    private Identifier identifier;

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
