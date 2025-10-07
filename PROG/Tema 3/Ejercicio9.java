/*
 * Ejercicio9
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
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * 1
 * 3
 * πr2h
 */

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main (String[] args) {
		double h;
		double r;
		double v;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de h");
		h = s.nextDouble();
		
		System.out.println("Introduzca el valor de r");
		r = s.nextDouble();
		
		v = (3.14*r*r*h)/3;
		
		System.out.println("V es igual a " + v);
	}
}

