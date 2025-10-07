/*
 * Ejercicio14.java
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
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 */

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main (String[] args) {
		int base;
		int resultado = 1;
		int exponente;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca una base: ");
		base = s.nextInt();
		
		System.out.print("Introduzca un exponente: ");
		exponente = s.nextInt();
		
		for (int i = 1; i <= exponente; i++){
			resultado =  resultado * base;
		}
		System.out.println(resultado);
	}
}

