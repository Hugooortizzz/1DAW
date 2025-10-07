/*
 * Ejercicio6.java
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
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =
 * √2h
 * g
 * siendo g = 9.81m/s
 * 2
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio6 {
	
	public static void main (String[] args) {
		double h;
		double t;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de h: ");
		h = s.nextDouble();
		
		if (h == 0){
			t = 0;
		}else {
			t = Math.sqrt((2*h) / 9.81);
			}
		
		
		System.out.println("El resultado de t es igual a " + t);
	}
}

