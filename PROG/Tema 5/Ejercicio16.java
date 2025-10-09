/*
 * Ejercicio16.java
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
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 */

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main (String[] args) {
		int numero;
		int divisible = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número para saber si es primo: ");
		numero = s.nextInt();
		
		for (int i = 1; i <= numero; i++){
			if (numero % i == 0){
				divisible ++;
			}
		}
		
		if (divisible > 2){
			System.out.println("El número " + numero + " no es primo");
	}else{
		System.out.println("El número " + numero + " es primo");
	}
	s.close();
}
}
