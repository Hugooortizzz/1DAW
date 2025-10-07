/*
 * Elseif.java
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


public class Elseif {
	
	public static void main (String[] args) {
		double nota = 6;
		
		if (nota<5){
			System.out.println("El alumno ha suspendido");
		}else if (nota < 6){
				System.out.println("Nota suficiente");
			}else if (nota < 7){
					System.out.println("Nota bien");
				}else if (nota <9){
						System.out.println("Nota notable");
					}else if (nota == 10){
							System.out.println("Nota sobresaliente");
						}else{
								System.out.println("Nota erronea");
							}
	}
}

