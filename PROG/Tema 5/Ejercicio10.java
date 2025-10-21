/*
 * Ejercicio10.java
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
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 */

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main (String[] args) {
		double numero = 0;
		double suma = 0;
		int numeros_introducidos = 0;
		double media;
		boolean acabar = false;
		
		Scanner s = new Scanner(System.in);
		
		while (!acabar){ //La bandera del bucle es un booleano, que por defecto está en falso y mientras sea así el bucle se estará ejecutando
			System.out.print("Introduzca un número (Para parar el programa introduzca un número negativo): ");
			numero = s.nextInt();
			
			if (numero < 0){ 
				System.out.println("El programa ha dejado de contar");
				acabar = true; //Cuando el número introducido sea menor que 0 (es decir, negativo), el booleano se pondrá en verdadero y el bucle terminará
			}else{
				suma = suma + numero; //Cuando el número introducido sea positivo, se sumará al total de numeros introducidos
				numeros_introducidos ++; //Esta variable va sumando la cantidad de números que hemos introducido para realizar la media posteriormente
			}
		}
		media = suma / numeros_introducidos; //Una vez ya se han dejado de introducir números, se calcula la media dividiendo el valor total de todos los números introducidos entre la cantidad de números.
		
		System.out.println("La media de los " + numeros_introducidos + " que ha introducido es " + media);

		s.close();
	}
}

