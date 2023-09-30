package cn.yangtuooc;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.lexer.SimpleLexer;
import cn.yangtuooc.parser.SimpleParser;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStream;

/**
 * 词法+语法规则定义：YangtuoScript.txt
 */
public class Main {

  public static void main(String[] args) {
    String script = "2+3+4";
    CharacterReader reader = new CharacterReader(script);
    SimpleLexer simpleLexer = new SimpleLexer(reader);
    TokenStream tokenStream = simpleLexer.tokenize();
    tokenStream.dump(System.out);

    System.out.println("--------------------------");
    SimpleParser simpleParser = new SimpleParser(tokenStream);
    ASTNode astNode = simpleParser.parse();
    astNode.dump(System.out, "");
  }
}
