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
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		double opcion;
		int recursos = 0;
		
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("Introduce la cantidad recogida (0 para terminar): ");
			opcion = s.nextDouble();
			while ((opcion < 0) || (opcion % 1 != 0)){
				System.out.println("Introduzca una cantidad válida (entero positivo)");
				opcion = s.nextDouble();
			}
			
			recursos += opcion;
		
		}while (opcion != 0);
		
		System.out.println("Total de recursos recogidos: " + (int) recursos);
	}
}

