/*
 * EjercicioExtra2.java
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
 * Modifica el siguiente programa para hacer que compile y funcione:
 * public class suma{
 * 		public static void main(String [] args) {
 * 			int n2=30, suma=0, n3; suma=n1+n2;
 * 			System.out.println(“LA SUMA ES: “ + suma);
 * 			suma=suma+n3;
 *			System.out.println(suma);
 */

import java.util.Scanner;

public class EjercicioExtra2 {
	
	public static void main (String[] args) {
		int n1, n2, n3, suma;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		n1 = s.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		n2 = s.nextInt();
		
		System.out.print("Introduzca el tercer número: ");
		n3 = s.nextInt();
		
		suma= n1 + n2 + n3;

		System.out.println("LA SUMA ES: " + suma);
		

	}
}

