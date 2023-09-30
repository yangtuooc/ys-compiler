package cn.yangtuooc.evaluator;

public class EvaluatorException extends RuntimeException {

  public EvaluatorException(String message) {
    super("evaluate error: " + message);
  }
}
