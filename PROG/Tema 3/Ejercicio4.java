/*
 * Ejercicio4.java
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
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado
 */

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		double numero1;
		double numero2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		numero1 = s.nextDouble();
		
		System.out.println("Introduzca el segundo número");
		numero2 = s.nextDouble();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2;
		
		System.out.println(numero1 + " + " + numero2 + " = " + suma);
		System.out.println(numero1 + " - " + numero2 + " = " + resta);
		System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
		System.out.println(numero1 + " / " + numero2 + " = " + division);

		
	}
}

