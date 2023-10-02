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