grammar Grammar;

program: statement* EOF;

statement: print
          | assign
          ;

print: 'print' expr;

assign: ID ':' expr;

expr: expr '+' expr             #add
    | expr '-' expr             #sub
    | 'trim' expr               #trim
    | '(' expr ')'              #parentisis
    | expr '/' expr '/' expr    #replace
    | 'input' '(' expr ')'      #input
    | ID                        #id
    | LITERAL                   #literal
    ;


ID: [a-zA-Z][a-zA-Z0-9]*;
LITERAL: '"' .*? '"';

WS: [ \t\n\r]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;