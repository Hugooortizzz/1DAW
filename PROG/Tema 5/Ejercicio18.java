/*
 * Ejercicio18.java
 * 
 * Copyright 2025 hugom <hugom@HUGO_PORTATIL>
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
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 */

import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main (String[] args) {
		int numero1;
		int numero2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un primer número: ");
		numero1 = s.nextInt();
		
		System.out.print("Introduzca un segundo número: ");
		numero2 = s.nextInt();
		
		for(int i = numero1; i <= numero2; i = i + 7) {
			System.out.println(i);
		}
		System.out.println(numero2);
		s.close();
	}
}

