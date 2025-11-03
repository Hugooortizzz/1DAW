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
 * 
 */

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		double opcion;
		int total_gastado = 0;
		
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("TIENDA DE OBJETOS");
			System.out.println("1.- Espada básica - 200 monedas");
			System.out.println("2.- Escudo ligero - 100 monedas");
			System.out.println("3.- Kit de curación - 150 monedas");
			System.out.println("4.- Salir");
			opcion = s.nextDouble();
			
			while ((opcion < 1) || (opcion > 4) || (opcion % 1 != 0)){
				System.out.println("Introduzca una opción válida (1-4)");
				opcion = s.nextDouble();
			}
			
			switch((int) opcion){
				case 1:
				System.out.println("Has comprado una Espada básica por 200 monedas\n");
				total_gastado += 200;
				break;
				
				case 2:
				System.out.println("Has comprado un Escudo ligero por 100 monedas\n");
				total_gastado += 100;
				break;
				
				case 3:
				System.out.println("Has comprado un Kit de curación por 150 monedas\n");
				total_gastado += 150;
				break;
			}
		}while((int) opcion != 4);
		
		System.out.println("Has gastado un total de " + total_gastado + " monedas");
	}
}

