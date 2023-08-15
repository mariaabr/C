grammar Calculator;

program: (stat? NEWLINE) * EOF;

stat: expr                           #StatExpr
      | assignment                   #StatWhoCares
      ;

assignment: ID '=' expr;

expr: op=('-'|'+') expr             #ExprUnary
    | expr op=('*'|'/'|'%') expr    #ExprMulDivMod
    | expr op=('+'|'-') expr        #ExprAddSub
    | INTEGER                       #ExprInteger
    | ID                            #ExprVariable
    | '(' expr ')'                  #ExprParent
    ;

INTEGER: [0-9]+;
ID: [a-zA-Z_]+;

NEWLINE: '\r'? '\n';

WS: [ \t] -> skip;

COMMENT: '#' .*? '\n' -> skip;