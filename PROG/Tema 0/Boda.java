/*
 * Boda.java
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


public class Boda {
	
	public static void main (String[] args) {
		
		int invitados = 107;
		int mesas = 12;
		double precio_por_cubierto = 85.50;
		String fecha = "el mediodía del 10 de febrero de 2040";
		
		char caracter = 'z';
		caracter ++;

		invitados = invitados + 1; //invitados ++;
		invitados ++;
		invitados = invitados - 1; //invitados --;
		
		double precio_total = invitados * precio_por_cubierto;
		
		long numero_1; //long para caracteres más largos
		long numero_2;
		numero_1 = 307;
		numero_2 = 13;
		
		//float -> 32 bits
		//double -> 64 bits
		
		System.out.print("Esto es una aplicación para bodas con " + invitados + " invitados \n");
		System.out.print("Esto es mi boda y tiene " + invitados + " invitados con " + mesas + " mesas\n");
		System.out.println("El precio por cubierto es de " + precio_por_cubierto);
		System.out.println("El ratio de invitados por mesa es de " + ((double)invitados/(double)mesas));
		System.out.println("La fecha de la boda es: " + fecha);
		System.out.println("El precio total de la boda es: " + precio_total);
		System.out.println("El resto de dividir " + numero_1 + " entre " + numero_2 + " es " + (numero_1 % numero_2));
		System.out.println("caracter" + caracter);
	}
}

