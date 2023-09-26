package cn.yangtuooc.token;

public class TokenBuffer {

  private TokenType type;

  private final StringBuffer buffer = new StringBuffer();

  public void append(Character character) {
    buffer.append(character);
  }

  @Override
  public String toString() {
    return buffer.toString();
  }

  public Token toToken() {
    return new Token(type, buffer.toString());
  }

  public void setType(TokenType type) {
    this.type = type;
  }
}
