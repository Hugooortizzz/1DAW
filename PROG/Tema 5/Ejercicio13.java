/*
 * Ejercicio13.java
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
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main (String[] args) {
		int numero = 0;
		int positivos = 0;
		int negativos = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca 10 números, positivos o negativos");
		
		for (int i = 0; i < 10; i++){ //El bucle se repetirá 10 veces para poder introducir 10 números
			System.out.print("Introduzca un número: ");
			numero = s.nextInt();
			
			if (numero >= 0){ //Si el número es mayor que 0 (positivo), se sumará 1 al contador de positivos
				positivos ++;
			}else {
				negativos ++; //En cualquier otro caso (numero menor que 0, negativo), se sumará 1 al contador de negativos
			}
		}
		
		System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos");

		s.close();
		
	}
}

