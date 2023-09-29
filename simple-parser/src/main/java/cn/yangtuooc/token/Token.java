package cn.yangtuooc.token;

public record Token(TokenType type, String value) {

  @Override
  public String toString() {
    return String.format(" %s : %s ", type.name(), value);
  }
}


