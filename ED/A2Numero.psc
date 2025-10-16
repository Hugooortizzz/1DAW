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

Funcion selector<-menu
	Definir selector como numero;
	Escribir "Seleccione una opción:";
	Escribir "1: Comprobar si es positivo";
	Escribir "2: Comprobar si es par";
	Escribir "3: Comprobar si es múltiplo de 3";
	Leer selector;
FinFuncion

Funcion posi(a)
	Si a >= 0 Entonces
		Escribir "El número es positivo";
	SiNo
		Escribir "El número es negativo";
	Fin Si
FinFuncion

Funcion p2(a)
	Si a % 2 == 0 Entonces
		Escribir "El número es par";
	SiNo
		Escribir "El número es impar";
	Fin Si
FinFuncion

Funcion m3(a)
	Si a % 3 == 0 Entonces
		Escribir "El número múltiplo de 3";
	SiNo
		Escribir "El número NO es múltiplo de 3";
	Fin Si
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

Algoritmo A2Numero
	Definir n, selector como numero;

	repetir
		
		n <- lee_numero("Introduzca un número");
		
		selector <- menu;
		
		Segun selector Hacer
			1:
				posi(n);
			2:
				p2(n);
			3:
				m3(n);
			De Otro Modo:
				Escribir "No es una opción valida";
		Fin Segun
	Mientras Que volverEjecutar
	
	
	
FinAlgoritmo
