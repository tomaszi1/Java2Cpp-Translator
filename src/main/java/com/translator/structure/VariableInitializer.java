
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;
import java.util.LinkedList;
import java.util.List;

public class VariableInitializer extends Rule {

    Expression expression;
    List<VariableInitializer> arrayInitializer = new LinkedList<>();

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        if (subrule == null)
            throw new NullPointerException();

        if (subrule instanceof Expression) {
            if (!arrayInitializer.isEmpty())
                throw new SubruleAlreadySetException();
            expression = (Expression) subrule;
        } else if (subrule instanceof VariableInitializer) {
            if (expression != null)
                throw new SubruleAlreadySetException();
            arrayInitializer.add((VariableInitializer) subrule);
        } else
            throw new NoSuchSubruleException();
    }

}
