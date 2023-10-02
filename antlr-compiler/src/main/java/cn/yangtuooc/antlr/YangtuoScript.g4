grammar YangtuoScript; // 语法规则文件

import SimpleLexer;

prog: statement*;

statement:expression*';';

expression
  : additiveExpression
  | subtractionExpression
  | multiplicativeExpression
  | divisionExpression
  ;

additiveExpression
  : multiplicativeExpression
  | divisionExpression
  | additiveExpression '+' multiplicativeExpression
  | additiveExpression '+' divisionExpression
  ;

subtractionExpression
  : multiplicativeExpression
  | divisionExpression
  | subtractionExpression '-' multiplicativeExpression
  | subtractionExpression '-' divisionExpression
  ;

multiplicativeExpression
  : primary
  | multiplicativeExpression '*' primary
  ;

divisionExpression
  : primary
  | divisionExpression '/' primary
  ;

literal: integerLiteral;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

identifier
  : IDENTIFIER
  ;

primary
  : '(' expression ')'
  | literal
  | identifier
;
