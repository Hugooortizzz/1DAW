/*
 * Carnet.java
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

public class Carnet {
	
	public static void main (String[] args) {
		int edad;
		boolean pago, reconocimiento_medico;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		edad = s.nextInt();
		
		System.out.print("Ha pagado los 1200€: ");
		pago = s.nextBoolean();
		
		System.out.print("¿Tiene el reconocimiento médico?: ");
		reconocimiento_medico = s.nextBoolean();
		
		//mayor de 18
		//pagar 1200€
		//reconocimiento médico
		
		if((edad > 18) && (pago == true) && (reconocimiento_medico == true)){
				System.out.println("Puede usted sacarse el carnet");

		}else {
				System.out.println("Usted no puede sacarse el carnet");
			}
	}
}

