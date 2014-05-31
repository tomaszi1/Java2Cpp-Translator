
package com.translator.output;

import com.translator.TranslationUnit;
import com.translator.structure.ClassBodyDeclaration;
import com.translator.structure.ClassDeclaration;
import java.util.Stack;

public class ContextHolder {
    public static final Stack<ClassDeclaration> classDeclarations = new Stack<>();
    public final static TranslationUnit translationUnit = new TranslationUnit();
    public static ClassBodyDeclaration classBodyDeclaration;
}
