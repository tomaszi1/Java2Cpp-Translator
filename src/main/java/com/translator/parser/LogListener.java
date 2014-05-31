
package com.translator.parser;

import java.util.logging.Logger;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LogListener extends JavaBaseListener {

    private static final Logger LOG = Logger.getLogger(LogListener.class.getName());

    @Override
    public void visitErrorNode(ErrorNode node) {
        LOG.info("visitErrorNode");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        //LOG.info("visitTerminal");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        //LOG.info("exitEveryRule");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        //LOG.info("enterEveryRule");
    }

    @Override
    public void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        LOG.info("exitTypeArgumentsOrDiamond");
    }

    @Override
    public void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        LOG.info("enterTypeArgumentsOrDiamond");
    }

    @Override
    public void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        LOG.info("exitGenericMethodDeclaration");
    }

    @Override
    public void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        LOG.info("enterGenericMethodDeclaration");
    }

    @Override
    public void exitArguments(JavaParser.ArgumentsContext ctx) {
        LOG.info("exitArguments");
    }

    @Override
    public void enterArguments(JavaParser.ArgumentsContext ctx) {
        LOG.info("enterArguments");
    }

    @Override
    public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
        LOG.info("exitFormalParameters");
    }

    @Override
    public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
        LOG.info("enterFormalParameters");
    }

    @Override
    public void exitForInit(JavaParser.ForInitContext ctx) {
        LOG.info("exitForInit");
    }

    @Override
    public void enterForInit(JavaParser.ForInitContext ctx) {
        LOG.info("enterForInit");
    }

    @Override
    public void exitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        LOG.info("exitSwitchLabel");
    }

    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        LOG.info("enterSwitchLabel");
    }

    @Override
    public void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        LOG.info("exitInterfaceMemberDeclaration");
    }

    @Override
    public void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        LOG.info("enterInterfaceMemberDeclaration");
    }

    @Override
    public void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        LOG.info("exitNonWildcardTypeArguments");
    }

    @Override
    public void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        LOG.info("enterNonWildcardTypeArguments");
    }

    @Override
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        LOG.info("exitLocalVariableDeclaration");
    }

    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        LOG.info("enterLocalVariableDeclaration");
    }

    @Override
    public void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        LOG.info("exitElementValuePairs");
    }

    @Override
    public void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        LOG.info("enterElementValuePairs");
    }

    @Override
    public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        LOG.info("exitPackageDeclaration");
    }

    @Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        LOG.info("enterPackageDeclaration");
    }

    @Override
    public void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        LOG.info("exitInterfaceMethodDeclaration");
    }

    @Override
    public void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        LOG.info("enterInterfaceMethodDeclaration");
    }

    @Override
    public void exitStatementExpression(JavaParser.StatementExpressionContext ctx) {
        LOG.info("exitStatementExpression");
    }

    @Override
    public void enterStatementExpression(JavaParser.StatementExpressionContext ctx) {
        LOG.info("enterStatementExpression");
    }

    @Override
    public void exitResources(JavaParser.ResourcesContext ctx) {
        LOG.info("exitResources");
    }

    @Override
    public void enterResources(JavaParser.ResourcesContext ctx) {
        LOG.info("enterResources");
    }

    @Override
    public void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        LOG.info("exitConstantDeclarator");
    }

    @Override
    public void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        LOG.info("enterConstantDeclarator");
    }

    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        LOG.info("exitFieldDeclaration");
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        LOG.info("enterFieldDeclaration");
    }

    @Override
    public void exitBlockStatement(JavaParser.BlockStatementContext ctx) {
        LOG.info("exitBlockStatement");
    }

    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
        LOG.info("enterBlockStatement");
    }

    @Override
    public void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        LOG.info("exitLocalVariableDeclarationStatement");
    }

    @Override
    public void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        LOG.info("enterLocalVariableDeclarationStatement");
    }

    @Override
    public void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        LOG.info("exitInterfaceDeclaration");
    }

    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        LOG.info("enterInterfaceDeclaration");
    }

    @Override
    public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        LOG.info("exitPrimitiveType");
    }

    @Override
    public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        LOG.info("enterPrimitiveType");
    }

    @Override
    public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        LOG.info("exitImportDeclaration");
    }

    @Override
    public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        LOG.info("enterImportDeclaration");
    }

    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
        LOG.info("exitStatement");
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        LOG.info("enterStatement");
    }

    @Override
    public void exitEnumConstant(JavaParser.EnumConstantContext ctx) {
        LOG.info("exitEnumConstant");
    }

    @Override
    public void enterEnumConstant(JavaParser.EnumConstantContext ctx) {
        LOG.info("enterEnumConstant");
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        LOG.info("exitClassDeclaration");
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        LOG.info("enterClassDeclaration");
    }

    @Override
    public void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        LOG.info("exitGenericConstructorDeclaration");
    }

    @Override
    public void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        LOG.info("enterGenericConstructorDeclaration");
    }

    @Override
    public void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        LOG.info("exitTypeDeclaration");
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        LOG.info("enterTypeDeclaration");
    }

    @Override
    public void exitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        LOG.info("exitTypeArgument");
    }

    @Override
    public void enterTypeArgument(JavaParser.TypeArgumentContext ctx) {
        LOG.info("enterTypeArgument");
    }

    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
        LOG.info("exitMethodBody");
    }

    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        LOG.info("enterMethodBody");
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        LOG.info("exitMethodDeclaration");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        LOG.info("enterMethodDeclaration");
    }

    @Override
    public void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        LOG.info("exitInterfaceBody");
    }

    @Override
    public void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        LOG.info("enterInterfaceBody");
    }

    @Override
    public void exitTypeParameter(JavaParser.TypeParameterContext ctx) {
        LOG.info("exitTypeParameter");
    }

    @Override
    public void enterTypeParameter(JavaParser.TypeParameterContext ctx) {
        LOG.info("enterTypeParameter");
    }

    @Override
    public void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        LOG.info("exitSwitchBlockStatementGroup");
    }

    @Override
    public void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        LOG.info("enterSwitchBlockStatementGroup");
    }

    @Override
    public void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        LOG.info("exitAnnotationMethodRest");
    }

    @Override
    public void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        LOG.info("enterAnnotationMethodRest");
    }

    @Override
    public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        LOG.info("exitCompilationUnit");
    }

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        LOG.info("enterCompilationUnit");
    }

    @Override
    public void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        LOG.info("exitAnnotationTypeDeclaration");
    }

    @Override
    public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        LOG.info("enterAnnotationTypeDeclaration");
    }

    @Override
    public void exitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        LOG.info("exitFormalParameterList");
    }

    @Override
    public void enterFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        LOG.info("enterFormalParameterList");
    }

    @Override
    public void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        LOG.info("exitResourceSpecification");
    }

    @Override
    public void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        LOG.info("enterResourceSpecification");
    }

    @Override
    public void exitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        LOG.info("exitQualifiedName");
    }

    @Override
    public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        LOG.info("enterQualifiedName");
    }

    @Override
    public void exitResource(JavaParser.ResourceContext ctx) {
        LOG.info("exitResource");
    }

    @Override
    public void enterResource(JavaParser.ResourceContext ctx) {
        LOG.info("enterResource");
    }

    @Override
    public void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        LOG.info("exitConstDeclaration");
    }

    @Override
    public void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        LOG.info("enterConstDeclaration");
    }

    @Override
    public void exitElementValue(JavaParser.ElementValueContext ctx) {
        LOG.info("exitElementValue");
    }

    @Override
    public void enterElementValue(JavaParser.ElementValueContext ctx) {
        LOG.info("enterElementValue");
    }

    @Override
    public void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        LOG.info("exitArrayInitializer");
    }

    @Override
    public void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        LOG.info("enterArrayInitializer");
    }

    @Override
    public void exitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        LOG.info("exitElementValuePair");
    }

    @Override
    public void enterElementValuePair(JavaParser.ElementValuePairContext ctx) {
        LOG.info("enterElementValuePair");
    }

    @Override
    public void exitVariableModifier(JavaParser.VariableModifierContext ctx) {
        LOG.info("exitVariableModifier");
    }

    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        LOG.info("enterVariableModifier");
    }

    @Override
    public void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        LOG.info("exitExplicitGenericInvocationSuffix");
    }

    @Override
    public void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        LOG.info("enterExplicitGenericInvocationSuffix");
    }

    @Override
    public void exitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        LOG.info("exitInnerCreator");
    }

    @Override
    public void enterInnerCreator(JavaParser.InnerCreatorContext ctx) {
        LOG.info("enterInnerCreator");
    }

    @Override
    public void exitModifier(JavaParser.ModifierContext ctx) {
        LOG.info("exitModifier");
    }

    @Override
    public void enterModifier(JavaParser.ModifierContext ctx) {
        LOG.info("enterModifier");
    }

    @Override
    public void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        LOG.info("exitEnumConstantName");
    }

    @Override
    public void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        LOG.info("enterEnumConstantName");
    }

    @Override
    public void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        LOG.info("exitClassOrInterfaceModifier");
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        LOG.info("enterClassOrInterfaceModifier");
    }

    @Override
    public void exitCatchType(JavaParser.CatchTypeContext ctx) {
        LOG.info("exitCatchType");
    }

    @Override
    public void enterCatchType(JavaParser.CatchTypeContext ctx) {
        LOG.info("enterCatchType");
    }

    @Override
    public void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        LOG.info("exitVariableDeclarators");
    }

    @Override
    public void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        LOG.info("enterVariableDeclarators");
    }

    @Override
    public void exitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        LOG.info("exitSuperSuffix");
    }

    @Override
    public void enterSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        LOG.info("enterSuperSuffix");
    }

    @Override
    public void exitForControl(JavaParser.ForControlContext ctx) {
        LOG.info("exitForControl");
    }

    @Override
    public void enterForControl(JavaParser.ForControlContext ctx) {
        LOG.info("enterForControl");
    }

    @Override
    public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        LOG.info("exitConstructorDeclaration");
    }

    @Override
    public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        LOG.info("enterConstructorDeclaration");
    }

    @Override
    public void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        LOG.info("exitQualifiedNameList");
    }

    @Override
    public void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        LOG.info("enterQualifiedNameList");
    }

    @Override
    public void exitConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        LOG.info("exitConstantExpression");
    }

    @Override
    public void enterConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        LOG.info("enterConstantExpression");
    }

    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
        LOG.info("exitExpression");
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        LOG.info("enterExpression");
    }

    @Override
    public void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        LOG.info("exitArrayCreatorRest");
    }

    @Override
    public void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        LOG.info("enterArrayCreatorRest");
    }

    @Override
    public void exitCreator(JavaParser.CreatorContext ctx) {
        LOG.info("exitCreator");
    }

    @Override
    public void enterCreator(JavaParser.CreatorContext ctx) {
        LOG.info("enterCreator");
    }

    @Override
    public void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        LOG.info("exitElementValueArrayInitializer");
    }

    @Override
    public void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        LOG.info("enterElementValueArrayInitializer");
    }

    @Override
    public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        LOG.info("exitVariableInitializer");
    }

    @Override
    public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        LOG.info("enterVariableInitializer");
    }

    @Override
    public void exitAnnotation(JavaParser.AnnotationContext ctx) {
        LOG.info("exitAnnotation");
    }

    @Override
    public void enterAnnotation(JavaParser.AnnotationContext ctx) {
        LOG.info("enterAnnotation");
    }

    @Override
    public void exitParExpression(JavaParser.ParExpressionContext ctx) {
        LOG.info("exitParExpression");
    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        LOG.info("enterParExpression");
    }

    @Override
    public void exitFormalParameter(JavaParser.FormalParameterContext ctx) {
        LOG.info("exitFormalParameter");
    }

    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        LOG.info("enterFormalParameter");
    }

    @Override
    public void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        LOG.info("exitEnumDeclaration");
    }

    @Override
    public void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        LOG.info("enterEnumDeclaration");
    }

    @Override
    public void exitCreatedName(JavaParser.CreatedNameContext ctx) {
        LOG.info("exitCreatedName");
    }

    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
        LOG.info("enterCreatedName");
    }

    @Override
    public void exitClassBody(JavaParser.ClassBodyContext ctx) {
        LOG.info("exitClassBody");
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        LOG.info("enterClassBody");
    }

    @Override
    public void exitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        LOG.info("exitEnumConstants");
    }

    @Override
    public void enterEnumConstants(JavaParser.EnumConstantsContext ctx) {
        LOG.info("enterEnumConstants");
    }

    @Override
    public void exitTypeList(JavaParser.TypeListContext ctx) {
        LOG.info("exitTypeList");
    }

    @Override
    public void enterTypeList(JavaParser.TypeListContext ctx) {
        LOG.info("enterTypeList");
    }

    @Override
    public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        LOG.info("exitVariableDeclarator");
    }

    @Override
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        LOG.info("enterVariableDeclarator");
    }

    @Override
    public void exitCatchClause(JavaParser.CatchClauseContext ctx) {
        LOG.info("exitCatchClause");
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        LOG.info("enterCatchClause");
    }

    @Override
    public void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        LOG.info("exitAnnotationMethodOrConstantRest");
    }

    @Override
    public void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        LOG.info("enterAnnotationMethodOrConstantRest");
    }

    @Override
    public void exitLiteral(JavaParser.LiteralContext ctx) {
        LOG.info("exitLiteral");
    }

    @Override
    public void enterLiteral(JavaParser.LiteralContext ctx) {
        LOG.info("enterLiteral");
    }

    @Override
    public void exitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        LOG.info("exitConstructorBody");
    }

    @Override
    public void enterConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        LOG.info("enterConstructorBody");
    }

    @Override
    public void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        LOG.info("exitLastFormalParameter");
    }

    @Override
    public void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        LOG.info("enterLastFormalParameter");
    }

    @Override
    public void exitTypeParameters(JavaParser.TypeParametersContext ctx) {
        LOG.info("exitTypeParameters");
    }

    @Override
    public void enterTypeParameters(JavaParser.TypeParametersContext ctx) {
        LOG.info("enterTypeParameters");
    }

    @Override
    public void exitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        LOG.info("exitFinallyBlock");
    }

    @Override
    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        LOG.info("enterFinallyBlock");
    }

    @Override
    public void exitAnnotationName(JavaParser.AnnotationNameContext ctx) {
        LOG.info("exitAnnotationName");
    }

    @Override
    public void enterAnnotationName(JavaParser.AnnotationNameContext ctx) {
        LOG.info("enterAnnotationName");
    }

    @Override
    public void exitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        LOG.info("exitTypeArguments");
    }

    @Override
    public void enterTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        LOG.info("enterTypeArguments");
    }

    @Override
    public void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        LOG.info("exitInterfaceBodyDeclaration");
    }

    @Override
    public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        LOG.info("enterInterfaceBodyDeclaration");
    }

    @Override
    public void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        LOG.info("exitClassCreatorRest");
    }

    @Override
    public void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        LOG.info("enterClassCreatorRest");
    }

    @Override
    public void exitPrimary(JavaParser.PrimaryContext ctx) {
        LOG.info("exitPrimary");
    }

    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
        LOG.info("enterPrimary");
    }

    @Override
    public void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        LOG.info("exitVariableDeclaratorId");
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        LOG.info("enterVariableDeclaratorId");
    }

    @Override
    public void exitTypeBound(JavaParser.TypeBoundContext ctx) {
        LOG.info("exitTypeBound");
    }

    @Override
    public void enterTypeBound(JavaParser.TypeBoundContext ctx) {
        LOG.info("enterTypeBound");
    }

    @Override
    public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        LOG.info("exitClassOrInterfaceType");
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        LOG.info("enterClassOrInterfaceType");
    }

    @Override
    public void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        LOG.info("exitAnnotationTypeElementRest");
    }

    @Override
    public void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        LOG.info("enterAnnotationTypeElementRest");
    }

    @Override
    public void exitExpressionList(JavaParser.ExpressionListContext ctx) {
        LOG.info("exitExpressionList");
    }

    @Override
    public void enterExpressionList(JavaParser.ExpressionListContext ctx) {
        LOG.info("enterExpressionList");
    }

    @Override
    public void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        LOG.info("exitNonWildcardTypeArgumentsOrDiamond");
    }

    @Override
    public void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        LOG.info("enterNonWildcardTypeArgumentsOrDiamond");
    }

    @Override
    public void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        LOG.info("exitExplicitGenericInvocation");
    }

    @Override
    public void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        LOG.info("enterExplicitGenericInvocation");
    }

    @Override
    public void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        LOG.info("exitAnnotationConstantRest");
    }

    @Override
    public void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        LOG.info("enterAnnotationConstantRest");
    }

    @Override
    public void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        LOG.info("exitEnhancedForControl");
    }

    @Override
    public void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        LOG.info("enterEnhancedForControl");
    }

    @Override
    public void exitForUpdate(JavaParser.ForUpdateContext ctx) {
        LOG.info("exitForUpdate");
    }

    @Override
    public void enterForUpdate(JavaParser.ForUpdateContext ctx) {
        LOG.info("enterForUpdate");
    }

    @Override
    public void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        LOG.info("exitEnumBodyDeclarations");
    }

    @Override
    public void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        LOG.info("enterEnumBodyDeclarations");
    }

    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
        LOG.info("exitBlock");
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        LOG.info("enterBlock");
    }

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        LOG.info("exitClassBodyDeclaration");
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        LOG.info("enterClassBodyDeclaration");
    }

    @Override
    public void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        LOG.info("exitGenericInterfaceMethodDeclaration");
    }

    @Override
    public void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        LOG.info("enterGenericInterfaceMethodDeclaration");
    }

    @Override
    public void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        LOG.info("exitAnnotationTypeBody");
    }

    @Override
    public void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        LOG.info("enterAnnotationTypeBody");
    }

    @Override
    public void exitType(JavaParser.TypeContext ctx) {
        LOG.info("exitType");
    }

    @Override
    public void enterType(JavaParser.TypeContext ctx) {
        LOG.info("enterType");
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        LOG.info("exitAnnotationTypeElementDeclaration");
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        LOG.info("enterAnnotationTypeElementDeclaration");
    }

    @Override
    public void exitDefaultValue(JavaParser.DefaultValueContext ctx) {
        LOG.info("exitDefaultValue");
    }

    @Override
    public void enterDefaultValue(JavaParser.DefaultValueContext ctx) {
        LOG.info("enterDefaultValue");
    }

    @Override
    public void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        LOG.info("exitMemberDeclaration");
    }

    @Override
    public void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        LOG.info("enterMemberDeclaration");
    }

}
