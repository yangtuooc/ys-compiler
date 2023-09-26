package cn.yangtuooc;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.lexer.SimpleLexer;
import cn.yangtuooc.parser.SimpleParser;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStream;

public class Main {

  public static void main(String[] args) {
    String script = "int age = 45;";
    CharacterReader reader = new CharacterReader(script);
    SimpleLexer simpleLexer = new SimpleLexer(reader);
    TokenStream tokenStream = simpleLexer.tokenize();
    tokenStream.dump(System.out);

    SimpleParser simpleParser = new SimpleParser(tokenStream);
    ASTNode astNode = simpleParser.parse();
    astNode.dump(System.out);
  }
}
