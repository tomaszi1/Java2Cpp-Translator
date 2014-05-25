
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;

public class Identifier extends Rule {

    private final String identifier;

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        throw new NoSuchSubruleException();
    }

    public String getIdentifier() {
        return identifier;
    }

}
