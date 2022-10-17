grammar MxstarGrammar;
options {
   language=Java;
}
//------------parser---------//
//stmt : expr;
program:(declarationStatement|classDeclaration|functionDeclaration|arrayDeclaration|jaggedarrayDeclaration)* mainFn;

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

compoundStatement: LeftBrace statementSeq? RightBrace;

statementSeq: statement+;

selectionStatement:
	If LeftParen condition RightParen statement (Else (statement))?;

jumpStatement:
            Return expression? Semi
            |Break Semi
            |Continue Semi;

iterationStatement:
	While LeftParen condition RightParen statement
	| For LeftParen (
		(primaryDeclaration|expression)? Semi expression? Semi expression?
	) RightParen statement;



//suite: LeftBrace statement* RightBrace;

constantExpression:
                  True
                  |False
                  |DIGIT
                  |StringLiteral
                  |Null;
//className:Identifer;

arrayDeclaration: theTypeName LeftBracket RightBracket Identifier (Equal expression)? (','Identifier (Equal expression)?)*;

jaggedarrayDeclaration: theTypeName (LeftBracket RightBracket)+ Identifier(','Identifier)* (Equal expression)?;

arrayVisit: (Identifier|LeftParen arrayCreate RightParen) LeftBracket expression RightBracket;

arraySize:DIGIT;

arrayCreate:New theTypeName LeftBracket arraySize RightBracket;

jaggedarrayCreate:New theTypeName LeftBracket arraySize RightBracket (LeftBracket arraySize? RightBracket)+;

jaggedarrayVisit:Identifier (LeftBracket expression RightBracket)+;

theTypeName:
           Bool
           |Void
           |Int
           |String
           |Identifier;
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
     theTypeName Identifier (Equal expression)? (',' Identifier (Equal expression)?)*
     |arrayDeclaration
     |jaggedarrayDeclaration ;

//class-类//
classConstructor:
Identifier LeftParen RightParen statement;

classDeclaration:
               Class Identifier LeftBrace
               (declarationStatement|classConstructor|functionDeclaration)*
               RightBrace Semi;

classMemberVisit:
             Identifier Dot (This | (Identifier ((LeftParen functionCallList? RightParen)|(LeftBracket expression RightBracket)+)?));
//expression-表达式//
primaryExpression:
                 constantExpression
                 |This
                 |Identifier
                 |functionExpression
                 |lambdaExpression_in
                 |lambdaExpression_out
                 |arrayVisit
                 |jaggedarrayVisit
                 |arrayFunctionExpression
                 |stringFunctionExpression
                 |arrayCreate
                 |LeftParen expression RightParen
                 |classMemberVisit
                 |jaggedarrayCreate
                 |creatClass;
creatClass:
     New Identifier (LeftParen RightParen)?;
arrayFunctionExpression:
           Identifier (LeftBracket expression RightBracket)* Dot 'size'LeftParen RightParen;

stringFunctionExpression:
   StringLiteral Dot functionExpression;

singleExpression:
      primaryExpression|
     (PlusPlus|MinusMinus)singleExpression|
     singleExpression (PlusPlus|MinusMinus);

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

