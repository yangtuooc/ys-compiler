package cn.yangtuooc.evaluator;

import cn.yangtuooc.antlr.YangtuoScriptBaseVisitor;
import cn.yangtuooc.antlr.YangtuoScriptParser.AdditiveExpressionContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.DivisionExpressionContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.ExpressionContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.IntegerLiteralContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.LiteralContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.MultiplicativeExpressionContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.PrimaryContext;
import cn.yangtuooc.antlr.YangtuoScriptParser.SubtractionExpressionContext;

public class YangtuoScriptEvaluator extends YangtuoScriptBaseVisitor<Integer> {

  @Override
  public Integer visitAdditiveExpression(AdditiveExpressionContext ctx) {
    if (ctx.ADD() != null) {
      Integer left = visitAdditiveExpression(ctx.additiveExpression());
      if (ctx.multiplicativeExpression() != null) {
        Integer right = visitMultiplicativeExpression(ctx.multiplicativeExpression());
        return left + right;
      }
      if (ctx.divisionExpression() != null) {
        Integer right = visitDivisionExpression(ctx.divisionExpression());
        return left + right;
      }
    }
    if (ctx.multiplicativeExpression() != null) {
      return visitMultiplicativeExpression(ctx.multiplicativeExpression());
    }
    if (ctx.divisionExpression() != null) {
      return visitDivisionExpression(ctx.divisionExpression());
    }
    throw new RuntimeException("syntax: unexpected operation: " + ctx);
  }

  @Override
  public Integer visitSubtractionExpression(SubtractionExpressionContext ctx) {
    if (ctx.SUB() != null) {
      Integer left = visitSubtractionExpression(ctx.subtractionExpression());
      if (ctx.multiplicativeExpression().MUL() != null) {
        Integer right = visitMultiplicativeExpression(ctx.multiplicativeExpression());
        return left - right;
      }
      if (ctx.divisionExpression().DIV() != null) {
        Integer right = visitDivisionExpression(ctx.divisionExpression());
        return left - right;
      }
    }
    if (ctx.multiplicativeExpression().MUL() != null) {
      return visitMultiplicativeExpression(ctx.multiplicativeExpression());
    }
    if (ctx.divisionExpression().DIV() != null) {
      return visitDivisionExpression(ctx.divisionExpression());
    }
    throw new RuntimeException("syntax: unexpected operation: " + ctx);
  }

  @Override
  public Integer visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
    if (ctx.MUL() != null) {
      Integer left = visitMultiplicativeExpression(ctx.multiplicativeExpression());
      Integer right = visitPrimary(ctx.primary());
      return left * right;
    }
    return visitPrimary(ctx.primary());
  }

  @Override
  public Integer visitDivisionExpression(DivisionExpressionContext ctx) {
    if (ctx.DIV() != null) {
      Integer left = visitDivisionExpression(ctx.divisionExpression());
      Integer right = visitPrimary(ctx.primary());
      return left / right;
    }
    return visitPrimary(ctx.primary());
  }

  @Override
  public Integer visitPrimary(PrimaryContext ctx) {
    if (ctx.LPAREN() != null && ctx.LPAREN() != null) {
      return visitExpression(ctx.expression());
    }
    if (ctx.identifier() != null) {
      return visitIdentifier(ctx.identifier());
    }
    return visitLiteral(ctx.literal());
  }

  @Override
  public Integer visitLiteral(LiteralContext ctx) {
    if (ctx.integerLiteral() != null) {
      IntegerLiteralContext integerLiteral = ctx.integerLiteral();
      if (integerLiteral.DECIMAL_LITERAL() != null) {
        return Integer.valueOf(integerLiteral.getText());
      }
    }
    throw new RuntimeException("unsupported type: " + ctx);
  }

  @Override
  public Integer visitExpression(ExpressionContext ctx) {
    if (ctx.additiveExpression() != null) {
      return visitAdditiveExpression(ctx.additiveExpression());
    }
    if (ctx.subtractionExpression() != null) {
      return visitSubtractionExpression(ctx.subtractionExpression());
    }
    if (ctx.multiplicativeExpression() != null) {
      return visitMultiplicativeExpression(ctx.multiplicativeExpression());
    }
    if (ctx.divisionExpression() != null) {
      return visitDivisionExpression(ctx.divisionExpression());
    }
    throw new RuntimeException("syntax error: unexpected operation: " + ctx);
  }
}
