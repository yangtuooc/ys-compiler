package cn.yangtuooc.token;

import cn.yangtuooc.dump.Outer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TokenStream implements Outer {

  private final List<Token> tokens = new ArrayList<>();

  public void dump(PrintStream out) {
    tokens.forEach(out::println);
  }

  public void append(TokenStatement tokenBuffer) {
    tokens.add(tokenBuffer.toToken());
  }
}
