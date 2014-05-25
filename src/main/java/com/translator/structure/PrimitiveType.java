
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;

public class PrimitiveType extends Type {
    private final Name type;

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        throw new NoSuchSubruleException();
    }

    public PrimitiveType(Name type) {
        if (type == null)
            throw new NullPointerException("Null type passed");
        this.type = type;
    }

    public enum Name {

        BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE
    }

}
