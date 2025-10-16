//Prepara un programa que divida dos números que introduzca el usuario. Si el segundo número es cero, se le deberá avisar y 
//	volver a pedir tantas veces como sea necesario, hasta que introduzca un número distinto de cero, momento en que se calculará y 
//	mostrará el resultado de la división.

Algoritmo m5
	Definir n1, n2, division como Entero;
	n2 = 0
	
	Escribir("Introduzca el primer número");
	Leer n1;
	
	Mientras n2 == 0 Hacer
		Escribir("Introduzca el segundo número");
		Leer n2;
		
		Si n2 == 0 Entonces
			Escribir("El segundo número no puede ser 0")
		Fin Si
	Fin Mientras
	
	division = n1 / n2;
	
	Escribir(ConvertirATexto(n1) + " / " + ConvertirATexto(n2) + " = " + ConvertirATexto(division));
		
FinAlgoritmo
