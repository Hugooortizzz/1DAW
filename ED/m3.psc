//Crea un programa que genere dos números al azar entre el 0 y el 100, y pida al usuario que calcule e introduzca su suma. 
//Si la respuesta no es correcta, deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte. 

Algoritmo m3
	Definir n1, n2, suma, intentos como Entero;
	n1 = AZAR(101);
	n2 = AZAR(101);
	intentos = 1;
	Mientras suma <> n1 + n2 Hacer
		Escribir ("¿Cuanto es " + ConvertirATexto(n1) + " + " + ConvertirATexto(n2) + "?");
		Leer suma;
		Si suma == n1 + n2 Entonces
			Escribir("Has acertado en " + ConvertirATexto(intentos) + " intento/s");
		SiNo
			Escribir("Has fallado");
			intentos = intentos + 1;
		Fin Si
	Fin Mientras
	
	
FinAlgoritmo
