package cn.yangtuooc.evaluator;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTNodeVisitor;

public class SimpleEvaluator implements ASTNodeVisitor<Integer> {

  @Override
  public Integer visit(ASTNode node) {
    int result = 0;
    for (ASTNode child : node.getChildren()) {
      switch (child.getType()) {
        case ASSIGNMENT -> result = new AssignmentEvaluator().visit(child);
        case PLUS -> result = new AdditiveEvaluator().visit(child);
        case MUL -> result = new MultiplicationEvaluator().visit(child);
        default -> throw new EvaluatorException(STR. "unsupported operation: \{ child.getType() }" );
      }
    }
    return result;
  }
}
