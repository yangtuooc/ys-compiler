package cn.yangtuooc.parser;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTType;
import cn.yangtuooc.ast.SimpleASTNode;
import cn.yangtuooc.token.Token;
import cn.yangtuooc.token.TokenStream;

public class SimpleParser {

  private final TokenStream tokenStream;

  public SimpleParser(TokenStream tokenStream) {
    this.tokenStream = tokenStream;
  }

  public ASTNode parse() {
    SimpleASTNode root = new SimpleASTNode(ASTType.PROGRAM, "计算器");
    for (Token token : tokenStream.getTokens()) {

    }
    return root;
  }
}
