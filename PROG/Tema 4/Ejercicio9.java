/*
 * Ejercicio9.java
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
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio9 {
	
	public static void main (String[] args) {
		double a;
		double b;
		double c;
		double discriminante;
		double x1;
		double x2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el valor de a: ");
		a = s.nextDouble();
		
		System.out.print("Introduzca el valor de b: ");
		b = s.nextDouble();
		
		System.out.print("Introduzca el valor de c: ");
		c = s.nextDouble();
		
		discriminante = (Math.pow(b,2)-4*a*c);
		
		if(discriminante > 0){
			x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/ (2 * a);
			x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/ (2 * a);
			System.out.println("El discriminante es positivo (" + discriminante + "), por lo que x tiene dos valores: " + x1 + " y " + x2);
			} else {
				if(discriminante == 0){
				x1 = (-b + Math.sqrt(b*b-4*a*c))/ 2 * a;
				System.out.println("El discriminante es igual a 0, por lo que x tiene un solo valor: " + x1);
				}else{
					System.out.println("El discriminante es negativo (" + discriminante + "), por lo que no existe valor real");
					}
				} 
		
	}
}

