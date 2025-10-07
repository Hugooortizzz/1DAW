/*
 * Ejercicio11.java
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
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 */

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main (String[] args) {
		int horas;
		int minutos;
		int segundos;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca las horas (00-23): ");
		horas = s.nextInt();
		
		System.out.print("Introduzca los minutos (00-59): ");
		minutos = s.nextInt();
		
		if ((horas < 0) || (horas > 24) || (minutos < 0) || (minutos > 59)){
			System.out.println("Ha introducido una hora incorrecta");
		}else{
			segundos = 86400 - (horas * 3600 + minutos * 60);
			System.out.println("Quedan " + segundos + " segundos para las 00:00");
			}
	}
	
}

