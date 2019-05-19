parser grammar PolcodexParser;

options { tokenVocab=PolcodexLexer; }

polcodexFile : lines=line+ ;

line      : statement (NEWLINE | EOF) ;

statement : varDeclaration # varDeclarationStatement
          | ifStmt         # ifStatement
          | functionDeclaration   # functionStatement
          | assignment     # assignmentStatement
          | print          # printStatement ;

print : PRINT LPAREN expression RPAREN ;

varDeclaration : VAR assignment ;

assignment : ID ASSIGN expression ;

functionDeclaration : FUNCTION functionName LPAREN argumentList RPAREN functionBody=block ENDFUNCTION;

block : statement+ ;
expression :
             op=SUB left=expression AND right=expression                   # binaryOperation
           | op=MUL left=expression AND right=expression                   # binaryOperation
           | op=ADD left=expression AND right=expression                   # binaryOperation
           | op=DIV left=expression AND right=expression                   # binaryOperation
           | cmp=EQUAL left=expression AND right=expression                # conditionalExpression
           | cmp=NOTEQUAL left=expression AND right=expression             # conditionalExpression
           | left=expression cmp=GREATER  right=expression                 # conditionalExpression
           | left=expression cmp=LOWER  right=expression                   # conditionalExpression
           | value=expression AS targetType=type                           # typeConversion
           | INVOKEFUNCTION functionName LPAREN argumentList RPAREN                       # functionCall
           | LPAREN expression RPAREN                                      # parenExpression
           | ID                                                            # varReference
           | MINUS expression                                              # minusExpression
           | INTLIT                                                        # intLiteral
           | DECLIT                                                        # decimalLiteral ;

argument : expression ;
argumentList : argument? (ADDITIONALARG a=argument)* ;
functionName : ID ;

ifStmt :  IFCHECK  '('? expression ')'? trueStatement=statement (ELSE falseStatement=statement)?;

type : INT     # integer
     | DECIMAL # decimal ;
