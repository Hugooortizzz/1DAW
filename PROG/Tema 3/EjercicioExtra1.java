/*
 * EjercicioExtra1.java
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
 * El siguiente programa tiene 2 fallos y algo que se puede mejorar, averigua cuáles son
 * sin usar Geany. Una vez que lo has pensado, modifica el programa para que funcione. 
 */

import java.util.Scanner;

public class EjercicioExtra1 {
	
	public static void main (String[] args) {
		//Primer código
		// La cosa a mejorar es que la variable numero, en vez de ser
		//un número estático, sería mejor que el usuario pudiera introducir un valor. El primer fallo es que la segunda vez que escribe la variable numero la pone con una 
		//tilde, y el segundo fallo está en la segunda línea, cuando escribe la variable numero en mayúsculas, ya que al principio ha declarado la variable numero en minúsculas,
		//por lo que NUMERO sería otra variable distinta.
		//int numero=2, cuad=numero * número;
		//System.out.println("EL CUADRADO DE "+NUMERO+" ES: " + cuad);
		
		//Código corregido
		int numero, cuad;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el número");
		numero = s.nextInt();
		
		cuad = numero * numero;
		
		System.out.println("EL CUADRADO DE "+ numero +" ES: " + cuad);
		
		
	}
}

