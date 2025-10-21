/*
 * Ejercicio8.java
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
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main (String[] args) {
		int numero, multiplicacion;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número para conocer su tabla de multiplicar: ");
		numero = s.nextInt();
		
		for (int i = 1; i <= 10; i++){ //El bucle se repetirá 10 veces para representar las 10 multiplicaciones de la tabla
			multiplicacion = numero * i; //En cada repetición del bucle, el número que ha introducido el usuario por pantalla se multiplicará por el valor de la variable local en ese momento (1, 2, 3, etc.)
			System.out.println(numero + " * " + i + " = " + multiplicacion); //Y se mostrará por pantalla
		}
		s.close();
	}
}

