
package com.translator.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EchoListener extends JavaBaseListener {

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("visitErrorNode");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("visitTerminal");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule");
    }

    @Override
    public void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        System.out.println("exitTypeArgumentsOrDiamond");
    }

    @Override
    public void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        System.out.println("enterTypeArgumentsOrDiamond");
    }

    @Override
    public void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        System.out.println("exitGenericMethodDeclaration");
    }

    @Override
    public void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        System.out.println("enterGenericMethodDeclaration");
    }

    @Override
    public void exitArguments(JavaParser.ArgumentsContext ctx) {
        System.out.println("exitArguments");
    }

    @Override
    public void enterArguments(JavaParser.ArgumentsContext ctx) {
        System.out.println("enterArguments");
    }

    @Override
    public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
        System.out.println("exitFormalParameters");
    }

    @Override
    public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
        System.out.println("enterFormalParameters");
    }

    @Override
    public void exitForInit(JavaParser.ForInitContext ctx) {
        System.out.println("exitForInit");
    }

    @Override
    public void enterForInit(JavaParser.ForInitContext ctx) {
        System.out.println("enterForInit");
    }

    @Override
    public void exitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        System.out.println("exitSwitchLabel");
    }

    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        System.out.println("enterSwitchLabel");
    }

    @Override
    public void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        System.out.println("exitInterfaceMemberDeclaration");
    }

    @Override
    public void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        System.out.println("enterInterfaceMemberDeclaration");
    }

    @Override
    public void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        System.out.println("exitNonWildcardTypeArguments");
    }

    @Override
    public void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        System.out.println("enterNonWildcardTypeArguments");
    }

    @Override
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        System.out.println("exitLocalVariableDeclaration");
    }

    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        System.out.println("enterLocalVariableDeclaration");
    }

    @Override
    public void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        System.out.println("exitElementValuePairs");
    }

    @Override
    public void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        System.out.println("enterElementValuePairs");
    }

    @Override
    public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        System.out.println("exitPackageDeclaration");
    }

    @Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        System.out.println("enterPackageDeclaration");
    }

    @Override
    public void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        System.out.println("exitInterfaceMethodDeclaration");
    }

    @Override
    public void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        System.out.println("enterInterfaceMethodDeclaration");
    }

    @Override
    public void exitStatementExpression(JavaParser.StatementExpressionContext ctx) {
        System.out.println("exitStatementExpression");
    }

    @Override
    public void enterStatementExpression(JavaParser.StatementExpressionContext ctx) {
        System.out.println("enterStatementExpression");
    }

    @Override
    public void exitResources(JavaParser.ResourcesContext ctx) {
        System.out.println("exitResources");
    }

    @Override
    public void enterResources(JavaParser.ResourcesContext ctx) {
        System.out.println("enterResources");
    }

    @Override
    public void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        System.out.println("exitConstantDeclarator");
    }

    @Override
    public void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        System.out.println("enterConstantDeclarator");
    }

    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        System.out.println("exitFieldDeclaration");
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        System.out.println("enterFieldDeclaration");
    }

    @Override
    public void exitBlockStatement(JavaParser.BlockStatementContext ctx) {
        System.out.println("exitBlockStatement");
    }

    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
        System.out.println("enterBlockStatement");
    }

    @Override
    public void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("exitLocalVariableDeclarationStatement");
    }

    @Override
    public void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        System.out.println("enterLocalVariableDeclarationStatement");
    }

    @Override
    public void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        System.out.println("exitInterfaceDeclaration");
    }

    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        System.out.println("enterInterfaceDeclaration");
    }

    @Override
    public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        System.out.println("exitPrimitiveType");
    }

    @Override
    public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        System.out.println("enterPrimitiveType");
    }

    @Override
    public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        System.out.println("exitImportDeclaration");
    }

    @Override
    public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        System.out.println("enterImportDeclaration");
    }

    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
        System.out.println("exitStatement");
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        System.out.println("enterStatement");
    }

    @Override
    public void exitEnumConstant(JavaParser.EnumConstantContext ctx) {
        System.out.println("exitEnumConstant");
    }

    @Override
    public void enterEnumConstant(JavaParser.EnumConstantContext ctx) {
        System.out.println("enterEnumConstant");
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("exitClassDeclaration");
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("enterClassDeclaration");
    }

    @Override
    public void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        System.out.println("exitGenericConstructorDeclaration");
    }

    @Override
    public void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        System.out.println("enterGenericConstructorDeclaration");
    }

    @Override
    public void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        System.out.println("exitTypeDeclaration");
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        System.out.println("enterTypeDeclaration");
    }

    @Override
    public void exitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        System.out.println("exitTypeArgument");
    }

    @Override
    public void enterTypeArgument(JavaParser.TypeArgumentContext ctx) {
        System.out.println("enterTypeArgument");
    }

    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
        System.out.println("exitMethodBody");
    }

    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        System.out.println("enterMethodBody");
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("exitMethodDeclaration");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("enterMethodDeclaration");
    }

    @Override
    public void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        System.out.println("exitInterfaceBody");
    }

    @Override
    public void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        System.out.println("enterInterfaceBody");
    }

    @Override
    public void exitTypeParameter(JavaParser.TypeParameterContext ctx) {
        System.out.println("exitTypeParameter");
    }

    @Override
    public void enterTypeParameter(JavaParser.TypeParameterContext ctx) {
        System.out.println("enterTypeParameter");
    }

    @Override
    public void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        System.out.println("exitSwitchBlockStatementGroup");
    }

    @Override
    public void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        System.out.println("enterSwitchBlockStatementGroup");
    }

    @Override
    public void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        System.out.println("exitAnnotationMethodRest");
    }

    @Override
    public void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        System.out.println("enterAnnotationMethodRest");
    }

    @Override
    public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        System.out.println("exitCompilationUnit");
    }

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        System.out.println("enterCompilationUnit");
    }

    @Override
    public void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        System.out.println("exitAnnotationTypeDeclaration");
    }

    @Override
    public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        System.out.println("enterAnnotationTypeDeclaration");
    }

    @Override
    public void exitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        System.out.println("exitFormalParameterList");
    }

    @Override
    public void enterFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        System.out.println("enterFormalParameterList");
    }

    @Override
    public void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        System.out.println("exitResourceSpecification");
    }

    @Override
    public void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        System.out.println("enterResourceSpecification");
    }

    @Override
    public void exitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        System.out.println("exitQualifiedName");
    }

    @Override
    public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        System.out.println("enterQualifiedName");
    }

    @Override
    public void exitResource(JavaParser.ResourceContext ctx) {
        System.out.println("exitResource");
    }

    @Override
    public void enterResource(JavaParser.ResourceContext ctx) {
        System.out.println("enterResource");
    }

    @Override
    public void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        System.out.println("exitConstDeclaration");
    }

    @Override
    public void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        System.out.println("enterConstDeclaration");
    }

    @Override
    public void exitElementValue(JavaParser.ElementValueContext ctx) {
        System.out.println("exitElementValue");
    }

    @Override
    public void enterElementValue(JavaParser.ElementValueContext ctx) {
        System.out.println("enterElementValue");
    }

    @Override
    public void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        System.out.println("exitArrayInitializer");
    }

    @Override
    public void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        System.out.println("enterArrayInitializer");
    }

    @Override
    public void exitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        System.out.println("exitElementValuePair");
    }

    @Override
    public void enterElementValuePair(JavaParser.ElementValuePairContext ctx) {
        System.out.println("enterElementValuePair");
    }

    @Override
    public void exitVariableModifier(JavaParser.VariableModifierContext ctx) {
        System.out.println("exitVariableModifier");
    }

    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        System.out.println("enterVariableModifier");
    }

    @Override
    public void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        System.out.println("exitExplicitGenericInvocationSuffix");
    }

    @Override
    public void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        System.out.println("enterExplicitGenericInvocationSuffix");
    }

    @Override
    public void exitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        System.out.println("exitInnerCreator");
    }

    @Override
    public void enterInnerCreator(JavaParser.InnerCreatorContext ctx) {
        System.out.println("enterInnerCreator");
    }

    @Override
    public void exitModifier(JavaParser.ModifierContext ctx) {
        System.out.println("exitModifier");
    }

    @Override
    public void enterModifier(JavaParser.ModifierContext ctx) {
        System.out.println("enterModifier");
    }

    @Override
    public void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        System.out.println("exitEnumConstantName");
    }

    @Override
    public void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        System.out.println("enterEnumConstantName");
    }

    @Override
    public void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        System.out.println("exitClassOrInterfaceModifier");
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        System.out.println("enterClassOrInterfaceModifier");
    }

    @Override
    public void exitCatchType(JavaParser.CatchTypeContext ctx) {
        System.out.println("exitCatchType");
    }

    @Override
    public void enterCatchType(JavaParser.CatchTypeContext ctx) {
        System.out.println("enterCatchType");
    }

    @Override
    public void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        System.out.println("exitVariableDeclarators");
    }

    @Override
    public void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        System.out.println("enterVariableDeclarators");
    }

    @Override
    public void exitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        System.out.println("exitSuperSuffix");
    }

    @Override
    public void enterSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        System.out.println("enterSuperSuffix");
    }

    @Override
    public void exitForControl(JavaParser.ForControlContext ctx) {
        System.out.println("exitForControl");
    }

    @Override
    public void enterForControl(JavaParser.ForControlContext ctx) {
        System.out.println("enterForControl");
    }

    @Override
    public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        System.out.println("exitConstructorDeclaration");
    }

    @Override
    public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        System.out.println("enterConstructorDeclaration");
    }

    @Override
    public void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        System.out.println("exitQualifiedNameList");
    }

    @Override
    public void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        System.out.println("enterQualifiedNameList");
    }

    @Override
    public void exitConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        System.out.println("exitConstantExpression");
    }

    @Override
    public void enterConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        System.out.println("enterConstantExpression");
    }

    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
        System.out.println("exitExpression");
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        System.out.println("enterExpression");
    }

    @Override
    public void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        System.out.println("exitArrayCreatorRest");
    }

    @Override
    public void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        System.out.println("enterArrayCreatorRest");
    }

    @Override
    public void exitCreator(JavaParser.CreatorContext ctx) {
        System.out.println("exitCreator");
    }

    @Override
    public void enterCreator(JavaParser.CreatorContext ctx) {
        System.out.println("enterCreator");
    }

    @Override
    public void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        System.out.println("exitElementValueArrayInitializer");
    }

    @Override
    public void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        System.out.println("enterElementValueArrayInitializer");
    }

    @Override
    public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        System.out.println("exitVariableInitializer");
    }

    @Override
    public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        System.out.println("enterVariableInitializer");
    }

    @Override
    public void exitAnnotation(JavaParser.AnnotationContext ctx) {
        System.out.println("exitAnnotation");
    }

    @Override
    public void enterAnnotation(JavaParser.AnnotationContext ctx) {
        System.out.println("enterAnnotation");
    }

    @Override
    public void exitParExpression(JavaParser.ParExpressionContext ctx) {
        System.out.println("exitParExpression");
    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        System.out.println("enterParExpression");
    }

    @Override
    public void exitFormalParameter(JavaParser.FormalParameterContext ctx) {
        System.out.println("exitFormalParameter");
    }

    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        System.out.println("enterFormalParameter");
    }

    @Override
    public void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        System.out.println("exitEnumDeclaration");
    }

    @Override
    public void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        System.out.println("enterEnumDeclaration");
    }

    @Override
    public void exitCreatedName(JavaParser.CreatedNameContext ctx) {
        System.out.println("exitCreatedName");
    }

    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
        System.out.println("enterCreatedName");
    }

    @Override
    public void exitClassBody(JavaParser.ClassBodyContext ctx) {
        System.out.println("exitClassBody");
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        System.out.println("enterClassBody");
    }

    @Override
    public void exitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        System.out.println("exitEnumConstants");
    }

    @Override
    public void enterEnumConstants(JavaParser.EnumConstantsContext ctx) {
        System.out.println("enterEnumConstants");
    }

    @Override
    public void exitTypeList(JavaParser.TypeListContext ctx) {
        System.out.println("exitTypeList");
    }

    @Override
    public void enterTypeList(JavaParser.TypeListContext ctx) {
        System.out.println("enterTypeList");
    }

    @Override
    public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        System.out.println("exitVariableDeclarator");
    }

    @Override
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        System.out.println("enterVariableDeclarator");
    }

    @Override
    public void exitCatchClause(JavaParser.CatchClauseContext ctx) {
        System.out.println("exitCatchClause");
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        System.out.println("enterCatchClause");
    }

    @Override
    public void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        System.out.println("exitAnnotationMethodOrConstantRest");
    }

    @Override
    public void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        System.out.println("enterAnnotationMethodOrConstantRest");
    }

    @Override
    public void exitLiteral(JavaParser.LiteralContext ctx) {
        System.out.println("exitLiteral");
    }

    @Override
    public void enterLiteral(JavaParser.LiteralContext ctx) {
        System.out.println("enterLiteral");
    }

    @Override
    public void exitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        System.out.println("exitConstructorBody");
    }

    @Override
    public void enterConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        System.out.println("enterConstructorBody");
    }

    @Override
    public void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        System.out.println("exitLastFormalParameter");
    }

    @Override
    public void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        System.out.println("enterLastFormalParameter");
    }

    @Override
    public void exitTypeParameters(JavaParser.TypeParametersContext ctx) {
        System.out.println("exitTypeParameters");
    }

    @Override
    public void enterTypeParameters(JavaParser.TypeParametersContext ctx) {
        System.out.println("enterTypeParameters");
    }

    @Override
    public void exitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        System.out.println("exitFinallyBlock");
    }

    @Override
    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        System.out.println("enterFinallyBlock");
    }

    @Override
    public void exitAnnotationName(JavaParser.AnnotationNameContext ctx) {
        System.out.println("exitAnnotationName");
    }

    @Override
    public void enterAnnotationName(JavaParser.AnnotationNameContext ctx) {
        System.out.println("enterAnnotationName");
    }

    @Override
    public void exitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        System.out.println("exitTypeArguments");
    }

    @Override
    public void enterTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        System.out.println("enterTypeArguments");
    }

    @Override
    public void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        System.out.println("exitInterfaceBodyDeclaration");
    }

    @Override
    public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        System.out.println("enterInterfaceBodyDeclaration");
    }

    @Override
    public void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        System.out.println("exitClassCreatorRest");
    }

    @Override
    public void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        System.out.println("enterClassCreatorRest");
    }

    @Override
    public void exitPrimary(JavaParser.PrimaryContext ctx) {
        System.out.println("exitPrimary");
    }

    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
        System.out.println("enterPrimary");
    }

    @Override
    public void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        System.out.println("exitVariableDeclaratorId");
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        System.out.println("enterVariableDeclaratorId");
    }

    @Override
    public void exitTypeBound(JavaParser.TypeBoundContext ctx) {
        System.out.println("exitTypeBound");
    }

    @Override
    public void enterTypeBound(JavaParser.TypeBoundContext ctx) {
        System.out.println("enterTypeBound");
    }

    @Override
    public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        System.out.println("exitClassOrInterfaceType");
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        System.out.println("enterClassOrInterfaceType");
    }

    @Override
    public void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        System.out.println("exitAnnotationTypeElementRest");
    }

    @Override
    public void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        System.out.println("enterAnnotationTypeElementRest");
    }

    @Override
    public void exitExpressionList(JavaParser.ExpressionListContext ctx) {
        System.out.println("exitExpressionList");
    }

    @Override
    public void enterExpressionList(JavaParser.ExpressionListContext ctx) {
        System.out.println("enterExpressionList");
    }

    @Override
    public void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        System.out.println("exitNonWildcardTypeArgumentsOrDiamond");
    }

    @Override
    public void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        System.out.println("enterNonWildcardTypeArgumentsOrDiamond");
    }

    @Override
    public void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        System.out.println("exitExplicitGenericInvocation");
    }

    @Override
    public void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        System.out.println("enterExplicitGenericInvocation");
    }

    @Override
    public void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        System.out.println("exitAnnotationConstantRest");
    }

    @Override
    public void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        System.out.println("enterAnnotationConstantRest");
    }

    @Override
    public void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        System.out.println("exitEnhancedForControl");
    }

    @Override
    public void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        System.out.println("enterEnhancedForControl");
    }

    @Override
    public void exitForUpdate(JavaParser.ForUpdateContext ctx) {
        System.out.println("exitForUpdate");
    }

    @Override
    public void enterForUpdate(JavaParser.ForUpdateContext ctx) {
        System.out.println("enterForUpdate");
    }

    @Override
    public void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        System.out.println("exitEnumBodyDeclarations");
    }

    @Override
    public void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        System.out.println("enterEnumBodyDeclarations");
    }

    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
        System.out.println("exitBlock");
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        System.out.println("enterBlock");
    }

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        System.out.println("exitClassBodyDeclaration");
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        System.out.println("enterClassBodyDeclaration");
    }

    @Override
    public void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        System.out.println("exitGenericInterfaceMethodDeclaration");
    }

    @Override
    public void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        System.out.println("enterGenericInterfaceMethodDeclaration");
    }

    @Override
    public void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        System.out.println("exitAnnotationTypeBody");
    }

    @Override
    public void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        System.out.println("enterAnnotationTypeBody");
    }

    @Override
    public void exitType(JavaParser.TypeContext ctx) {
        System.out.println("exitType");
    }

    @Override
    public void enterType(JavaParser.TypeContext ctx) {
        System.out.println("enterType");
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        System.out.println("exitAnnotationTypeElementDeclaration");
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        System.out.println("enterAnnotationTypeElementDeclaration");
    }

    @Override
    public void exitDefaultValue(JavaParser.DefaultValueContext ctx) {
        System.out.println("exitDefaultValue");
    }

    @Override
    public void enterDefaultValue(JavaParser.DefaultValueContext ctx) {
        System.out.println("enterDefaultValue");
    }

    @Override
    public void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        System.out.println("exitMemberDeclaration");
    }

    @Override
    public void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        System.out.println("enterMemberDeclaration");
    }

}
