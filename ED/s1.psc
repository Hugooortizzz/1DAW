//Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) y escriba el nombre de ese día 
//(por ejemplo, "martes" para el día 2). Debes emplear la orden SEGUN

Algoritmo s1
	Definir dia como Entero;
	
	Escribir("Introduzca un día de la semana (1-7)");
	Leer dia;
	
	Segun dia Hacer
		1:
			Escribir("Lunes");
		2:
			Escribir("Martes");
		3:
			Escribir("Miércoles");
		4:
			Escribir("Jueves");
		5:
			Escribir("Viernes");
		6:
			Escribir("Sábado");
		7:
			Escribir("Domingo");
		De Otro Modo:
			Escribir("No has introducido un número válido");
	Fin Segun
FinAlgoritmo
