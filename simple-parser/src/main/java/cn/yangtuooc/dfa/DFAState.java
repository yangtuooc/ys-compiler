package cn.yangtuooc.dfa;

import cn.yangtuooc.token.TokenType;

public enum DFAState {
  INITIAL,
  INT_1,
  INT_2,
  INT_3,
  ID, // identifier
  INT_LITERAL,
  ASSIGNMENT, // =
  GT, // >
  GE,  // >=
  SEMICOLON;

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
      default -> {
        return TokenType.UNKNOWN;
      }
    }
  }
}
