package cn.yangtuooc.ast;

import java.io.PrintStream;
import java.util.List;

public interface ASTNode {

  ASTNode getParent();

  void setParent(ASTNode parent);

  void dump(PrintStream out, String indent);

  void addChild(ASTNode node);

  List<ASTNode> getChildren();

  ASTType getType();

  String getValue();

  <R> void accept(ASTNodeVisitor<R> visitor);
}
