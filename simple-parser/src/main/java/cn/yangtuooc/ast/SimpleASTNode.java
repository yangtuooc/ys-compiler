package cn.yangtuooc.ast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SimpleASTNode implements ASTNode {

  private final ASTType type;
  private final String text;
  private ASTNode parent;
  private final List<ASTNode> children = new ArrayList<>();

  public SimpleASTNode(ASTType type, String text) {
    this.type = type;
    this.text = text;
  }


  @Override
  public void dump(PrintStream out) {
    if (parent != null) {
      out.println(parent);
    }
    out.println(this);
    for (ASTNode child : children) {
      child.dump(out);
    }
  }

  @Override
  public void addChild(ASTNode node) {
    this.children.add(node);
  }

  @Override
  public ASTType getType() {
    return this.type;
  }

  @Override
  public String getValue() {
    return this.text;
  }

  @Override
  public String toString() {
    return String.format("[ %s : %s ]", this.type.name(), this.text);
  }
}
