
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LocalVariableDeclaration extends Rule {
    private VariableModifier variableModifier;
    private Type type;
    private final List<VariableDeclarator> variableDeclarators = new LinkedList<>();

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        if (subrule instanceof VariableModifier) {
            variableModifier = (VariableModifier) subrule;
        } else if (subrule instanceof Type) {
            type = (Type) subrule;
        } else if (subrule instanceof VariableDeclarator) {
            variableDeclarators.add((VariableDeclarator) subrule);
        } else {
            throw new NoSuchSubruleException();
        }
    }

    public VariableModifier getVariableModifier() {
        return variableModifier;
    }

    public Type getType() {
        return type;
    }

    public List<VariableDeclarator> getVariableDeclarators() {
        return new ArrayList<>(variableDeclarators);
    }

}
