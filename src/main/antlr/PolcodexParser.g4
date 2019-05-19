parser grammar PolcodexParser;

options { tokenVocab=PolcodexLexer; }

polcodexFile : lines=line+ ;

line      : statement (NEWLINE | EOF) ;

statement : varDeclaration # varDeclarationStatement
          | ifStmt         # ifStatement
          | assignment     # assignmentStatement
          | print          # printStatement ;

print : PRINT LPAREN expression RPAREN ;

varDeclaration : VAR assignment ;

assignment : ID ASSIGN expression ;

expression :
             op=SUB left=expression AND right=expression                      # binaryOperation
           | op=MUL left=expression AND right=expression                      # binaryOperation
           | op=ADD left=expression AND right=expression                      # binaryOperation
           | op=DIV left=expression AND right=expression                      # binaryOperation
           | cmp=EQUAL left=expression AND right=expression                # conditionalExpression
           | cmp=NOTEQUAL left=expression AND right=expression             # conditionalExpression
           | cmp=GREATER left=expression AND right=expression              # conditionalExpression
           | cmp=LOWER left=expression AND right=expression                # conditionalExpression
           | value=expression AS targetType=type                           # typeConversion
           | LPAREN expression RPAREN                                      # parenExpression
           | ID                                                            # varReference
           | MINUS expression                                              # minusExpression
           | INTLIT                                                        # intLiteral
           | DECLIT                                                        # decimalLiteral ;

ifStmt :  IFCHECK  '('? expression ')'? trueStatement=statement (ELSE falseStatement=statement)?;

type : INT     # integer
     | DECIMAL # decimal ;
