/*
 * Ejercicio18.java
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
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */

import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main (String[] args) {
		int numero;
		int primer_digito = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		numero = s.nextInt();
				
		if ((numero <= 9) && (numero >= -9)){
				System.out.println("El número tiene una sola cifra, por lo que su primer y único digito es " + numero);
			} else{
				if ((numero <= 99 ) && (numero >= -99)){
					primer_digito = (int) (numero * 0.1);
					System.out.println("El primer digito del número " + numero + " es " + primer_digito);
				}else{
					if ((numero <= 999) && (numero >= -999)){
						primer_digito = (int) (numero * 0.01);
						System.out.println("El primer digito del número " + numero + " es " + primer_digito);
					}else{
						if ((numero <= 9999) && (numero >= -9999)){
							primer_digito = (int) (numero * 0.001);
							System.out.println("El primer digito del número " + numero + " es " + primer_digito);
						}else{
							if ((numero <= 99999) && (numero >= -99999)){
								primer_digito = (int) (numero * 0.0001);
								System.out.println("El primer digito del número " + numero + " es " + primer_digito);
							}else{
								System.out.println("El número tiene más de 5 cifras");
							}
						}
					}
				}
			}
		}
	}
	
		


