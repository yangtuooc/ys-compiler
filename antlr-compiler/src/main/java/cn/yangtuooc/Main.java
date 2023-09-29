package cn.yangtuooc;

import cn.yangtuooc.g4.evaluator.SimpleScriptEvaluator;
import cn.yangtuooc.g4.gen.YangtuoScriptLexer;
import cn.yangtuooc.g4.gen.YangtuoScriptParser;
import cn.yangtuooc.g4.gen.YangtuoScriptParser.ExpressionContext;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

  public static void main(String[] args) {
    String script = """
        int age = 45;
        age = age + 5;
        """;
    // 词法分析
    YangtuoScriptLexer scriptLexer = new YangtuoScriptLexer(CharStreams.fromString(script));
    CommonTokenStream tokenStream = new CommonTokenStream(scriptLexer);

    // 语法分析
    YangtuoScriptParser scriptParser = new YangtuoScriptParser(tokenStream);
    ExpressionContext expression = scriptParser.expression();
    scriptParser.dumpDFA();

    // 解释执行
    SimpleScriptEvaluator scriptEvaluator = new SimpleScriptEvaluator();
    Integer result = scriptEvaluator.visit(expression);
    System.out.println(result);
  }
}