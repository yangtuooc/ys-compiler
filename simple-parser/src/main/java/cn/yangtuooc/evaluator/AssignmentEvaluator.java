package cn.yangtuooc.evaluator;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTNodeVisitor;
import cn.yangtuooc.ast.ASTType;
import cn.yangtuooc.exception.SyntaxException;
import java.util.List;

public class AssignmentEvaluator implements ASTNodeVisitor<Integer> {

  @Override
  public Integer visit(ASTNode node) {
    if (ASTType.ASSIGNMENT != node.getType()) {
      throw new SyntaxException(STR. "expecting '=',but got: '\{ node.getType() }'" );
    }
    List<ASTNode> children = node.getChildren();
    final String identifier = children.get(0).getValue();
    Object value = null;
    ASTNode expressionNode = children.get(1);
    if (ASTType.INT_LITERAL == expressionNode.getType()) {
      value = expressionNode.getValue();
    }
    if (ASTType.PLUS == expressionNode.getType()) {
      value = new AdditiveEvaluator().visit(expressionNode);
    }
    if (ASTType.MUL == expressionNode.getType()) {
      value = new MultiplicationEvaluator().visit(expressionNode);
    }
    variables.put(identifier, value);
    return caseTo(value);
  }

  private Integer caseTo(Object value) {
    return switch (value) {
      case null -> 0;
      case String s -> Integer.parseInt(s);
      case Integer i -> i;
      default -> throw new IllegalStateException("Unexpected value: " + value);
    };
  }
}
