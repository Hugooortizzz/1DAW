/*
 * Ejercicio13.java
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
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.

 */

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main (String[] args) {
		double primer_examen;
		double media_deseada;
		double nota_necesaria;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la nota del primer examen: ");
		primer_examen = s.nextDouble();
		
		System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
		media_deseada = s.nextDouble();
		
		nota_necesaria = (media_deseada - primer_examen * 0.4) / 0.6;
		
		System.out.print("Para tener un " + media_deseada + " en el trimestre necesitas sacar un " + nota_necesaria + " en el segundo examen");
		
	}
}

