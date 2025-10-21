/*
 * Ejercicio12.java
 * 
 * Copyright 2025 hugom <hugom@HUGO-PC>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
 * debe introducir por teclado.
 */

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main (String[] args) {
		int f0 = 0; //He creado 3 variables que usaré para las operaciones, f0 que es el primer número de la suma
		int f1 = 1; //f1 que es el segundo número de la suma
		int n = 1; // Y n que es el resultado de la suma
		int longitud;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("¿Hasta que número quieres que mueste la serie de Fibonacci?: ");
		longitud = s.nextInt();
		
		while (n <= longitud){ //El bucle se estará ejecutando hasta que el último número de la serie llegue a la longitud indicada
			System.out.println(f0 + "+" +  f1 + " = " + n);
			
			f0 = f1; //El primer número de la nueva suma se establece como el segundo número de la anterior suma
			f1 = n; //El segundo número de la nueva suma se establece como el resultado de la anterior suma
			n = f0 + f1; //Y se suma para obtener el resultado de la nueva suma
		
			
		}
		s.close();
	}
}

