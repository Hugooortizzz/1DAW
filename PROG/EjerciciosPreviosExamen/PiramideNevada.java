/*
 * PiramideNevada.java
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

public class PiramideNevada {
	
	public static void main (String[] args) {
		int altura;
		int lineas_extra = 0;
		int piramides_extra = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de las montañas (mínimo 6): ");
		altura = s.nextInt();
		
		while (altura < 6){
			System.out.print("Introduzca una altura válida: ");
			altura = s.nextInt();
		} 
		
		
		if (altura % 3 != 0){
			piramides_extra = 1;
			lineas_extra = altura - (int) ((altura / 3) * 3);
		}
		
		altura = altura / 3;
				
				for(int j = 1; j <= 3; j++){ //Altura de la pirámide
					for (int i = 0; i < altura + piramides_extra; i++){
						if (lineas_extra > 0){
						//Primeros espacios a la izquierda
						for(int l = 3 - j; l >= 0; l--){
							System.out.print(" ");
						}
						//Caracteres
						for (int k = 1; k < j * 2; k++){
							System.out.print("*");
						}
						//Espacios a la derecha
						for(int l = 3 - j; l >= 0; l--){
							System.out.print(" ");
						}
						System.out.print(" ");
						}
						
						if (i == altura + piramides_extra){
								lineas_extra --;
						}
					
					}
					
				System.out.print("\n");
				
			}
			
			
					
			
	
}
}

