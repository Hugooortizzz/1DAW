/*
 * Ejercicio3.java
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
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		double euros;
		double pesetas;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de euros");
		euros = s.nextDouble();
		
		pesetas = euros * 166.386;
		
		System.out.println(euros + " euros son " + pesetas + " pesetas");
		
		
	}
}

