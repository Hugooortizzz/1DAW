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
		int f0 = 0;
		int f1 = 1;
		int n = 1;
		int longitud;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("¿Hasta que número quieres que mueste la serie de Fibonacci?: ");
		longitud = s.nextInt();
		
		while (n <= longitud){
			System.out.println(f0 + "+" +  f1 + " = " + n);
			
			f1 = f0;
			f0 = n;
		
			n = f0 + f1;
			
		}
		s.close();
	}
}

