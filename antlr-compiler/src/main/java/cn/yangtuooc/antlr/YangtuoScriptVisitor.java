package cn.yangtuooc.antlr;
// Generated from YangtuoScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YangtuoScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YangtuoScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(YangtuoScriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YangtuoScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(YangtuoScriptParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(YangtuoScriptParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(YangtuoScriptParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(YangtuoScriptParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YangtuoScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(YangtuoScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(YangtuoScriptParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(YangtuoScriptParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(YangtuoScriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link YangtuoScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(YangtuoScriptParser.PrimaryContext ctx);
}