grammar CalculatorFrac;

program: (instruction? ';') * EOF;

instruction: print
           | assign
           ;

print: 'print' expr;

assign: expr '->' ID;

expr: op=('-'|'+') expr                    #ExprUnary
    | 'reduce' expr                        #ExprReduce
    | '(' expr ')' '^' expr                #ExprPow
    | '(' expr ')'                         #ExprParent
    | expr op=('*'|':') expr               #ExprMulDiv
    | expr op=('+'|'-') expr               #ExprAddSub
    | LITERAL                              #ExprLiteral
    | ID                                   #ExprVariable
    ;

LITERAL: NUM ('/' NUM)?;
ID: [a-zA-Z_]+;

NUM: [0-9]+;

WS: [ \t\n]+ -> skip;

COMMENT: '//' .*? '\n' -> skip;