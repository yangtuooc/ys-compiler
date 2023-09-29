package cn.yangtuooc.ast;

import java.io.PrintStream;

public interface ASTNode {

  void dump(PrintStream out, String indent);

  void addChild(ASTNode node);

  ASTType getType();

  String getValue();
}
