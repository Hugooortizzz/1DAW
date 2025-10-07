/*
 * Ejercicio15.java
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
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar
 */

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main (String[] args) {
		int base;
		int exponente;
		int resultado;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la base: ");
		base = s.nextInt();
		resultado = base;
		
		System.out.print("Introduzca el exponente final: ");
		exponente = s.nextInt();
		
		for (int i = 1; i <= exponente; i++){
			System.out.println(base + " ^ " + i + " = " + resultado);
			
			resultado = resultado * base;
		}
		
	}
}

