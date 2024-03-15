grammar js;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}

program           :  block ; // jscal program


block locals [ SymtabEntry entry = null ]
    : statementList ; // jscal block
blockForFunction : '{' statementList '}' ;

declarations  : ( constantsPart )?
                ( variablesPart )? ( routinesPart)? ;

constantsPart           : CONST constantDefinitionsList ;
constantDefinitionsList : constantDefinition ( ',' constantDefinition )* ;
constantDefinition      : constantIdentifier '=' constant ;

constantIdentifier  locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

constant            locals [ Typespec type = null, Object value = null ]
    : sign? ( IDENTIFIER | unsignedNumber )
    | characterConstant
    | stringConstant
    ;

sign : '-' | '+' ;


typeIdentifier      locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

typeSpecification   locals [ Typespec type = null ]
    : simpleType        # simpleTypespec

    ;


simpleType          locals [ Typespec type = null ]
    : typeIdentifier    # typeIdentifierTypespec
    | enumerationType   # enumerationTypespec
    ;

enumerationType     : '(' enumerationConstant ( ',' enumerationConstant )* ')' ;
enumerationConstant : constantIdentifier ;


variablesPart            : variableDeclarationsList ;
variableDeclarationsList : variableDeclarations ( ',' variableDeclarations )* ;
variableDeclarations     : typeSpecification variableIdentifier '='  expression
    | typeSpecification variableIdentifier; // added expression

variableIdentifier  locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

//routinesPart      : routineDefinition ( ';' routineDefinition)* ;
//routineDefinition : functionHead blockForFunction ; // js function


// routineDefinition : ( procedureHead | functionHead ) ';' block ;
//procedureHead     : PROCEDURE routineIdentifier parameters? ; -> pascal
//functionHead      : FUNCTION  routineIdentifier parameters ;
// function functionName (parameters) -> js function declaration form



//routineIdentifier   locals [ Typespec type = null, SymtabEntry entry = null ]
//    : IDENTIFIER ;
//
//
//parameters                : '(' argumentList ')' ; // -> js


//parameterIdentifier   locals [ Typespec type = null, SymtabEntry entry = null ]
//    : IDENTIFIER ;
//
routinesPart      : routineDefinition ( ';' routineDefinition)* ;
routineDefinition : ( procedureHead | functionHead ) '{' block '}';
procedureHead     : 'public' 'void' routineIdentifier '('parameters?')' ;
functionHead      : 'public'  typeIdentifier routineIdentifier '('parameters?')';

routineIdentifier   locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

parameters                :  parameterDeclarationsList  ;
parameterDeclarationsList : parameterDeclarations ( ',' parameterDeclarations )* ; // a : Real;
parameterDeclarations     : typeIdentifier parameterIdentifierList ;
parameterIdentifierList   : parameterIdentifier ( ',' parameterIdentifier )* ;

parameterIdentifier   locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

statement :
          | assignmentStatement
          | ifStatement
          | caseStatement
          | whileStatement
          | forStatement

          // | writeStatement -> pascal
           | printlnStatement
          // | readStatement -> pascal
          // | readlnStatement -> pascal
          | procedureCallStatement
          | emptyStatement // ?

          | printlnStatement
          | emptyStatement

          | declarations
          | printStatement
          | increaseStatement
          | decreaseStatement
          ;


increaseStatement : variable '++';
decreaseStatement : variable '--';


emptyStatement : ;

statementList       : statement (';' statement)* ;
assignmentStatement : lhs '=' rhs;

lhs locals [ Typespec type = null ]
    : variable ;
rhs : expression ;

ifStatement    : IF '(' expression ')' '{' trueStatement '}' ( ELSE '{'falseStatement '}')? ; // js
trueStatement  : statementList ;
falseStatement : statementList ;

caseStatement
    locals [ HashMap<Integer, jsParser.StatementContext> jumpTable = null ]
    : SWITCH '('expression')' '{' caseBranchList ';' '}' ;

caseBranchList   : CASE caseBranch ( ';' CASE caseBranch )*  (';' defaultStatement)? ;
caseBranch       : caseConstantList ':' statement | ;
caseConstantList : caseConstant ( ',' caseConstant )* ;
defaultStatement : DEFAULT ':' statement ;

caseConstant    locals [ Typespec type = null, int value = 0 ]
    : constant ;


whileStatement : WHILE  '(' expression ')' '{'statementList'}' ; // js

