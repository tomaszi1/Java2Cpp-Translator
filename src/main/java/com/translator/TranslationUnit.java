
package com.translator;

import com.translator.output.ContextHolder;
import com.translator.parser.JavaParser;
import com.translator.structure.ClassDeclaration;
import com.translator.structure.MainMethodDeclaration;
import java.util.LinkedList;
import java.util.List;

public class TranslationUnit {

    private final List<ClassDeclaration> classDeclarations = new LinkedList<>();
    private MainMethodDeclaration mainMethod;

    public TranslationUnit(JavaParser.CompilationUnitContext tree) {
        for (JavaParser.TypeDeclarationContext tdCtx : tree.typeDeclaration()) {
            if (tdCtx.classDeclaration() != null) { // TODO add other types (interface,enum)
                ClassDeclaration classDecl = new ClassDeclaration(tdCtx.classDeclaration(), this);
                classDeclarations.add(classDecl);
                ContextHolder.classDeclarations.push(classDecl);
                classDecl.initClassContent();
                ContextHolder.classDeclarations.pop();
            }
        }
    }

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
        if (mainMethod != null)
            builder.append(mainMethod);
        for (ClassDeclaration classDecl : classDeclarations) {
            builder.append(classDecl.toString());
        }
        return builder.toString();
    }
}
