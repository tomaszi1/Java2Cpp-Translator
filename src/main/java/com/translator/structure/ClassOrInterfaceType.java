
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceType extends Type implements ContainsIdentifier {
    private final Identifier identifier;
    private final List<ClassOrInterfaceTypeSection> typeSections = new LinkedList<>();

    public ClassOrInterfaceType(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        if (subrule == null)
            throw new NullPointerException();

        if (subrule instanceof ClassOrInterfaceTypeSection)
            typeSections.add((ClassOrInterfaceTypeSection) subrule);
        else 
            throw new NoSuchSubruleException();
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }

    public List<ClassOrInterfaceTypeSection> getTypeSections() {
        return new ArrayList<>(typeSections);
    }

}
