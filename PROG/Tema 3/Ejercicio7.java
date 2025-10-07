/*
 * Ejercicio7.java
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
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		double base_imponible;
		double iva;
		double total;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible");
		base_imponible = s.nextDouble();
		
		iva = base_imponible * 0.21;
		total = base_imponible + iva;
		
		System.out.println("La factura de una base imponible de " + base_imponible + " cuyo iva es de " + iva + " es igual a " + total);
	}
}

