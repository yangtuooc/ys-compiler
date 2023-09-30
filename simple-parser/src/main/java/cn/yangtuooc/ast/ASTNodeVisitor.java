package cn.yangtuooc.ast;

public interface ASTNodeVisitor<R> {

  R visit(ASTNode node);
}
