package cn.yangtuooc.ast;

import cn.yangtuooc.dump.Outer;
import java.io.PrintStream;

public interface ASTNode extends Outer {

  void dump(PrintStream out);

  void addChild(ASTNode node);

  ASTType getType();

  String getValue();
}
