/*
 * Ejercicio17.java
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
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 */

import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main (String[] args) {
	int numero;
	int total = 0;
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("Introduzca un valor para sumar sus 100 números siguientes (mayor que 0): ");
	numero = s.nextInt();
	
	while (numero < 0){
			System.out.print("Introduzca un valor válido");
			System.out.print("Introduzca un valor para sumar sus 100 números siguientes (mayor que 0): ");
			numero = s.nextInt();
	}
		
	for (int i = numero; i <= numero + 100; i++){
			total = total + i;
	}
	System.out.print("El total es " + total);
	}
}

