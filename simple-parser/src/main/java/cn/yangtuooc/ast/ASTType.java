package cn.yangtuooc.ast;

public enum ASTType {
  INT_LITERAL, ID, MUL, PLUS, PROGRAM, ASSIGNMENT;


  @Override
  public String toString() {
    switch (this) {
      case ID -> {
        return "ID";
      }
      case MUL -> {
        return "*";
      }
      case PLUS -> {
        return "+";
      }
      case PROGRAM -> {
        return "PROGRAM";
      }
      case INT_LITERAL -> {
        return "INT_LITERAL";
      }
      case ASSIGNMENT -> {
        return "ASSIGNMENT";
      }
      default -> {
        return "UNKNOWN";
      }
    }
  }
}
