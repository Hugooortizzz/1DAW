/*
 * Ejercicio5.java
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
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
 * b = 0).
 */

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[] args) {
		double a;
		double b;
		double x;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el valor de a: ");
		a = s.nextDouble();
		
		System.out.print("Introduce el valor de b: ");
		b = s.nextDouble();
		
			
		if (a == 0) {
			if (b == 0){
			System.out.println("La ecuación no tiene solución");
			}else {
				System.out.println("La ecuación es infinita");
				}
			}else {
					x = -b/a;
					System.out.println(x);
				}
		
		
		
	}
}

