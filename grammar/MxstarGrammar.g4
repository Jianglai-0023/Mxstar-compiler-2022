grammar MxstarGrammar;
options {
   language=Java;
}
//------------parser---------//
//stmt : expr;
primaryExpression:
                 DIGIT
                 |This
                 |LeftParen expression RightParen
                 |idExpression
                 |lambdaExpression;

expression: assignmentExpression(Comma assignmentExpression)*;

lambdaExpression_in:
                LeftBracket And RightBracket (LeftParen Parameters? RightParen)? Arrow LeftBrace Statements RightBrace LeftParen Parameters RightParen;


lambdaExpression_out:
                   LeftBracket RightBracket (LeftParen Parameters? RightParen)? Arrow LeftBrace Statements RightBrace LeftParen Parameters RightParen;

//Do not rename:keyworld

Void: 'void';

Bool: 'bool';

Int: 'int';

String: 'string';

New: 'new';

Class: 'class';

Null: 'null';

True: 'true';

False: 'false';

This: 'this';

If: 'if';

Else: 'else';

For: 'for';

While: 'while';

Break: 'break';

Continue: 'continue';

Return: 'return';

//Operators
//标识符
DIGIT:[1-9][0-9]* | '0';

NONDIGIT: [a-zA-Z_];//下划线的意思



LeftParen: '(';

RightParen: ')';

LeftBracket: '[';

RightBracket: ']';

LeftBrace: '{';

RightBrace: '}';
//标准运算符
Plus: '+';

Minus: '-';

Star: '*';

Div: '/';

Mod: '%';

Assign: '=';
//关系运算符
Less: '<';

Greater: '>';

Equal: '==';

NotEqual: '!=';

LessEqual: '<=';

GreaterEqual: '>=';
//逻辑运算符
AndAnd: '&&';

OrOr: '||';

Not: '!';
//位运算符
RightRight: '>>';

LeftLeft: '<<';

And: '&';

Or: '|';

Caret: '^';

Wavy: '~';

//自增运算符
PlusPlus: '++';

MinusMinus: '--';

Dot: '.';

Comma: ',';

Semi: ';';

Arrow:'->';

//特殊符号 todo
Whitespace: [ \t]+ -> skip;

Newline: ('\r' '\n'? | '\n') -> skip;

LineComment: '//' ~ [\r\n]* -> skip;

fragment ESC: '\\"'|'\\\\' |'\\n';
StringLiteral: '"'(ESC|.)*?'"';



