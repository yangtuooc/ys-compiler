package cn.yangtuooc.antlr;
// Generated from YangtuoScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YangtuoScriptParser}.
 */
public interface YangtuoScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(YangtuoScriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(YangtuoScriptParser.ProgContext ctx);
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
	 * Enter a parse tree produced by {@link YangtuoScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(YangtuoScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(YangtuoScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#subtractionExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(YangtuoScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#subtractionExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(YangtuoScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(YangtuoScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(YangtuoScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YangtuoScriptParser#divisionExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(YangtuoScriptParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#divisionExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(YangtuoScriptParser.DivisionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link YangtuoScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(YangtuoScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link YangtuoScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(YangtuoScriptParser.PrimaryContext ctx);
}