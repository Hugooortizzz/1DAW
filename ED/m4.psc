//Crea un programa que pida al usuario un código de usuario y una contraseña. Deberá repetirse hasta que 
//el código sea "1" y la contraseña sea "1234".

Algoritmo m4
	Definir codigo como Entero;
	Definir contraseña, usuario como Cadena;
	
	Mientras codigo <> 1 y contraseña <> "1234" Hacer
		Escribir ("Introduzca un código (1 para acabar)");
		Leer codigo;
		
		Escribir ("Introduzca un usuario");
		Leer usuario;
		
		Escribir ("Introduzca un contraseña (1234 para acabar)");
		Leer contraseña;
		
		Escribir("Código: " + ConvertirATexto(codigo));
		Escribir("Usuario: " + usuario);
		Escribir("Contraseña: " + contraseña);
	Fin Mientras
FinAlgoritmo
