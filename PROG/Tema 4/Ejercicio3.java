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
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		int numero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 7");
		numero = s.nextInt();
		
		switch (numero){
			case 1:
			System.out.println("Hoy es Lunes");
			break;
			
			case 2:
			System.out.println("Hoy es Martes");
			break;
			
			case 3:
			System.out.println("Hoy es Miércoles");
			break;
			
			case 4:
			System.out.println("Hoy es Jueves");
			break;
			
			case 5:
			System.out.println("Hoy es Viernes");
			break;
			
			case 6:
			System.out.println("Hoy es Sábado");
			break;
			
			case 7:
			System.out.println("Hoy es Domingo");
			break;
			
			default:
			System.out.println("Introduzca un número válida");
			}
	}
}

