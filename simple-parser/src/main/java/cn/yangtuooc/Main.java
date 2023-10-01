package cn.yangtuooc;

import cn.yangtuooc.ast.ASTNode;
import cn.yangtuooc.evaluator.SimpleEvaluator;
import cn.yangtuooc.lexer.SimpleLexer;
import cn.yangtuooc.parser.SimpleParser;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStream;

/**
 * 词法+语法规则定义：YangtuoScript.txt
 */
public class Main {

  public static void main(String[] args) {
    String script = "int age = 10; age = age + 40;";
    CharacterReader reader = new CharacterReader(script);
    SimpleLexer simpleLexer = new SimpleLexer(reader);
    TokenStream tokenStream = simpleLexer.tokenize();
    tokenStream.dump(System.out);

    System.out.println("--------------------------");
    SimpleParser simpleParser = new SimpleParser(tokenStream);
    ASTNode astNode = simpleParser.parse();
    astNode.dump(System.out, "");

    System.out.println("--------------------------");
    SimpleEvaluator evaluator = new SimpleEvaluator();
    Integer result = evaluator.visit(astNode);
    System.out.println("evaluate result: " + result);
  }
}
