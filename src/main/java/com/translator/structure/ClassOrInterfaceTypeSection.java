package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceTypeSection extends Rule implements ContainsIdentifier {

    private final Identifier identifier;
    private final List<TypeArgument> typeArguments = new LinkedList<>();

    public ClassOrInterfaceTypeSection(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        if (subrule == null)
            throw new NullPointerException();

        if (subrule instanceof TypeArgument)
            typeArguments.add((TypeArgument) subrule);
        else
            throw new NoSuchSubruleException();
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }

    public List<TypeArgument> getTypeArguments() {
        return new ArrayList<>(typeArguments);
    }

}
