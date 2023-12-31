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
  public ASTNode getParent() {
    return this.parent;
  }

  @Override
  public void setParent(ASTNode parent) {
    this.parent = parent;
  }

  public void dump(PrintStream out, String indent) {
    out.println(indent + this);
    for (ASTNode child : children) {
      child.dump(out, indent + "\t\t");
    }
  }

  @Override
  public void addChild(ASTNode node) {
    this.children.add(node);
    node.setParent(this);
  }

  @Override
  public List<ASTNode> getChildren() {
    return children;
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
  public <R> void accept(ASTNodeVisitor<R> visitor) {
    visitor.visit(this);
  }

  @Override
  public String toString() {
    return String.format(" %s : %s ", this.type.name(), this.text);
  }
}
