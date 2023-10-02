package cn.yangtuooc.evaluator;

import cn.yangtuooc.antlr.YangtuoScriptBaseVisitor;
import cn.yangtuooc.antlr.YangtuoScriptParser.ExpressionContext;

public class YangtuoScriptEvaluator extends YangtuoScriptBaseVisitor<Object> {

  @Override
  public Object visitExpression(ExpressionContext ctx) {
    // binary operation
    if (ctx.bop != null && ctx.expression().size() >= 2) {
      // TODO
    }
    return 0;
  }
}
