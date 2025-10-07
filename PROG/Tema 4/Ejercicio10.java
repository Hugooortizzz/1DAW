/*
 * Ejercicio10.java
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
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 */

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main (String[] args) {
		String mes;
		int dia;
		String horoscopo = " ";
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce tu mes de nacimiento: ");
		mes = s.next();
		
		System.out.print("Introduce tu día de nacimiento: ");
		dia = s.nextInt();
		
		switch (mes) {
			//ENERO
			case "enero":
			case "Enero":
			case "ENERO":
			if (dia <= 19){
				horoscopo = "Capricornio";
			}else {
					horoscopo = "Acuario";
				}
			break;
			
			//FEBRERO
			case "febrero":
			case "Febrero":
			case "FEBRERO":
			if (dia <= 18) {
				horoscopo = "Acuario";
			}else{
					horoscopo = "Piscis";
				}
			break;
			
			//MARZO
			case "marzo":
			case "Marzo":
			case "MARZO":
			if (dia <= 20){
				horoscopo = "Piscis";
			}else{
					horoscopo = "Aries";
				}
			break;
			
			//ABRIL
			case "abril":
			case "Abril":
			case "ABRIL":
			if (dia <= 19){
				horoscopo = "Aries";
			}else{
					horoscopo = "Tauro";
				}
			break;
			
			//MAYO
			case "mayo":
			case "Mayo":
			case "MAYO":
			if (dia <= 20){
				horoscopo = "Tauro";
			}else{
					horoscopo = "Géminis";
				}
			break;
			
			//JUNIO
			case "junio":
			case "Junio":
			case "JUNIO":
			if (dia <= 20){
				horoscopo = "Géminis";
			}else{
					horoscopo = "Cáncer";
				}
			break;
			
			//JULIO
			case "julio":
			case "Julio":
			case "JULIO":
			if (dia <= 22) {
				horoscopo = "Cáncer";
			}else{
					horoscopo = "Leo";
				}
			break;
			
			//AGOSTO
			case "agosto":
			case "Agosto":
			case "AGOSTO":
			if (dia <= 22){
				horoscopo = "Leo";
			}else {
					horoscopo = "Virgo";
				}
			break;
			
			//SEPTIEMBRE
			case "septiembre":
			case "Septiembre":
			case "SEPTIMBRE":
			if (dia <= 22){
				horoscopo = "Virgo";
			}else{
					horoscopo = "Libra";
				}
			break;
			
			//OCTUBRE
			case "octubre":
			case "Octubre":
			case "OCTUBRE":
			if (dia <= 22){
				horoscopo = "Libra";
			}else{
					horoscopo = "Escorpio";
				}
			break;
			
			//NOVIEMBRE
			case "noviembre":
			case "Noviembre":
			case "NOVIEMBRE":
			if (dia <= 21){
				horoscopo = "Escorpio";
				}else{
					horoscopo = "Sagitario";
					}
			break;
			
			//DICIEMBRE
			case "diciembre":
			case "Diciembre":
			case "DICIEMBRE":
			if (dia <= 21){
				horoscopo = "Sagitario";
			}else{
				horoscopo = "Capricornio";
				}
			break;
			
			default:
			System.out.println("Introduzca una fecha válida");
			
			
		}
		System.out.println("Eres " + horoscopo);
				
	}
}

