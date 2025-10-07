/*
 * While.java
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
 * 
 */

import java.util.Scanner;

public class While {
	
	public static void main (String[] args) {
		double notaTotal = 0;
		int alumno = 1;
		double notaIntroducida = 0;
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++){
				System.out.print("Introduzca nota para el alumno " + alumno + ": ");
				notaIntroducida = s.nextDouble();
				notaTotal = notaTotal + notaIntroducida;
				alumno ++;
		}
		notaTotal = notaTotal / 10;
		System.out.println("La media de los 10 alumnos es " + notaTotal);
		
	}
}

