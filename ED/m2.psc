Algoritmo m2
	Definir n1, n2, suma como Entero;
//Haz un programa que permita calcular la suma de pares de números. Pedirá dos números al usuario y mostrará su suma, 
//volviendo a repetir hasta que ambos números introducidos sean 0.


	
	Definir bucle como Logico;
	
	Bucle = Falso;
	
	Mientras bucle = Falso Hacer
		Escribir ("Introduzca el primer número");
		Leer n1;
		
		Escribir("Introduzca el segundo número");
		Leer n2;
		
		Si n1 == 0 y n2 == 0 Entonces
			Bucle = Verdadero;
		SiNo
			suma = n1 + n2;
			Escribir "El resultado de sumar " + ConvertirATexto(n1) + " + " + ConvertirATexto(n2) + " es " + ConvertirATexto(suma)
		Fin Si
	Fin Mientras
FinAlgoritmo
