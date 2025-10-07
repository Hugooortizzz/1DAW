/*
 * Ejercicio12.java
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
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 */

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main (String[] args) {
		double base_imponible;
		int porcentaje_iva;
		int porcentaje_descuento;
		double iva;
		double precio_con_iva;
		double descuento;
		double total;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible");
		base_imponible = s.nextDouble();
		
		System.out.println("Introduzca el porcentaje del IVA");
		porcentaje_iva = s.nextInt();
		
		System.out.println("Introduzca el porcentaje de descuento");
		porcentaje_descuento = s.nextInt();
		
		iva = base_imponible * porcentaje_iva / 100;
		precio_con_iva = base_imponible + iva;
		descuento = precio_con_iva * porcentaje_descuento / 100;
		total = precio_con_iva - descuento;
		
		System.out.println("Base imponible\t\t" + base_imponible);
		System.out.println("Iva(" + porcentaje_iva + "%)\t\t" + iva);
		System.out.println("Precio con IVA\t\t" + precio_con_iva);
		System.out.println("Cod. promo. (" + porcentaje_descuento + "%)\t-" + descuento);
		System.out.println("TOTAL\t\t\t" + total);

	}
}

