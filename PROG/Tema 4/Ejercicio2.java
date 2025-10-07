/*
 * Ejercicio2.java
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
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 */

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		int hora;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Qué hora es?: ");
		hora = s.nextInt();
		
		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("Buenos días");
			if ((hora > 12) && (hora <= 20)) {
			System.out.println("Buenas tardes");
			}
			}else {
				System.out.println("Buenas noches");
				}
			
		
		
		
		
	}
}

