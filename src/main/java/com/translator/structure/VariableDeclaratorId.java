
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;
import com.translator.exceptions.SubruleAlreadySetException;

public class VariableDeclaratorId extends Rule implements ContainsIdentifier {
    private final Identifier identifier;
    private final int arrayDims;

    public VariableDeclaratorId(Identifier identifier, int arrayDims) {
        this.identifier = identifier;
        this.arrayDims = arrayDims;
    }

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        throw new NoSuchSubruleException();
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }

    public int getArrayDims() {
        return arrayDims;
    }

}
