Algoritmo Reloj
	
	definir h1, h2, h3 como entero;
	definir mostrarHora como logica;
	
	mostrarHora = Verdadero;
	
	mientras mostrarHora
	para h2<-0 hasta 2
		si h2=2 Entonces
			h3=3;
		sino
			h3=9;
		FinSi
		para h1<-0 hasta h3
			Escribir h2 "" h1;
			esperar 1 segundo;
			Limpiar Pantalla;
		FinPara
	FinPara
	Fin Mientras
	
	
	
FinAlgoritmo
