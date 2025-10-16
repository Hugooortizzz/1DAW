//Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras que no introduzca 
//"1234". Cuando finalmente escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.

Algoritmo m1
	Definir contraseña como Entero;
	
	Mientras contraseña <> 1234 Hacer
		Escribir ("Introduzca la contraseña");
		Leer contraseña;
		Si contraseña == 1234 Entonces
			Escribir("La contraseña es correcta");
		SiNo
			Escribir("La contraseña es incorrecta");
		Fin Si
	Fin Mientras
FinAlgoritmo
