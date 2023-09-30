package cn.yangtuooc.evaluator;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTNodeVisitor;
import cn.yangtuooc.ast.ASTType;

public class AdditiveEvaluator implements ASTNodeVisitor<Integer> {

  @Override
  public Integer visit(ASTNode node) {
    if (ASTType.PLUS != node.getType()) {
      throw new EvaluatorException("expecting '+', but got: " + node.getType());
    }
    int result = 0;
    for (ASTNode child : node.getChildren()) {
      if (isOperation(child)) {
        result += priorityOperation(child);
        continue;
      }
      int value = Integer.parseInt(child.getValue());
      result = result + value;
    }
    return result;
  }

  private boolean isOperation(ASTNode node) {
    return ASTType.PLUS == node.getType() || ASTType.MUL == node.getType();
  }

  private Integer priorityOperation(ASTNode node) {
    return switch (node.getType()) {
      case PLUS -> new AdditiveEvaluator().visit(node);
      case MUL -> new MultiplicationEvaluator().visit(node);
      default -> throw new EvaluatorException(STR. "unsupported operation: '\{ node.getType() }'" );
    };
  }
}

