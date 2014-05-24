
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public class LocalVariableDeclaration extends Rule {
    private VariableModifier variableModifier;
    private Type type;
    private VariableDeclarators variableDeclarators;

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        if (subrule instanceof VariableModifier) {
            variableModifier = (VariableModifier) subrule;
        } else if (subrule instanceof Type) {
            type = (Type) subrule;
        } else if (subrule instanceof VariableDeclarators) {
            variableDeclarators = (VariableDeclarators) subrule;
        } else {
            throw new NoSuchSubruleException();
        }
    }

    public VariableModifier getVariableModifier() {
        return variableModifier;
    }

    public void setVariableModifier(VariableModifier variableModifier) {
        this.variableModifier = variableModifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public VariableDeclarators getVariableDeclarators() {
        return variableDeclarators;
    }

    public void setVariableDeclarators(VariableDeclarators variableDeclarators) {
        this.variableDeclarators = variableDeclarators;
    }
}