forStatement : 'for'  '(' variablesPart ';' expression ';' statement ')' '{'statementList'}' ;
variableAssignment : IDENTIFIER '=' expression ;


procedureCallStatement : procedureName '(' argumentList? ')' ;

procedureName   locals [ SymtabEntry entry = null ]
    : IDENTIFIER ;


argumentList : argument ( ',' argument )* ;
argument     : expression;

 printStatement   : 'print' printArguments ;
 printlnStatement : 'println' printArguments? ;
printArguments   : '(' printArgument ('+' printArgument)* ')' ;
printArgument    : expression (':' fieldWidth)? ;
fieldWidth       : sign? integerConstant (':' decimalPlaces)? ;
decimalPlaces    : integerConstant ;


expression          locals [ Typespec type = null]
    : simpleExpression (relOp simpleExpression)? ;

simpleExpression    locals [ Typespec type = null ]
    : sign? term (addOp term)* ;

term                locals [ Typespec type = null ]
    : factor (mulOp factor)* ;

factor              locals [ Typespec type = null ]
    : variable             # variableFactor
    | number               # numberFactor
    | characterConstant    # characterFactor
    | stringConstant       # stringFactor
    | functionCall         # functionCallFactor
    //| NOT factor           # notFactor -> pascal
    | '(' expression ')'   # parenthesizedFactor
    ;

variable            locals [ Typespec type = null, SymtabEntry entry = null ]
    : variableIdentifier modifier* ;

modifier  : '[' indexList ']' | '.' field ;
indexList : index ( ',' index )* ;
index     : expression ;

field               locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

functionCall : functionName '(' argumentList? ')' ;
functionName        locals [ Typespec type = null, SymtabEntry entry = null ]
    : IDENTIFIER ;

number          : sign? unsignedNumber ;
unsignedNumber  : integerConstant | doubleConstant ;
integerConstant : INTEGER ;
realConstant    : REAL;
doubleConstant  : DOUBLE;

characterConstant : CHARACTER ;
stringConstant    : STRING ;


relOp : '<' | '<=' | '>' | '>=' | '==' | '!=' ;
addOp : '+' | '-' ;
mulOp : '*' | '/' ;

fragment A : ('a' | 'A') ;
fragment B : ('b' | 'B') ;
fragment C : ('c' | 'C') ;
fragment D : ('d' | 'D') ;
fragment E : ('e' | 'E') ;
fragment F : ('f' | 'F') ;
fragment G : ('g' | 'G') ;
fragment H : ('h' | 'H') ;
fragment I : ('i' | 'I') ;
fragment J : ('j' | 'J') ;
fragment K : ('k' | 'K') ;
fragment L : ('l' | 'L') ;
fragment M : ('m' | 'M') ;
fragment N : ('n' | 'N') ;
fragment O : ('o' | 'O') ;
fragment P : ('p' | 'P') ;
fragment Q : ('q' | 'Q') ;
fragment R : ('r' | 'R') ;
fragment S : ('s' | 'S') ;
fragment T : ('t' | 'T') ;
fragment U : ('u' | 'U') ;
fragment V : ('v' | 'V') ;
fragment W : ('w' | 'W') ;
fragment X : ('x' | 'X') ;
fragment Y : ('y' | 'Y') ;
fragment Z : ('z' | 'Z') ;


CONST     : C O N S T ;
VAR       : V A R ;
IF        : I F ;
ELSE      : E L S E ;
WHILE     : W H I L E ;
DO        : D O ;
FOR       : F O R ;
FUNCTION  : F U N C T I O N ;
SWITCH : S W I T C H ;
CASE: C A S E;
DEFAULT: D E F A U L T;


IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;


DOUBLE     : INTEGER '.' INTEGER
           | INTEGER ('e' | 'E') ('+' | '-')? INTEGER
           | INTEGER '.' INTEGER ('e' | 'E') ('+' | '-')? INTEGER
           ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ;

SINGLE_QUOTE     : '\'';
DOUBLE_QUOTE     : '"' ;


CHARACTER : SINGLE_QUOTE CHARACTER_CHAR SINGLE_QUOTE ;
STRING    : DOUBLE_QUOTE STRING_CHAR* DOUBLE_QUOTE ;


fragment CHARACTER_CHAR : ~('\'')  // any non-quote character
                        ;

fragment STRING_CHAR : DOUBLE_QUOTE DOUBLE_QUOTE  // two consecutive quotes
                     | ~('"')      // any non-quote character
                     ;

// Single-line js comment
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;

// Multi-line (block) js comment
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;



