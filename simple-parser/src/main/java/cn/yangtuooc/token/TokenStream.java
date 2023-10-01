package cn.yangtuooc.token;

import cn.yangtuooc.dump.Outer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TokenStream implements Outer {

  private int pos = 0;
  private final List<Token> tokens = new ArrayList<>();

  public Token peek() {
    if (pos >= tokens.size()) {
      return null;
    }
    return tokens.get(pos);
  }

  public Token read() {
    if (pos > tokens.size()) {
      return null;
    }
    return tokens.get(pos++);
  }

  public void unread() {
    if (pos > 0) {
      pos--;
    }
  }

  public void dump(PrintStream out) {
    tokens.forEach(out::println);
  }

  public void append(TokenBuffer tokenBuffer) {
    tokens.add(tokenBuffer.toToken());
  }

  public List<Token> getTokens() {
    return this.tokens;
  }

  public int getPosition() {
    return pos;
  }

  public void SetPosition(int pos) {
    this.pos = pos;
  }
}
