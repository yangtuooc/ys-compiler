package cn.yangtuooc.antlr;
// Generated from YangtuoScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YangtuoScriptParser}.
 */
public interface YangtuoScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(YangtuoScriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(YangtuoScriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(YangtuoScriptParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(YangtuoScriptParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(YangtuoScriptParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(YangtuoScriptParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(YangtuoScriptParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(YangtuoScriptParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(YangtuoScriptParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(YangtuoScriptParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(YangtuoScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(YangtuoScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(YangtuoScriptParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(YangtuoScriptParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(YangtuoScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(YangtuoScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(YangtuoScriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(YangtuoScriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(YangtuoScriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(YangtuoScriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(YangtuoScriptParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(YangtuoScriptParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(YangtuoScriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(YangtuoScriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(YangtuoScriptParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(YangtuoScriptParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(YangtuoScriptParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(YangtuoScriptParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(YangtuoScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(YangtuoScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(YangtuoScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(YangtuoScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(YangtuoScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(YangtuoScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(YangtuoScriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(YangtuoScriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(YangtuoScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(YangtuoScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(YangtuoScriptParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(YangtuoScriptParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(YangtuoScriptParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(YangtuoScriptParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(YangtuoScriptParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(YangtuoScriptParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(YangtuoScriptParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(YangtuoScriptParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(YangtuoScriptParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(YangtuoScriptParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(YangtuoScriptParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(YangtuoScriptParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(YangtuoScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(YangtuoScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactConstructorDeclaration(YangtuoScriptParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactConstructorDeclaration(YangtuoScriptParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(YangtuoScriptParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(YangtuoScriptParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(YangtuoScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(YangtuoScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(YangtuoScriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(YangtuoScriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(YangtuoScriptParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(YangtuoScriptParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(YangtuoScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(YangtuoScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(YangtuoScriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(YangtuoScriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(YangtuoScriptParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(YangtuoScriptParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(YangtuoScriptParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(YangtuoScriptParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(YangtuoScriptParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(YangtuoScriptParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(YangtuoScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(YangtuoScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(YangtuoScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(YangtuoScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(YangtuoScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(YangtuoScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(YangtuoScriptParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(YangtuoScriptParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(YangtuoScriptParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(YangtuoScriptParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(YangtuoScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(YangtuoScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(YangtuoScriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(YangtuoScriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(YangtuoScriptParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(YangtuoScriptParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(YangtuoScriptParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(YangtuoScriptParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(YangtuoScriptParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(YangtuoScriptParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(YangtuoScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(YangtuoScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(YangtuoScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(YangtuoScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(YangtuoScriptParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(YangtuoScriptParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(YangtuoScriptParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(YangtuoScriptParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(YangtuoScriptParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(YangtuoScriptParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(YangtuoScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(YangtuoScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(YangtuoScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(YangtuoScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(YangtuoScriptParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(YangtuoScriptParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(YangtuoScriptParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(YangtuoScriptParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(YangtuoScriptParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(YangtuoScriptParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(YangtuoScriptParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(YangtuoScriptParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(YangtuoScriptParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(YangtuoScriptParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(YangtuoScriptParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(YangtuoScriptParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(YangtuoScriptParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(YangtuoScriptParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(YangtuoScriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(YangtuoScriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(YangtuoScriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(YangtuoScriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(YangtuoScriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(YangtuoScriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(YangtuoScriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(YangtuoScriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(YangtuoScriptParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(YangtuoScriptParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(YangtuoScriptParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(YangtuoScriptParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(YangtuoScriptParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(YangtuoScriptParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(YangtuoScriptParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(YangtuoScriptParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(YangtuoScriptParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(YangtuoScriptParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(YangtuoScriptParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(YangtuoScriptParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(YangtuoScriptParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(YangtuoScriptParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(YangtuoScriptParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(YangtuoScriptParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(YangtuoScriptParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(YangtuoScriptParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(YangtuoScriptParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(YangtuoScriptParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(YangtuoScriptParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(YangtuoScriptParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(YangtuoScriptParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(YangtuoScriptParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(YangtuoScriptParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(YangtuoScriptParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(YangtuoScriptParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(YangtuoScriptParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YangtuoScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YangtuoScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(YangtuoScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(YangtuoScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(YangtuoScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(YangtuoScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(YangtuoScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(YangtuoScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(YangtuoScriptParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(YangtuoScriptParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(YangtuoScriptParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(YangtuoScriptParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YangtuoScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YangtuoScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(YangtuoScriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(YangtuoScriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(YangtuoScriptParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(YangtuoScriptParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(YangtuoScriptParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(YangtuoScriptParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(YangtuoScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(YangtuoScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(YangtuoScriptParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(YangtuoScriptParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(YangtuoScriptParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(YangtuoScriptParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(YangtuoScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(YangtuoScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(YangtuoScriptParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(YangtuoScriptParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(YangtuoScriptParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(YangtuoScriptParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(YangtuoScriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(YangtuoScriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(YangtuoScriptParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(YangtuoScriptParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(YangtuoScriptParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(YangtuoScriptParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(YangtuoScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(YangtuoScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(YangtuoScriptParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(YangtuoScriptParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YangtuoScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YangtuoScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(YangtuoScriptParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(YangtuoScriptParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(YangtuoScriptParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(YangtuoScriptParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(YangtuoScriptParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(YangtuoScriptParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(YangtuoScriptParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(YangtuoScriptParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(YangtuoScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(YangtuoScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(YangtuoScriptParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(YangtuoScriptParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(YangtuoScriptParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(YangtuoScriptParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(YangtuoScriptParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(YangtuoScriptParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(YangtuoScriptParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(YangtuoScriptParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(YangtuoScriptParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(YangtuoScriptParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(YangtuoScriptParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(YangtuoScriptParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(YangtuoScriptParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(YangtuoScriptParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(YangtuoScriptParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(YangtuoScriptParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(YangtuoScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(YangtuoScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(YangtuoScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(YangtuoScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(YangtuoScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(YangtuoScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(YangtuoScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(YangtuoScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(YangtuoScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(YangtuoScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(YangtuoScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(YangtuoScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(YangtuoScriptParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(YangtuoScriptParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(YangtuoScriptParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(YangtuoScriptParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(YangtuoScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(YangtuoScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(YangtuoScriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(YangtuoScriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(YangtuoScriptParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(YangtuoScriptParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(YangtuoScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(YangtuoScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(YangtuoScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(YangtuoScriptParser.ArgumentsContext ctx);
}