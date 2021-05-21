grammar PsiCoder;

//gramatica de Psicoder

raiz : (f_principal) EOF;//desde la raiz de determina si es principal funcion o estructura
f_principal: FP contenido* FFP;
contenido: declaracion | lectura | imprimir | condicional;//llena con cada una de las distintas intrucciones que pueden estar dentro de una función

//declaracion y asignacion de todas kas posibles variables
declaracion: varBooleano | varEntero | varReal | varCaracter | varCadena;
varBooleano : BOOLEANO ID extvarB;//declaraciones para variables de tipo booleano
extvarB : TK_PYC | TK_ASIG TK_BOOLEANO extvarB | TK_COMA ID extvarB;  //multiples variables y asignaciones booleano
varEntero : ENTERO ID extvarE;//declaraciones para variables de tipo entero
extvarE : TK_PYC | TK_ASIG TK_ENTERO extvarE | TK_COMA ID extvarE;  //multiples variables y asignaciones entero
varReal : REAL ID extvarR;//declaraciones para variables de tipo real
extvarR : TK_PYC | TK_ASIG TK_REAL extvarR | TK_COMA ID extvarR;  //multiples variables y asignaciones real
varCaracter : CARACTER ID extvarC;//declaraciones para variables de tipo caracter
extvarC : TK_PYC | TK_ASIG TK_CARACTER extvarC | TK_COMA ID extvarC; //multiples variables y asignaciones caracter
varCadena : CADENA ID extvarS;//declaraciones para variables de tipo cadena
extvarS : TK_PYC | TK_ASIG TK_CADENA extvarS | TK_COMA ID extvarS;//multiples variables y asignaciones cadena

//logica de parentesis y operadores que se usan para crear una operacion coherente
operacion : expresion (operador expresion)*;
expresion : tipovar | TK_PAR_IZQ operacion TK_PAR_DER;
operador : TK_MAS | TK_MENOS | TK_MULT | TK_DIV | TK_MOD;
tipovar : TK_ENTERO | TK_REAL | ID ;

//logica de lectura de datos por consola
lectura: LEER TK_PAR_IZQ ID TK_PAR_DER TK_PYC ;

//logica de impresion de datos por consola
imprimir: IMPRIMIR TK_PAR_IZQ impresion TK_PAR_DER TK_PYC ;
impresion: varimpresion (TK_COMA varimpresion)*;
varimpresion: TK_BOOLEANO | TK_ENTERO | TK_REAL | TK_CARACTER | TK_CADENA | operacion | ID;

//condiciones para declarar un if
condicional : SI operacionlogica ENTONCES contenido+ (SI_NO contenido+)? FIN_SI ;
operacionlogica : TK_PAR_IZQ  varimpresion  comparador varimpresion (operadorlogico varimpresion  comparador varimpresion )? TK_PAR_DER;

//tokens referentes a operaciones logicas
operadorlogico: TK_Y | TK_O;
comparador: TK_MENOR | TK_MAYOR | TK_MENOR_IGUAL | TK_MAYOR_IGUAL | TK_IGUAL;

//token de palabras y simbolos reservadas
FP : 'funcion_principal';
FFP : 'fin_principal';
LEER :'leer';
IMPRIMIR : 'imprimir';
SI : 'si';
ENTONCES: 'entonces';
FIN_SI : 'fin_si';
SI_NO: 'si_no';
BOOLEANO : 'booleano';
ENTERO : 'entero';
REAL : 'real';
CARACTER :'caracter';
CADENA : 'cadena';
TK_PYC : ';';
TK_ASIG : '=';
TK_COMA : ',';
TK_MAS : '+';
TK_MENOS : '-';
TK_MULT : '*';
TK_DIV : '/';
TK_MOD : '%';
TK_PAR_IZQ : '(';
TK_PAR_DER : ')';
TK_Y : '&&';
TK_O : '||';
TK_MENOR : '<';
TK_MAYOR : '>';
TK_MENOR_IGUAL : '<=';
TK_MAYOR_IGUAL : '>=';
TK_IGUAL : '==';


TK_BOOLEANO : ( 'falso' | 'verdadero');
ID :[A-Za-z_]+[0-9]*;
TK_ENTERO: ('-')?(('0'..'9') | (('1'..'9')('0'..'9')+));
TK_REAL: ('-')?(('0'..'9') | (('1'..'9')('0'..'9')+))[.]('0'..'9')+;
TK_CADENA: '"'[a-zA-Z0-9_ \t\r\n]+'"';
TK_CARACTER:'\''[a-zA-Z0-9_ \t\r\n]'\'';
ESP : [ \t\r\n]+ -> skip;

