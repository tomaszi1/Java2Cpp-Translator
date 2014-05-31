
package com.translator;

import com.translator.structure.ClassBodyDeclaration;
import com.translator.structure.ClassDeclaration;
import com.translator.structure.MainMethodDeclaration;
import java.util.LinkedList;
import java.util.List;

public class TranslationUnit {

    private final List<ClassDeclaration> classDeclarations = new LinkedList<>();
    private MainMethodDeclaration mainMethod;

    public void addClassDeclaration(ClassDeclaration classDecl) {
        classDeclarations.add(classDecl);
    }

    public void setMainMethod(MainMethodDeclaration mainDecl) {
        if (mainMethod != null)
            throw new IllegalArgumentException("Main method already set");
        mainMethod = mainDecl;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(mainMethod);
        for (ClassDeclaration classDecl : classDeclarations) {
            builder.append(classDecl.toString());
        }
        return builder.toString();
    }
}
