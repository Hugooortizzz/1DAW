/*
 * Ejercicio21.java
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
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 * mantiene la nota media anterior.

 */

import java.util.Scanner;

public class Ejercicio21 {
	
	public static void main (String[] args) {
		double nota1, nota2, media;
		boolean recuperacion;
		String aptitud;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nota del primer control: ");
		nota1 = s.nextDouble();
		
		System.out.print("Nota del segundo control: ");
		nota2 = s.nextDouble();
		
		media = (nota1 + nota2) / 2;
		recuperacion = media < 5;
		
		if ((nota1 > 10) || (nota1 < 0) || (nota2 > 10) || (nota2 < 0)){
			System.out.println("No has introducido notas reales");
	}else{
		
		if (recuperacion == false){
				System.out.println("Tu nota de Programación es " + media);
			}else{
				System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
				s.nextLine(); //MUY IMPORTANTE LIMPIAR EL BUFFER, si no se come el enter del anterior input y el siguiente input lo salta sin permitir escribir nada
				aptitud = s.nextLine();
				
				switch (aptitud){
				case "apto":
				case "Apto":
				case "APTO":
				media = 5;
				System.out.println("Tu nota de Programación es " + media);
				break;
				
				case "no apto":
				case "No apto":
				case "No Apto":
				case "NO APTO":
				System.out.println("Tu nota de Programación es " + media);
				break;
				
				default:
				System.out.println("Introduzca un valor válido");
				break;
				
				}
			}
	}
		
		
	}
}

