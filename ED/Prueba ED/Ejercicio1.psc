Algoritmo Ejercicio1
	Definir x como Entero;
	Definir contador_divisores como Entero;
	Definir contador_primos como Entero;

	Para i<-1 Hasta 5 Con Paso 1 Hacer
		contador_divisores = 0;
		Escribir("Introduzca el número " + ConvertirATexto(i));
		Leer x;
		
		
		Para j<-1 Hasta x Con Paso 1 Hacer
			Si x % j == 0
				contador_divisores = contador_divisores + 1;
			FinSi
		FinPara
		
		Si contador_divisores <= 2
			contador_primos = contador_primos + 1;
			Escribir("El número " + ConvertirATexto(x) + " es primo ");
		SiNo
			Escribir("El número " + ConvertirATexto(x) + " no es primo ");
		FinSi

		Esperar Tecla;
		Limpiar Pantalla;
	Fin Para
	Escribir ("Has introducido " + ConvertirATexto(contador_primos) + " números primos");
FinAlgoritmo
