grammar MxstarGrammar;
options {
   language=Java;
}

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
//标识符 todo
fragment DIGIT:[0-9];

fragment NONDIGIT: [a-zA-Z_];

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

//特殊符号 todo
Whitespace: [ \t]+ -> skip;

LineComment: '//' ~ [\r\n]* -> skip;






