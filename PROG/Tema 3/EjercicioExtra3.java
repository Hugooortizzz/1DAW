/*
 * EjercicioExtra3.java
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
 * Crear una aplicación que calcule la media aritmética de tres notas enteras. Hay que
 * tener en cuenta que la media puede contener decimales.
 */

import java.util.Scanner;

public class EjercicioExtra3 {
	
	public static void main (String[] args) {
		int nota1, nota2, nota3;
		double media;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la primera nota: ");
		nota1 = s.nextInt();
		
		System.out.print("Introduzca la segunda nota: ");
		nota2 = s.nextInt();
		
		System.out.print("Introduzca la tercera nota: ");
		nota3 = s.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("La media final es de " + media);
	}
}

