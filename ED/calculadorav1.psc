Algoritmo calculadorav1
	definir n1,n2, operacion como entero;
	definir p Como Caracter;
	definir volverEjecutar como logico;
	
	Escribir "Bienvenidos a Calculadora Pseint v1"; Esperar 3 segundos;
	Escribir "Podrás realizar operaciones aritméticas simples con dos números introducidos por teclado"; Esperar 3 segundos
	Escribir "Pulsa una tecla para comenzar"; Esperar 3 segundos
	Esperar Tecla;
	
	volverEjecutar = verdadero;
	
	repetir
		Limpiar Pantalla;
		Escribir "Introduzca el primer número";
		Leer n1; 
		
		Escribir "Introduzca el segundo número";
		Leer n2;
		
		Escribir "Introduzca la operación a realizar:";
		Escribir "1: Suma";
		Escribir "2: Resta";
		Escribir "3: Multiplicación";
		Escribir "4: División";
		Escribir "5: Módulo";
		Leer operacion;
		
		Segun operacion Hacer
			1:
				Escribir n1 + n2;
			2:
				Escribir n1 - n2;
			3:
				Escribir n1 * n2
			4:
				si n2 <> 0 entonces
					Escribir n1 / n2
				SiNo
					Escribir "No se puede dividir por 0"
				FinSi 
			5:
				Escribir n1 % n2
			De Otro Modo:
				Escribir "No es una opción valida";
		Fin Segun
		
		Escribir "Pulsa P para realizar otra operacion o pulsa otra tecla para terminar";
		Leer p;
		Si p <>'p' y p <> 'P' Entonces
			volverEjecutar = Falso
		FinSi
	mientras que volverEjecutar
FinAlgoritmo
