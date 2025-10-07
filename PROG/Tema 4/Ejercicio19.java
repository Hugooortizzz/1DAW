/*
 * Ejercicio19.java
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
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main (String[] args) {
		int numero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero (hasta 5 dígitos)");
		numero = s.nextInt();
		
		if ((numero <= 9) && (numero >= -9)){
			System.out.println("El número " + numero + " tiene 1 cifra");
		} else{
			if ((numero <= 99 ) && (numero >= -99)){
				System.out.println("El número " + numero + " tiene 2 cifras");
			}else{
				if ((numero <= 999) && (numero >= -999)){
					System.out.println("El número " + numero + " tiene 3 cifras");
				}else{
					if ((numero <= 9999) && (numero >= -9999)){
						System.out.println("El número " + numero + " tiene 4 cifras");
					}else{
						if ((numero <= 99999) && (numero >= -99999)){
							System.out.println("El número " + numero + " tiene 5 cifras");
						}else{
							System.out.println("El número tiene más de 5 cifras");
						}
					}
				}
			}
		}
		
		
		
	}
}

