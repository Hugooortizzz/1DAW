/*
 * Ejercicio2.java
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

public class Ejercicio2 {
	
	public static void main (String[] args) {
		double fuerza_p;
		double fuerza_e;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la fuerza de tu personaje: ");
		fuerza_p = s.nextDouble();
		
		System.out.print("Introduce la fuerza del enemigo: ");
		fuerza_e = s.nextDouble();
		
		while ((fuerza_p < 0) || (fuerza_e < 0) || (fuerza_p % 1 != 0) || (fuerza_e % 1 != 0)){
			System.out.println("Introduzca valores enteros positivos por favor\n");
			
			System.out.print("Introduce la fuerza de tu personaje: ");
			fuerza_p = s.nextDouble();
		
			System.out.print("Introduce la fuerza del enemigo: ");
			fuerza_e = s.nextDouble();
		}
		
		if (fuerza_p > fuerza_e){
			System.out.println("¡Tu personaje gana el combate con diferencia de " + (int) (fuerza_p - fuerza_e) + " puntos!");
		}else if (fuerza_p == fuerza_e){
			System.out.println("¡Habeis quedado empate!");
		}else{
			System.out.println("¡El rival gana el combate con diferencia de " + (int) (fuerza_e - fuerza_p) + " puntos!");
		}
	}
}

