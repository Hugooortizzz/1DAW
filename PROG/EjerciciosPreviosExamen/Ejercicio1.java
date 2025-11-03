/*
 * Ejercicio1.java
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

public class Ejercicio1 {
	
	public static void main (String[] args) {
		double seleccion; //Lo he asignado como Double para que el usuario no introduzca decimales
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Que personaje quiere seleccionar?");
		System.out.println("1.- Guerrero");
		System.out.println("2.- Mago");
		System.out.println("3.- Arquera");
		seleccion = s.nextDouble();
		
		while ((seleccion < 1) || (seleccion > 3) || (seleccion % 1 != 0)){
			System.out.println("Introduzca una opción válida");
			seleccion = s.nextDouble();
		}
		
		switch ((int) seleccion) { //Y en el switch hace un casting que lo convierte en un INT
			case 1:
			System.out.println("Has elegido al Guerrero. Tu fuerza y resistencia destaca entre los demás");
			break;
			
			case 2:
			System.out.println("Has elegido al Mago. ¡Dominarás la magia desde el inicio!");
			break;
			
			default:
			System.out.println("Has elegido a la Arquera. Podrás enfrentarte a tus enemigos desde una distancia lejana");
			break;
		}
	}
}

