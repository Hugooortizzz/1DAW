/*
 * AccesoDawSwitch.java
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

public class AccesoDawSwitch {
	
	public static void main (String[] args) {
		int opcion;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu metodo de acceso");
		System.out.println("Introduzca 1 si viene de un CFGM");
		System.out.println("Introduzca 2 si viene de Bachillerato");
		System.out.println("Introduzca 3 si viene de la prueba de acceso");
		System.out.println("Introduzca 4 si viene de otro CFGS");
		System.out.println("-----------------------------------------------");
		
		opcion = s.nextInt();
		
		switch (opcion) {
			case 1:
			System.out.println("Usted puede entrar a DAW por medio del CFGM");
			break;
			
			case 2:
			System.out.println("Usted puede entrar a DAW por medio de Bachillerato");
			break;
			
			case 3:
			System.out.println("Usted puede entrar a DAW por medio de la prueba de acceso");
			//break;
			
			case 4:
			System.out.println("Usted puede entrar a DAW por medio de otro CFGS");
			//break;
			
			default:
			System.out.println("El alumno no puede matricularse");
			
		}
	}
}

