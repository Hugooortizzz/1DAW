Funcion s <- suma(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a+b
FinFuncion

Funcion r <- resta(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a-b
FinFuncion

Funcion m <- multiplicacion(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a*b
FinFuncion

Funcion d <- division(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a/b
FinFuncion

Funcion mo <- modulo(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a%b
FinFuncion

Algoritmo funciones2
	Definir n1,n2, s como entero; //variables globales
	n1=20;
	n2=5;
	
	s=suma(n1, n2);
	Escribir s;
	
	s=resta(n1, n2);
	Escribir s;
	
	s=multiplicacion(n1, n2);
	Escribir s;
	
	s=division(n1, n2);
	Escribir s;
	
FinAlgoritmo
