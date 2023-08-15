grammar FracLang;

program: (command? ';')* EOF;

command: display | assigment;

display: 'display' expr;

assigment: ID '<=' expr;

expr:
      Fraction   #ExprFraction
    | ID         #ExprID
    ;

Fraction: [0-9]+ ('/' [0-9]+)?;

ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;

COMMENT: '--' .*? '\n' -> skip;

Error: .;