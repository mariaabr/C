grammar Calculator;

program: stat * EOF;

stat: expr? NEWLINE;

expr: op=('-'|'+') expr             #ExprUnary
    | expr op=('*'|'/'|'%') expr    #ExprMulDivMod
    | expr op=('+'|'-') expr        #ExprAddSub
    | INTEGER                       #ExprInteger
    | '(' expr ')'                  #ExprParent
    ;

INTEGER: [0-9]+;

NEWLINE: '\r'? '\n';

WS: [ \t] -> skip;

COMMENT: '#' .*? '\n' -> skip;