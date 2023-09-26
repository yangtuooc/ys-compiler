package cn.yangtuooc.lexer;

import cn.yangtuooc.dfa.DFA;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStatement;
import cn.yangtuooc.token.TokenStream;

public class SimpleLexer {

  private final CharacterReader characterReader;
  private final DFA dfa = new DFA();


  public SimpleLexer(CharacterReader characterReader) {
    this.characterReader = characterReader;
  }

  public TokenStream tokenize() {
    TokenStream tokenStream = new TokenStream();
    while (characterReader.hasNext()) {
      TokenStatement tokenStatement = dfa.move(characterReader);
      tokenStream.append(tokenStatement);
    }
    return tokenStream;
  }
}
