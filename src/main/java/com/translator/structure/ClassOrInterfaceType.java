
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceType extends Type {
    private Identifier identifier;
    private final List<ClassOrInterfaceTypeSection> typeSections = new LinkedList<>();

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException {
        if (subrule == null)
            throw new NullPointerException();

        if (subrule instanceof ClassOrInterfaceTypeSection)
            typeSections.add((ClassOrInterfaceTypeSection) subrule);
        else if (subrule instanceof Identifier) {
            if (identifier != null)
                throw new SubruleAlreadySetException();
            identifier = (Identifier) subrule;
        } else {
            throw new NoSuchSubruleException();
        }
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public List<ClassOrInterfaceTypeSection> getTypeSections() {
        return new ArrayList<>(typeSections);
    }

}
