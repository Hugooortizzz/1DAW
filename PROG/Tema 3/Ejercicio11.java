/*
 * Ejercicio11.java
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
 * Realiza un conversor de Kb a Mb.
 */

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main (String[] args) {
		int kb;
		double mb;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca los Kilobits");
		kb = s.nextInt();
		
		mb = kb * 0.001;
		
		System.out.println(kb + " Kilobits son " + mb + " Megabits");
	}
}

