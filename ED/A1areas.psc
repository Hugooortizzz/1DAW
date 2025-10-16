Funcion introduccion
	Escribir "Bienvenidos a la Calculadora de Áreas"; Esperar 3 segundos;
	Escribir "Podrás calcular las áreas de distintas formas introduciendo números por teclado"; Esperar 3 segundos
	Escribir "Pulsa una tecla para comenzar"; Esperar 3 segundos
	Esperar Tecla;
FinFuncion

Funcion p<-lee_caracter(mensaje)
	Definir p como Caracter;
	Escribir mensaje;
	Leer p;
FinFuncion

Funcion area<-menu
	Definir area como numero;
	Escribir "Introduzca el área que quieres calcular:";
	Escribir "1: Área de un rectángulo";
	Escribir "2: Área de un triángulo";
	Escribir "3: Área de un círculo";
	Escribir "4: Área de un rombo";
	Leer area;
FinFuncion

Funcion r <- rectangulo
	Definir b, a, r como numero;
	Escribir("Introduzca la base");
	Leer b;
	
	Escribir("Introduzca la altura");
	Leer a;
	
	r = b * a;
FinFuncion

Funcion t <- triangulo
	Definir b, a, t como numero;
	Escribir("Introduzca la base");
	Leer b;
	
	Escribir("Introduzca la altura");
	Leer a;
	
	t = (b * a) / 2;
FinFuncion

Funcion ro <- rombo
	Definir dmayor, dmenor, ro como numero;
	Escribir("Introduzca la diágonal mayor");
	Leer dmayor;
	
	Escribir("Introduzca la diágonal menor");
	Leer dmenor;
	
	ro = (dmayor * dmenor) / 2;
FinFuncion

Funcion c <- circulo
	Definir r, c como numero;
	Escribir("Introduzca el radio");
	Leer r;

	c = PI * (r*r);
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

Algoritmo A1areas
	Definir n1, n2, area como numero;
	
	introduccion;
	
	
	
	repetir
		
		area <- menu;
		
		Segun area Hacer
			1:
				Escribir rectangulo;
			2:
				Escribir triangulo;
			3:
				Escribir circulo;
			4:
				Escribir rombo;
			De Otro Modo:
				Escribir "No es una opción valida";
		Fin Segun
	Mientras Que volverEjecutar
	
	
	
FinAlgoritmo
