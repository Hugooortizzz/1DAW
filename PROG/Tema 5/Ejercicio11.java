/*
 * Ejercicio11.java
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
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11 {
	
	public static void main (String[] args) {
		int numero, cuadrado, cubo;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		numero = s.nextInt();
		
		System.out.println("Numero\tCuadrado\tCubo");
		
		for (int i = 0; i < 5; i++){
			cuadrado = (int) (Math.pow(numero,2));
			cubo = (int) (Math.pow(numero,3));
			System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
			numero ++;
			
		}
		
		
		
		
	}
}

