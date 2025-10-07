/*
 * Ejercicio22.java
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
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */

import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main (String[] args) {
		String dia;
		int horas ;
		int minutos ;
		int total = 10080;
		int horas_restantes = 0;
		int dias_restantes = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un día: ");
		dia = s.next();
		
		System.out.print("Introduzca una hora (00-23): ");
		horas = s.nextInt();
		
		System.out.print("Introduzca unos minutos (00-59): ");
		minutos = s.nextInt();
				
		switch (dia) {

		case "viernes":
		case "Viernes":
		case "VIERNES":
		if (horas < 15){
		total = total - 10080;
		}else{
		total = total - 0;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "sabado":
		case "Sabado":
		case "SABADO":
		if (horas < 15){
		dias_restantes = 7 * 1440;
		}else{
		dias_restantes = 6 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "domingo":
		case "Domingo":
		case "DOMINGO":
		if (horas < 15){
		dias_restantes = 6 * 1440;
		}else{
		dias_restantes = 5 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "lunes":
		case "Lunes":
		case "LUNES":
		if (horas < 15){
		dias_restantes = 5 * 1440;
		}else{
		dias_restantes = 4 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "martes":
		case "Martes":
		case "MARTES":
		if (horas < 15){
		dias_restantes = 4 * 1440;
		}else{
		dias_restantes = 3 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "miercoles":
		case "Miercoles":
		case "MIERCOLES":
		if (horas < 15){
		dias_restantes = 3 * 1440;
		}else{
		dias_restantes = 2 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		
		case "jueves":
		case "Jueves":
		case "JUEVES":
		if (horas < 15){
		dias_restantes = 2 * 1440;
		}else{
		dias_restantes = 0 * 1440;
		}
		horas_restantes = (horas - 15) * 60;
		break;
		}
		
		total =  dias_restantes + horas_restantes + minutos;
		System.out.println("Quedan " + total + " minutos hasta el viernes");
		
	}
}

