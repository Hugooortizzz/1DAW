Algoritmo Ejercicio2
	Definir n como Entero;
	Definir x como Entero;
	Definir media Como Numero;
	Definir n_mayor como Entero;
	Definir n_menor como Entero;
	Definir contador_pares como Entero;
	Definir contador_impares como Entero;
	
	n_menor = 100;

	
	Escribir("¿Cuántos números quieres introducir?");
	Leer n;
	
	Para i<-1 Hasta n Con Paso 1
		Escribir ("Introduzca un número (0-100)");
		Leer x;
		
		Mientras x<0 O x>100 Hacer
			Escribir ("Introduzca un número válido");
			Leer x;
		Fin Mientras
		
		media = media + x;
		
		Si x > n_mayor
			n_mayor = x;
		FinSi
		
		Si x < n_menor
			n_menor = x;
		FinSi
		
		
		Si x % 2 == 0
			contador_pares = contador_pares + 1;
			
		SiNo
			contador_impares = contador_impares + 1;
		FinSi
	FinPara
	
	media = media / n;
	
	Limpiar Pantalla;
	Escribir("La media aritmética de los números es " + ConvertirATexto(media));
	Escribir("El mayor número introducido es " + ConvertirATexto(n_mayor));
	Escribir("El menor número introducido es " + ConvertirATexto(n_menor));
	Escribir("Se han introducido " + ConvertirATexto(contador_pares) + " números pares");
	Escribir("Se han introducido " + ConvertirATexto(contador_impares) + " números impares");
	
FinAlgoritmo
