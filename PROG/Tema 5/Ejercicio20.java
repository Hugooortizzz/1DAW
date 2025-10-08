/*
 * Ejercicio20.java
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
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */


import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main (String[] args) {
		int altura;
		String caracter;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de líneas que mida la pirámide: ");
		altura = s.nextInt();
		
		System.out.print("Introduzca el carácter del que se va a formar la pirámide: ");
		caracter = s.next();
		
		
		for (int l = 0; l <= altura * 2; l++){
			System.out.print(" ");
		}
		System.out.print(caracter + "\n");


		for (int i = 1; i < altura; i++){
			for (int k = i; k <= altura * 2; k++){
					System.out.print(" ");
			}
			System.out.print(caracter);
			for (int j = 1; j <= i*2; j++){
				System.out.print(" ");
			}
			System.out.print(caracter);
			System.out.print("\n");
		}	
	}
}

