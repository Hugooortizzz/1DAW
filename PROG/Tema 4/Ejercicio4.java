/*
 * Ejercicio4.java
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
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 */


import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		int horas_trabajadas;
		int salario;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca las horas trabajadas");
		horas_trabajadas = s.nextInt();
		
		if (horas_trabajadas <= 40) {
			salario = horas_trabajadas * 12;
			}else {
				salario = (horas_trabajadas - 40) * 16 + 480;
				}
			
		System.out.println("Si trabaja " + horas_trabajadas + " tendrá un salario semanal de " + salario + " euros");
	}
}
