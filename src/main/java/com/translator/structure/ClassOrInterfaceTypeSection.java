
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;
import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceTypeSection extends Rule {
    private String identifier;
    private final List<TypeArgument> typeArguments = new LinkedList<>();

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        throw new NoSuchSubruleException();
    }

}
