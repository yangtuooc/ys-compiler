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
    Token lookahead;
    while ((lookahead = tokenStream.peek()) != null) {
      if ("int".contains(lookahead.value())) {
        ASTNode dcl = dcl(tokenStream);
        if (dcl != null) {
          yangtuoScript.addChild(dcl);
          continue;
        }
        throw new SyntaxException("unsupported syntax: " + lookahead.value());
      }
      ASTNode expr = expr(tokenStream);
      if (expr != null) {
        yangtuoScript.addChild(expr);
        continue;
      }
      ASTNode assign = assign(tokenStream);
      if (assign != null) {
        yangtuoScript.addChild(assign);
        continue;
      }
      throw new SyntaxException("unsupported syntax: " + lookahead.value());
    }
    return yangtuoScript;
  }

  private ASTNode dcl(TokenStream ts) {
    int pos = ts.getPosition();
    Token intPeek = ts.peek();
    if (intPeek != null && intPeek.type() == TokenType.ID) {
      ts.read();
      Token idPeek = ts.peek();
      if (idPeek != null && idPeek.type() == TokenType.ID) {
        Token idToken = ts.read();
        SimpleASTNode idNode = new SimpleASTNode(ASTType.ID, idToken.value());
        Token assignPeek = ts.peek();
        if (assignPeek != null && assignPeek.type() == TokenType.ASSIGNMENT) {
          Token assignToken = ts.read();
          ASTNode additive = additive(ts);
          Token semicolonPeek = ts.peek();
          if (semicolonPeek != null && semicolonPeek.type() == TokenType.SEMICOLON) {
            ts.read();
            SimpleASTNode assignNode = new SimpleASTNode(ASTType.ASSIGNMENT, assignToken.value());
            assignNode.addChild(idNode);
            assignNode.addChild(additive);
            return assignNode;
          } else {
            throw new SyntaxException("expecting ';', but got empty");
          }
        } else {
          ts.SetPosition(pos);
          return null;
        }
      }
    }
    return null;
  }

  private ASTNode expr(TokenStream ts) {
    int pos = ts.getPosition();
    ASTNode additive = additive(ts);
    Token semicolonPeek = ts.peek();
    if (semicolonPeek != null && semicolonPeek.type() == TokenType.SEMICOLON) {
      ts.read();
      return additive;
    }
    ts.SetPosition(pos);
    return null;
  }

  private ASTNode assign(TokenStream ts) {
    ASTNode node = null;
    int pos = ts.getPosition();
    Token idPeek = ts.peek();
    if (idPeek != null && idPeek.type() == TokenType.ID) {
      SimpleASTNode idNode = new SimpleASTNode(ASTType.ID, ts.read().value());
      Token assignPeek = ts.peek();
      if (assignPeek != null && assignPeek.type() == TokenType.ASSIGNMENT) {
        SimpleASTNode assignNode = new SimpleASTNode(ASTType.ASSIGNMENT, ts.read().value());
        ASTNode exprNode = expr(ts);
        if (exprNode != null) {
          assignNode.addChild(idNode);
          assignNode.addChild(exprNode);
          node = assignNode;
        } else {
          ts.SetPosition(pos);
        }
      } else {
        ts.SetPosition(pos);
      }
    }
    return node;
  }

  private ASTNode additive(TokenStream ts) {
    ASTNode left = multiplicative(ts);
    ASTNode node = left;

    if (left != null) {
      while (true) {
        Token lookahead = ts.peek();
        if (lookahead != null && lookahead.type() == TokenType.PLUS) {
          Token plus = ts.read();
          ASTNode right = multiplicative(ts);
          node = new SimpleASTNode(ASTType.PLUS, plus.value());
          node.addChild(left);
          node.addChild(right);
          left = node;
        } else {
          break;
        }
      }
    }
    return node;
  }

  private ASTNode multiplicative(TokenStream ts) {
    ASTNode left = primary(ts);
    ASTNode node = left;
    if (left != null) {
      while (true) {
        Token lookahead = ts.peek();
        if (lookahead != null && lookahead.type() == TokenType.MUL) {
          Token star = ts.read();
          ASTNode right = primary(ts);
          node = new SimpleASTNode(ASTType.MUL, star.value());
          node.addChild(left);
          node.addChild(right);
          left = node;
        } else {
          break;
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
      switch (type) {
        case ID -> node = new SimpleASTNode(ASTType.ID, ts.read().value());
        case INT_LITERAL -> node = new SimpleASTNode(ASTType.INT_LITERAL, ts.read().value());
        case LEFT_PAREN -> {
          ts.read();
          node = additive(ts);
          Token rightParen = ts.read();
          if (TokenType.RIGHT_PAREN != rightParen.type()) {
            throw new SyntaxException(STR. "expecting ')', but got '\{ rightParen.type() }'" );
          }
          return node;
        }
      }
    }
    return node;
  }
}
