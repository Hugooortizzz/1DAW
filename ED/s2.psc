//Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y escriba el nombre 
//del mes correspondiente (por ejemplo, "abril"). Debes usar la orden SEGUN.

Algoritmo s2
	Definir mes como Entero;
	
	Escribir("Introduzca un mes del año (1-12)");
	Leer mes;
	
	Segun mes Hacer
		1:
			Escribir("Enero");
		2:
			Escribir("Febrero");
		3:
			Escribir("Marzo");
		4:
			Escribir("Abril");
		5:
			Escribir("Mayo");
		6:
			Escribir("Junio");
		7:
			Escribir("Julio");
		8:
			Escribir("Agosto");
		9:
			Escribir("Septiembre");
		10:
			Escribir("Octubre");
		11:
			Escribir("Noviembre");
		12:
			Escribir("Diciembre");
		De Otro Modo:
			Escribir("No has introducido un número válido");
	Fin Segun
FinAlgoritmo
