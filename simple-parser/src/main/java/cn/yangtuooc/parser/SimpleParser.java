package cn.yangtuooc.parser;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.ast.ASTType;
import cn.yangtuooc.ast.SimpleASTNode;
import cn.yangtuooc.exception.SyntaxException;
import cn.yangtuooc.token.Token;
import cn.yangtuooc.token.TokenStream;
import cn.yangtuooc.token.TokenType;

public class SimpleParser {

  private final TokenStream tokenStream;

  public SimpleParser(TokenStream tokenStream) {
    this.tokenStream = tokenStream;
  }

  public ASTNode parse() {
    SimpleASTNode yangtuoScript = new SimpleASTNode(ASTType.PROGRAM, "YangtuoScript");
    ASTNode astNode = additive(tokenStream);
    if (astNode != null) {
      yangtuoScript.addChild(astNode);
    }
    return yangtuoScript;
  }

  private ASTNode additive(TokenStream ts) {
    ASTNode left = multiplicative(ts);
    ASTNode node = left;

    if (left != null) {
      Token lookahead = ts.peek();
      if (lookahead != null && lookahead.type() == TokenType.PLUS) {
        Token plus = ts.read();
        ASTNode right = additive(ts);
        if (right == null) {
          throw new SyntaxException("invalid additive expression, expecting the right part.");
        }
        node = new SimpleASTNode(ASTType.PLUS, plus.value());
        node.addChild(left);
        node.addChild(right);
      }
    }
    return node;
  }

  private ASTNode multiplicative(TokenStream ts) {
    ASTNode left = primary(ts);
    ASTNode node = left;
    if (left != null) {
      Token lookahead = ts.peek();
      if (lookahead != null) {
        if (lookahead.type() == TokenType.MUL) {
          Token mul = ts.read();
          ASTNode right = multiplicative(ts);
          if (right == null) {
            throw new SyntaxException("invalid multiplicative expression, expecting the right part.");
          }
          node = new SimpleASTNode(ASTType.MUL, mul.value());
          node.addChild(left);
          node.addChild(right);
        }
      }
    }
    return node;
  }

  private ASTNode primary(TokenStream ts) {
    ASTNode node = null;
    Token lookahead = ts.peek();
    if (lookahead != null) {
      TokenType type = lookahead.type();
      Token read = ts.read();
      if (type == TokenType.ID) {
        node = new SimpleASTNode(ASTType.ID, read.value());
      } else if (type == TokenType.INT_LITERAL) {
        node = new SimpleASTNode(ASTType.INT_LITERNAL, read.value());
      } else if (type == TokenType.LEFT_PAREN) {
        node = additive(ts);
        if (node == null) {
          throw new SyntaxException("expecting an additive expression inside parenthesis");
        }
        lookahead = ts.peek();
        if (lookahead == null || ts.read().type() != TokenType.RIGHT_PAREN) {
          throw new SyntaxException("expecting right parenthesis");
        }
      }
    }
    return node;
  }
}
