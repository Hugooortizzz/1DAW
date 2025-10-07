/*
 * Ejercicio8.java
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
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main (String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double total;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la primera nota: ");
		nota1 = s.nextDouble();
		
		System.out.print("Introduzca la segunda nota: ");
		nota2 = s.nextDouble();
		
		System.out.print("Introduzca la tercera nota: ");
		nota3 = s.nextDouble();
		
		if ((nota1 > 10) || (nota1 < 0) || (nota2 > 10) || (nota2 < 0) || (nota3 > 10) || (nota3 < 0)){
			System.out.println("Has escrito alguna nota mal");
			}else {
				total = (nota1 + nota2 + nota3) / 3;
				System.out.println("La media final es " + total);
				
				if (total < 5) {
					System.out.println("En el boletín aparece como insuficiente");
					}
				if ((total >=  5) &&(total < 6)) {
					System.out.println("En el boletín aparece como suficiente");
					}
				if ((total >= 6) && (total < 7)) {
					System.out.println("En el boletín aparece como bien");
					}
				if ((total >= 7) && (total < 9)) {
					System.out.println("En el boletín aparece como notable");
					}
				if (total >= 9) {
						System.out.println("En el boletin aparece como sobresaliente");
					}	
					
				}
	}
}

