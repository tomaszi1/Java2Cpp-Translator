
package com.translator.output;

import com.translator.structure.ClassDeclaration;
import com.translator.structure.MethodDeclaration;
import java.util.Stack;

public class ContextHolder {
    public static final Stack<ClassDeclaration> classDeclarations = new Stack<>();
    public static MethodDeclaration methodDeclaration;
}
