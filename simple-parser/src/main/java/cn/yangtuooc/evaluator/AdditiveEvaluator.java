package cn.yangtuooc.evaluator;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTNodeVisitor;
import cn.yangtuooc.ast.ASTType;
import cn.yangtuooc.exception.SyntaxException;
import java.util.Objects;
import javax.naming.InitialContext;

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
      int value = 0;
      if (child.getType() == ASTType.ID) {
        Object variable = variables.get(child.getValue());
        if (Objects.isNull(variable)) {
          throw new SyntaxException(STR. "undeclared variable: '\{ child.getValue() }'" );
        }
        value = caseTo(variable);
      } else {
        value = Integer.parseInt(child.getValue());
      }
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

  private Integer caseTo(Object value) {
    return switch (value) {
      case null -> 0;
      case String s -> Integer.parseInt(s);
      case Integer i -> i;
      default -> throw new IllegalStateException("Unexpected value: " + value);
    };
  }
}

