Funcion s <- suma(a,b) // a y b son parámetros
	Definir s como entero; //variable local
	s=a+b
FinFuncion

Funcion r <- resta(a,b) // a y b son parámetros
	Definir r como entero; //variable local
	r=a-b
FinFuncion

Funcion m <- multiplicacion(a,b) // a y b son parámetros
	Definir m como entero; //variable local
	m=a*b
FinFuncion

Funcion d <- division(a,b) // a y b son parámetros
	Definir d como numero; //variable local
	d=a/b
FinFuncion

Funcion mo <- modulo(a,b) // a y b son parámetros
	Definir mo como entero; //variable local
	mo=a%b
FinFuncion

Funcion introduccion //funcion procedimiento
	Escribir "Bienvenidos a Calculadora Pseint v1"; Esperar 3 segundos;
	Escribir "Podrás realizar operaciones aritméticas simples con dos números introducidos por teclado"; Esperar 3 segundos
	Escribir "Pulsa una tecla para comenzar"; Esperar 3 segundos
	Esperar Tecla;
FinFuncion

Funcion n<-lee_numero(mensaje)
	Definir n como numero;
	Escribir mensaje;
	Leer n;
FinFuncion

Funcion p<-lee_caracter(mensaje)
	Definir p como Caracter;
	Escribir mensaje;
	Leer p;
FinFuncion

Funcion t<-lee_texto(mensaje)
	Definir t como Cadena;
	Escribir mensaje;
	Leer t;
FinFuncion

Funcion operacion<-menu
	Definir operacion como entero;
	Escribir "Introduzca la operación a realizar:";
	Escribir "1: Suma";
	Escribir "2: Resta";
	Escribir "3: Multiplicación";
	Escribir "4: División";
	Escribir "5: Módulo";
	Leer operacion;
FinFuncion



Funcion v<-volverEjecutar
	Definir v como Logico;
	v <- Verdadero;
	Definir p como Caracter;
	
	p <- lee_caracter("Pulsa P para realizar otra operacion o pulsa otra tecla para terminar");
	
	Si p <>'p' y p <> 'P' Entonces
		v = Falso
	FinSi
FinFuncion

Algoritmo calculadorav1
	definir n1,n2, operacion como entero;
	definir p Como Caracter;
	
	introduccion;
	
	repetir
		Limpiar Pantalla;
		n1<-lee_numero("Introduce el primer número")
		
		n2 <- lee_numero("Introduce el segundo número");
		
		operacion <- menu;
		
		
		
		Segun operacion Hacer
			1:
				Escribir suma(n1,n2);
			2:
				Escribir resta(n1,n2);
			3:
				Escribir multiplicacion(n1,n2);
			4:
				si n2 <> 0 entonces
					Escribir division(n1,n2);
				SiNo
					Escribir "No se puede dividir por 0"
				FinSi 
			5:
				Escribir modulo(n1, n2);
			De Otro Modo:
				Escribir "No es una opción valida";
		Fin Segun
		
		
	mientras que volverEjecutar
FinAlgoritmo
