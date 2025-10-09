funcion puntos <- tira_dados
	definir dado1, dado2, puntos como entero; //variables locales
	
	escribir "Pulsa para tirar los dados"
	esperar Tecla;
	
	dado1 <- azar(6)+1;
	dado2 <- azar(6)+1;
	puntos = dado1+dado2;
	Escribir "has sacado " dado1 " y " dado2 ", total " puntos;
FinFuncion


Algoritmo juego_dados
	definir puntosj1, puntosj2 como entero; //variables globales
	
	Escribir "tirada jugador 1";
	puntosj1 = tira_dados;
	
	Escribir "tirada jugador 2";
	puntosj2 = tira_dados;
	
FinAlgoritmo
