
package com.translator.structure;

import com.translator.exceptions.NoSuchSubruleException;

public class CompilationUnit extends Rule {

    @Override
    public void addSubRule(Rule subrule) throws NoSuchSubruleException {
        System.out.println(subrule);
    }

}
