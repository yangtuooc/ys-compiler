package cn.yangtuooc.lexer;

import cn.yangtuooc.dfa.DFA;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenBuffer;
import cn.yangtuooc.token.TokenStream;

public class SimpleLexer {

  private final CharacterReader characterReader;
  private final DFA dfa = new DFA();


  public SimpleLexer(CharacterReader characterReader) {
    this.characterReader = characterReader;
  }

  public TokenStream tokenize() {
    return dfa.move(characterReader);
  }
}
