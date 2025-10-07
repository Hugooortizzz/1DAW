/*
 * PrimeraClase.java
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

public class PrimeraClase {
	
	public static void main (String[] args) {
		String dia;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("¿Que día es?: ");
		dia = s.next();
		
		switch(dia){
			case "lunes":
			case "Lunes":
			case "martes":
			case "Martes":
			System.out.println("El " + dia + " a primera toca programación");
			break;
			
			case "miercoles":
			case "Miercoles":
			System.out.println("El miércoles a primera toca base de datos");
			break;
			
			case "Jueves":
			case "jueves":
			System.out.println("El jueves a primera toca Entorno de Desarrollo");
			break;
			
			case "Viernes":
			case "viernes":
			System.out.println("El viernes a primera toca Lenguaje de marcas");
			break;
			
			default:
			System.out.println("Introduzca una fecha válida");
			
		}	
		
	}
}

