lexer grammar PolcodexLexer;

// Whitespace
NEWLINE            : '\r\n' | 'r' | '\n' ;
WS                 : [\t ]+ -> skip ;

// Keywords
VAR                : 'MAM' ;
PRINT              : 'WYPLUJ';
AS                 : 'as';
INT                : 'Int';
DECIMAL            : 'Decimal';

ADD                : 'ILE_TO_RAZEM_BENDZIE';
SUB                : 'ODEJMNIJ_MIE_TO';
MUL                : 'TABLICZKA_MNOZENIA_PROSZE';
DIV                : 'PODZIEL_MIE_TO';
AND                : 'I';

FUNCTION           : 'MAJSTRUJEMY_FUNKCYJKE';
ENDFUNCTION        : 'KONIEC_MAJSTROWANIA' ;
ADDITIONALARG      : 'I_TO';
INVOKEFUNCTION     : 'PRZYZYWAM_CIE_FUNKCJOOO' ;

IFCHECK            : 'SPRAWDZANKO';
ELSE               : 'A_JAK_NIE';

EQUAL              : 'SOM_TAKIE_SAME' ;
NOTEQUAL           : 'SOM_ROZNE' ;
GREATER            : 'WINCYJ_NIZ' ;
LOWER              : 'MNIJ_NIZ' ;

FOR                : 'TAK_DLUGO_JAK' ;
FROM               : 'OD' ;
TO                 : 'DO' ;
ENDFOR             : 'NO_I_KONIEC_TEGO' ;
// Literals
INTLIT             : '0'|[1-9][0-9]* ;
DECLIT             : '0'|[1-9][0-9]* '.' [0-9]+ ;

// Operators
PLUS               : '+' ;
MINUS              : '-' ;
ASTERISK           : '*' ;
DIVISION           : '/' ;
ASSIGN             : 'TO' ;
LPAREN             : '(' ;
RPAREN             : ')' ;
COMMA              : ',' ;

// Identifiers
ID                 : [_]*[a-z][A-Za-z0-9_]* ;
