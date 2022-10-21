grammar MxstarGrammar;
options {
   language=Java;
}
//------------parser---------//
//stmt : expr;
program:(declarationStatement|classDeclaration|functionDeclaration)* mainFn;

mainFn:Int 'main' LeftParen RightParen compoundStatement EOF;
//------statement语句--------//
statement:
       declarationStatement
       |expressionStatement
       |selectionStatement
       |jumpStatement
       |iterationStatement
       |compoundStatement;

declarationStatement:
//        functionDeclaration
//        |arrayDeclaration
//        |jaggedarrayDeclaration
//        |classDeclaration
        primaryDeclaration Semi;

expressionStatement:expression? Semi;

compoundStatement: LeftBrace statement* RightBrace;

//statementSeq: statement+;

selectionStatement:
	If LeftParen expression RightParen statement (Else (statement))?;

jumpStatement:
            Return expression? Semi
            |Break Semi
            |Continue Semi;

iterationStatement:
	While LeftParen condition RightParen statement
	| For LeftParen (
		(forInitialStatement)?  condition? Semi expression?//都用stmtnode
	) RightParen statement;

forInitialStatement:declarationStatement|expressionStatement;

//suite: LeftBrace statement* RightBrace;
//---------------------------------------//
constantExpression:
                  True
                  |False
                  |DIGIT
                  |StringLiteral
                  |Null
                  |This
                  |Identifier;

primaryExpression:
                 constantExpression
                 |functionExpression
                 |lambdaExpression_in//lambda node
                 |lambdaExpression_out
                 |newExpression
//                 |arrayVisit //addr node
//                 |jaggedarrayVisit//addr node
//                 |arrayFunctionExpression//自带函数
//                 |stringFunctionExpression//自带函数
                 |LeftParen expression RightParen
//                 |memberVisit //member dot node(expression . identifer)//todo
                 |newExpression;


arrayExpression: (primaryExpression) (LeftBracket expression RightBracket)*;

memberExpression:arrayExpression(Dot arrayExpression)*;

//arraySize:DIGIT;

//arrayCreate:New theTypeName LeftBracket arraySize RightBracket;

//jaggedarrayCreate:New theTypeName LeftBracket arraySize RightBracket (LeftBracket arraySize? RightBracket)+;

//jaggedarrayVisit:Identifier (LeftBracket expression RightBracket)+;

theTypeName:
           (Bool
           |Void
           |Int
           |String
           |Identifier)(LeftBracket expression? RightBracket)*;//array
//function-函数//
functionParametersList:
                      theTypeName Identifier (',' theTypeName Identifier )*;
functionCallList: expression (','expression)*;


functionIdentifier: Identifier;

functionExpression:
                 functionIdentifier LeftParen functionCallList? RightParen;

functionDeclaration:
                  theTypeName Identifier LeftParen functionParametersList? RightParen statement;


primaryDeclaration:
     theTypeName Identifier (Equal expression)? (',' Identifier (Equal expression)?)*;

//class-类//
classConstructor:
Identifier LeftParen RightParen statement;

classDeclaration:
               Class Identifier LeftBrace
               (declarationStatement|classConstructor|functionDeclaration)*
               RightBrace Semi;


//expression-表达式//


newExpression:
        New theTypeName (LeftParen RightParen)?;

//arrayFunctionExpression:
//           Identifier (LeftBracket expression RightBracket)* Dot 'size'LeftParen RightParen;

//stringFunctionExpression:
//   StringLiteral Dot functionExpression;

//memberVisit:
//             expression Dot (This | (Identifier ((LeftParen functionCallList? RightParen)|(LeftBracket expression RightBracket)+)?));
selfExpression:
    memberExpression(PlusPlus|MinusMinus);

singleExpression:
      selfExpression|
     (PlusPlus|MinusMinus)selfExpression|
     selfExpression (PlusPlus|MinusMinus);

postExpression:
      singleExpression|
      (Not|Wavy|Minus|Plus)postExpression;

multiplicativeExpression:
      postExpression((Div|Star|Mod) postExpression)*;

additiveExpression:
	multiplicativeExpression (
		(Plus | Minus) multiplicativeExpression
	)*;
shiftExpression:
	additiveExpression (shiftOperator additiveExpression)*;

shiftOperator: Greater Greater | Less Less;

relationalExpression:
	shiftExpression (
		(Less | Greater | LessEqual | GreaterEqual) shiftExpression
	)*;

equalityExpression:
    	relationalExpression (
    		(EqualEqual | NotEqual) relationalExpression
    	)*;
andExpression: equalityExpression (And equalityExpression)*;

exclusiveOrExpression: andExpression (Caret andExpression)*;

inclusiveOrExpression:
	exclusiveOrExpression (Or exclusiveOrExpression)*;

logicalAndExpression:
	inclusiveOrExpression (AndAnd inclusiveOrExpression)*;

logicalOrExpression:
	logicalAndExpression (OrOr logicalAndExpression)*;

assignmentExpression:
        logicalOrExpression (Equal logicalOrExpression)?;//todo 赋值语句的右值

expression:assignmentExpression (Comma assignmentExpression)*;


lambdaExpression_in:
                LeftBracket And RightBracket (LeftParen functionParametersList? RightParen)? Arrow statement LeftParen functionCallList? RightParen;


lambdaExpression_out:
                   LeftBracket RightBracket (LeftParen functionParametersList? RightParen)? Arrow statement LeftParen functionCallList? RightParen;

condition:
	expression;



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
DIGIT:[1-9][0-9]* | '0';//数字

//NONDIGIT: [a-zA-Z_];//下划线的意思

//LETTER: [a-zA-Z];


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

Equal: '=';
//关系运算符
Less: '<';

Greater: '>';

EqualEqual: '==';

NotEqual: '!=';

LessEqual: '<=';

GreaterEqual: '>=';
//逻辑运算符
AndAnd: '&&';

OrOr: '||';

Not: '!';
//位运算符
//RightRight: '>>';
//
//LeftLeft: '<<';

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

fragment ESC: '\\"'|'\\\\' |'\\n';//转义字符

StringLiteral: '"'(ESC|.)*?'"';//字符串

Identifier:[a-zA-Z] ([a-zA-Z_]|[0-9])*;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

