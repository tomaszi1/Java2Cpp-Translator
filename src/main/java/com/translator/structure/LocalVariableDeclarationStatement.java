
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public class LocalVariableDeclarationStatement extends BlockStatement {
    LocalVariableDeclaration localVariableDeclaration;

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        if (subrule instanceof LocalVariableDeclaration) {
            localVariableDeclaration = (LocalVariableDeclaration) subrule;
        } else {
            throw new NoSuchSubruleException();
        }
    }

}
