/*
 * Ejercicio9.java
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
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 */

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main (String[] args) {
		int numero;
		int cifras=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		numero = s.nextInt();
		
		while (numero > 0){ //Hasta que el bucle sea 0...
			numero = numero / 10; //... el programará irá dividiendo entre 10, para así ir "desplazando la coma hacia la izquierda" hasta que no haya mas unidades...
			cifras ++; //El hecho de que se repita el bucle significa que siguen quedando cifras, por lo que se sumará 1 al contador de cifras.
		}
		System.out.println("El número tiene " + cifras + " cifras");

		s.close();
	}
}

