grammar YangtuoScript; // 语法规则文件

import SimpleLexer;

prog: statement*;

statement
  : IF parExpression statement (ELSE statement)?
  | FOR '(' forControl ')' statement
  | WHILE parExpression statement
  | DO statement WHILE parExpression ';'
  | RETURN expression? ';'
  | BREAK identifier? ';'
  | CONTINUE identifier? ';'
  | SEMI
  ;

parExpression: '(' expression ')';

forControl:forInit? ';' expression? ';' forUpdate=expressionList?;

forInit: expressionList;

expressionList: expression (',' expression)*;

expression
    : primary
//    | expression bop='.'
//      ( IDENTIFIER
//      | functionCall
//      | THIS
//      )
    | expression '[' expression ']'
//    | functionCall
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
//    | expression bop=INSTANCEOF typeType
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

literal
  : integerLiteral
  | floatLiteral
  ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

identifier
  : IDENTIFIER
  ;

primary
  : '(' expression ')'
  | THIS
  | literal
  | identifier
;
