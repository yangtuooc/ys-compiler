package cn.yangtuooc.dfa;

import cn.yangtuooc.token.TokenType;

public enum DFAState {
  UNKNOWN,
  INITIAL,
  INT_1,
  INT_2,
  INT_3,
  ID, // identifier
  INT_LITERAL,
  ASSIGNMENT, // =
  GT, // >
  GE,  // >=
  SEMICOLON,
  PLUS, MINUS, MUL, DIV, LEFT_PAREN, RIGHT_PAREN;


  TokenType tokenType() {
    switch (this) {
      case INT_1, INT_2, INT_3, ID -> {
        return TokenType.ID;
      }
      case INT_LITERAL -> {
        return TokenType.INT_LITERAL;
      }
      case ASSIGNMENT -> {
        return TokenType.ASSIGNMENT;
      }
      case GT -> {
        return TokenType.GT;
      }
      case GE -> {
        return TokenType.GE;
      }
      case SEMICOLON -> {
        return TokenType.SEMICOLON;
      }
      case PLUS -> {
        return TokenType.PLUS;
      }
      case MUL -> {
        return TokenType.MUL;
      }
      case DIV -> {
        return TokenType.DIV;
      }
      case MINUS -> {
        return TokenType.MINUS;
      }
      case LEFT_PAREN -> {
        return TokenType.LEFT_PAREN;
      }
      case RIGHT_PAREN -> {
        return TokenType.RIGHT_PAREN;
      }
      default -> {
        return TokenType.UNKNOWN;
      }
    }
  }

  public boolean isSemicolon() {
    return this == SEMICOLON;
  }

  public boolean isInitial() {
    return this == INITIAL;
  }


  public boolean isUnknown() {
    return this == UNKNOWN;
  }
}
