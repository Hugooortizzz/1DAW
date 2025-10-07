/*
 * Persona.java
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


import java.util.Scanner; //Importar el Scanner de la librería de java

public class Persona {
	
	public static void main (String[] args) {
		
		int edad;
		String nombre;
		String dni;
		double peso;
		double altura;
		
		Scanner s = new Scanner(System.in); //Inicializar el scanner
		
		System.out.println("Por favor, introduzca su nombre");
		nombre = s.next();//Funcion para strings
		
		s.nextLine(); //Cuando introduzcamos strings, tendremos que limpiar el buffer introduciendo un \n que no se dirija a ninguna función, ya que los strings almacenan los últimos \n.
		System.out.println("Por favor, introduzca su DNI");
		dni = s.nextLine();
		
		System.out.println("Por favor, introduzca su edad");
		edad = s.nextInt();//Función para enteros
		
		
		
		System.out.println("Por favor, introduzca su peso");
		peso = s.nextDouble();//Funcion para doubles
		
		System.out.println("Por favor, introduzca su altura");
		altura = s.nextDouble();
		
		System.out.println("El nombre del usuario es: " + nombre);
		System.out.println("La edad del usuario es: " + edad);
		System.out.println("El DNI del usuario es: " + dni);
		System.out.println("El peso del usuario es: " + peso);
		System.out.println("La altura del usuario es: " + altura);
		
		
		
		
		if((edad < 0) && (altura < 0))  {
			
			System.out.println("Esta persona es alta");

		}else{
		
			
			System.out.println("La edad es incorrecta y altura");

		}
		
		  //Introducimos el corchete final del else para que solo se ejecute el siguiente código cuando la edad sea correcta
	}
}

