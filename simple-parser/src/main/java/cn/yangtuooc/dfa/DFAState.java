package cn.yangtuooc.dfa;

import cn.yangtuooc.token.TokenType;

public enum DFAState {
  UNKNOWN(false),
  INITIAL(false),
  INT_1(false),
  INT_2(false),
  INT_3(true),
  ID(true), // identifier
  INT_LITERAL(true),
  ASSIGNMENT(true), // =
  GT(true), // >
  GE(true),  // >=
  SEMICOLON(true),
  PLUS(false), MINUS(false), MUL(false), DIV(false);

  private final boolean terminate;

  public boolean isTerminate() {
    return this.terminate;
  }

  DFAState(boolean terminate) {
    this.terminate = terminate;
  }


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
