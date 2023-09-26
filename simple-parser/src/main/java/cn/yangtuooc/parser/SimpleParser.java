package cn.yangtuooc.parser;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.token.TokenStream;

public class SimpleParser {

  private final TokenStream tokenStream;

  public SimpleParser(TokenStream tokenStream) {
    this.tokenStream = tokenStream;
  }

  public ASTNode parse() {
    return null;
  }
}
