/*
 * Ejercicio13.java
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
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 */

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main (String[] args) {
		int numero1, numero2, numero3;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		numero1 = s.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		numero2 = s.nextInt();
		
		System.out.print("Introduzca el tercer número: ");
		numero3 = s.nextInt();
		
		if ((numero1 > numero2) && (numero1 > numero3)){
			if (numero2 > numero3){
				System.out.println(numero1 + " > " + numero2 + " > " + numero3);
			}else {
				System.out.println(numero1 + " > " + numero3 + " > " + numero2);
			}
		}
		
		if ((numero2 > numero1) && (numero2 > numero3)){
			if (numero1 > numero3){
				System.out.println(numero2 + " > " + numero1 + " > " + numero3);
			}else{
				System.out.println(numero2 + " > " + numero3 + " > " + numero1);
			}
		}
		
		if ((numero3 > numero1) && (numero3 > numero2)){
			if (numero1 > numero2){
				System.out.println(numero3 + " > " + numero1 + " > " + numero2);
			}else{
				System.out.println(numero3 + " > " + numero2 + " > " + numero1);
			}
		}
	}
}

