/*
 * Ejercicio19.java
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
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 */

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main (String[] args) {
		int altura;
		String caracter;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de líneas que mida la pirámide: ");
		altura = s.nextInt();
		
		System.out.print("Introduzca el carácter del que se va a formar la pirámide: ");
		caracter = s.next();
		
		for (int i = 1; i <= altura; i++){ //Este primer bucle indicará las líneas que va a tener, siendo el límite el número que introduzcamos para la altura
			for (int k = altura - i; k > 0; k--){ //Este segundo bucle introducirá los espacios a la izquierda, empezando en el valor de la altura que hemos introducido,
					System.out.print(" "); //actuando como una especie de triángulo rectángulo invertido de espacios
			}
			for (int j = 1; j < i*2; j++){ //Este tercer y último bucle pinta los caracteres, empezando j por el 1 mientras que j sea menor al número de línea por 2...
				System.out.print(caracter); //sin incluir este último, para que así pinte un número de caracteres impar en cada línea (que queda mejor).
			}
			System.out.print("\n");
		}	
		s.close();
	}
}

