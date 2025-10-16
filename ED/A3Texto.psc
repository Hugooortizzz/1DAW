Funcion t<-lee_texto(mensaje)
	Definir t como Cadena;
	Escribir mensaje;
	Leer t;
FinFuncion

Funcion p<-lee_caracter(mensaje)
	Definir p como Caracter;
	Escribir mensaje;
	Leer p;
FinFuncion

Funcion opt<-menu
	Definir opt como numero;
	Escribir "Seleccione una opción:";
	Escribir "1: Calcular la longitud del texto";
	Escribir "2: Comprobar cuantas palabras tiene el texto";
	Escribir "3: Comprobar cuantas vocales tiene el texto.";
	Leer opt;
FinFuncion

Funcion longitudtexto(a)
	Definir l como Numero;
	l = Longitud(a);
	Escribir ("El texto " + a + " tiene " + ConvertirATexto(l) + " caracteres");
FinFuncion

Funcion palabras(a)
	Definir l como Numero;
	Definir c como Texto;
	Definir p como Numero;
	
	l = Longitud(a);
	
	Para i<-0 Hasta l Con Paso i+1 Hacer
		c = subcadena(a, i, i)
		si c = " " Entonces
			p = p + 1;
		FinSi
	Fin Para
	Escribir ("El texto " + a + " tiene " + ConvertirATexto(p + 1) + " palabras");
FinFuncion

Funcion vocales(a)
	Definir l como Numero;
	Definir c como Texto;
	Definir v como Numero;
	
	l = Longitud(a);
	
	Para i<-0 Hasta l Con Paso i+1 Hacer
		c = subcadena(a, i, i)
		si c = "a" O c ="e" O c = "i" O c = "o" O c = "u" Entonces
			v = v + 1;
		FinSi
	Fin Para
	Escribir ("El texto " + a + " tiene " + ConvertirATexto(v) + " vocales");
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

Algoritmo A3Texto
	Definir txt como Cadena;
	Definir opt como Numero;
	
	repetir
		
		txt <- lee_texto("Introduzca un texto");
		opt <- menu;
		
		Segun opt Hacer
			1:
				longitudtexto(txt);
			2:
				palabras(txt);
			3:
				vocales(txt);
			De Otro Modo:
				Escribir "No es una opción valida";
		Fin Segun
	Mientras Que volverEjecutar
	
	
	
FinAlgoritmo
