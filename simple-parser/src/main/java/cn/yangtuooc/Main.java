package cn.yangtuooc;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.lexer.SimpleLexer;
import cn.yangtuooc.parser.SimpleParser;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStream;

/**
 * 支持语法规则：
 *
 * expr -> add | sub | mul | div
 * add -> add + expr | primitive
 * sub -> sub - expr | primitive
 * mul -> mul * expr | primitive
 * div -> div / expr | primitive
 * primitive -> [0-9]+
 *
 * fixme: 这个文法规则会有结合性问题：2+3+5，应该先计算2+3，而上述文法是先计算3+5
 *
 */
public class Main {

  public static void main(String[] args) {
    String script = "int intage > 45;";
    CharacterReader reader = new CharacterReader(script);
    SimpleLexer simpleLexer = new SimpleLexer(reader);
    TokenStream tokenStream = simpleLexer.tokenize();
    tokenStream.dump(System.out);

    System.out.println("--------------------------");

    SimpleParser simpleParser = new SimpleParser(tokenStream);
    ASTNode astNode = simpleParser.parse();
    astNode.dump(System.out);
  }
}
