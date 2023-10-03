package cn.yangtuooc.compiler;

import cn.yangtuooc.antlr.YangtuoScriptLexer;
import cn.yangtuooc.antlr.YangtuoScriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class YangtuoScriptCompiler {

  public void compile(String script) {
    // 词法分析
    YangtuoScriptLexer lexer = new YangtuoScriptLexer(CharStreams.fromString(script));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    // 语法分析
    YangtuoScriptParser parser = new YangtuoScriptParser(tokenStream);
    // 语义分析
    ParseTreeWalker walker = new ParseTreeWalker();
  }

  
}
