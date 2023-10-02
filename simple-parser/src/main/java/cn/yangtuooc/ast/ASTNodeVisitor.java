package cn.yangtuooc.ast;

import java.util.HashMap;
import java.util.Map;

public interface ASTNodeVisitor<R> {

  Map<String, Object> variables = new HashMap<>();

  R visit(ASTNode node);
}
