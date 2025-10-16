Algoritmo s3
	Definir dia, bucle como Entero;
	
	bucle = 1;
	
	
	Mientras bucle == 1 Hacer
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
		Escribir ("¿Quieres repetir el programa (1) o quieres cerrarlo (0)")
		Leer bucle;
	Fin Mientras
FinAlgoritmo
