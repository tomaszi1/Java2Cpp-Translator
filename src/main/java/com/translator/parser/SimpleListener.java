
package com.translator.parser;

import com.translator.RuleController;
import com.translator.exceptions.NoSuchSubruleException;
import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.structure.ClassOrInterfaceType;
import com.translator.structure.LocalVariableDeclaration;
import com.translator.structure.LocalVariableDeclarationStatement;
import com.translator.structure.Rule;
import com.translator.structure.VariableModifier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleListener extends JavaBaseListener {
    private void addToCurrentRuleAndGoDownOneLevel(Rule subrule) {
        try {
            Rule currentRule = RuleController.getCurrentRule();
            subrule.setParent(currentRule);
            currentRule.addSubRule(subrule);
            RuleController.setCurrentRule(subrule);
        } catch (NoSuchSubruleException | SubruleAlreadySetException ex) {
            Logger.getLogger(SimpleListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void goUpOneLevel() {
        Rule currentRule = RuleController.getCurrentRule();
        RuleController.setCurrentRule(currentRule.getParent());
    }

    @Override
    public void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        LocalVariableDeclarationStatement stat = new LocalVariableDeclarationStatement();
        addToCurrentRuleAndGoDownOneLevel(stat);
    }

    @Override
    public void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        goUpOneLevel();
    }

    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        LocalVariableDeclaration decl = new LocalVariableDeclaration();
        addToCurrentRuleAndGoDownOneLevel(decl);
    }

    @Override
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        goUpOneLevel();
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        ClassOrInterfaceType type = new ClassOrInterfaceType();
        addToCurrentRuleAndGoDownOneLevel(type);
    }

    @Override
    public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        goUpOneLevel();
    }



    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        VariableModifier finalMod = new VariableModifier();
        addToCurrentRuleAndGoDownOneLevel(finalMod);
    }

    @Override
    public void exitVariableModifier(JavaParser.VariableModifierContext ctx) {
        goUpOneLevel();
    }

}
