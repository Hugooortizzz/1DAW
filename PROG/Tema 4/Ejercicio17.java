/*
 * Ejercicio17.java
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
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main (String[] args) {
		int numero;
		int ultimo_digito;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número: " );
		numero = s.nextInt();
		
		if ((numero > 9) || (numero < -9)) {
			ultimo_digito = numero % 10;
			System.out.println("El útltimo digito del número " + numero + " es " + ultimo_digito);
		}else {
			System.out.println("Este número solo tiene una cifra, por lo que su última y única cifra es " + numero);
		}
	}
}

