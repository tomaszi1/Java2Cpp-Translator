
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public abstract class Rule {

    public abstract void addSubRule(Rule subrule) throws NoSuchSubruleException;
}
