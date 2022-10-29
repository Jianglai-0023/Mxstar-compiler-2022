grammar MxstarGrammar;
options {
   language=Java;
}
//------------parser---------//
//stmt : expr;
program:def* EOF;

mainFn:Int 'main' LeftParen RightParen compoundStatement;

def:(mainFn|declarationStatement|classDeclaration|functionDeclaration);

//-----------Func-----------//
functionParametersList:
                      theTypeName Identifier (',' theTypeName Identifier )*;

functionCallList: expression (','expression)*;

//functionExpression:


functionDeclaration:
                  (theTypeName|Void) Identifier LeftParen functionParametersList? RightParen  compoundStatement;

primaryDeclaration:
     theTypeName Identifier (Equal expression)? (',' Identifier (Equal expression)?)*;
//-----------Class-----------//
classConstructor:
Identifier LeftParen RightParen statement;

classDeclaration:
               Class Identifier LeftBrace
               (declarationStatement|classConstructor|functionDeclaration)*
               RightBrace Semi;
//-----------Expr-----------//
theTypeName:
           (Bool
           |Int
           |String
           |Identifier)
           bracket*;//array
bracket: LeftBracket expression? RightBracket;
constantExpression:
                  True
                  |False
                  |DIGIT
                  |StringLiteral
                  |Null
                  |This
                  ;

primaryExpression:
                 constantExpression
                 |Identifier
                 |LeftParen expression RightParen
                 |primaryExpression LeftParen functionCallList? RightParen //function
                 |primaryExpression (Dot Identifier)// member
                 |newExpression
                 |primaryExpression LeftBracket expression RightBracket //array
                 |lambdaExpression;

//lambdaExpression:lambdaExpression_out|lambdaExpression_in;
selfExpression:
    primaryExpression(PlusPlus|MinusMinus)?;//single

singleExpression:
      selfExpression|
     (PlusPlus|MinusMinus)selfExpression;//single

postExpression:
      singleExpression|
      (Not|Wavy|Minus|Plus)postExpression;//single

multiplicativeExpression:
      postExpression((Div|Star|Mod) postExpression)*;//binary

additiveExpression:
	multiplicativeExpression (
		(Plus | Minus) multiplicativeExpression//single
	)*;

shiftExpression:
	additiveExpression (shiftOperator additiveExpression)*;

shiftOperator: Greater Greater | Less Less;//binary

relationalExpression:
	shiftExpression (
		(Less | Greater | LessEqual | GreaterEqual) shiftExpression//bool
	)*;

equalityExpression:
    	relationalExpression (
    		(EqualEqual | NotEqual) relationalExpression//bool
    	)*;

andExpression: equalityExpression (And equalityExpression)*;

exclusiveOrExpression: andExpression (Caret andExpression)*;

inclusiveOrExpression:
	exclusiveOrExpression (Or exclusiveOrExpression)*;//binary

logicalAndExpression:
	inclusiveOrExpression (AndAnd inclusiveOrExpression)*;//binary

logicalOrExpression:
	logicalAndExpression (OrOr logicalAndExpression)*;//binary

assignmentExpression:
        logicalOrExpression (Equal logicalOrExpression)?;//binary

expression:assignmentExpression;//binary

lambdaExpression:
                LeftBracket And? RightBracket (LeftParen functionParametersList? RightParen)? Arrow LeftBracket statement* RightBracket LeftParen functionCallList? RightParen;

//lambdaExpression_out:
//                   LeftBracket RightBracket (LeftParen functionParametersList? RightParen)? Arrow compoundStatement LeftParen functionCallList? RightParen;

newExpression:
        New theTypeName (LeftParen RightParen)?;

condition:
	expression;

//------statement语句--------//
statement:
       declarationStatement
       |expressionStatement
       |selectionStatement
       |jumpStatement
       |iterationStatement
       |compoundStatement;

declarationStatement:
        primaryDeclaration Semi;

expressionStatement:expression? Semi;

compoundStatement: LeftBrace statement* RightBrace;

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

