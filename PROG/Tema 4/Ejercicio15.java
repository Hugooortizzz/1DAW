/*
 * Ejercicio15.java
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
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 */

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main (String[] args) {
		char caracter;
		String orientacion;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("¿De qué caracteres quieres que se componga la pirámide?: ");
		caracter = s.next().charAt(0);
		System.out.print("¿Hacia donde quieres que apunte la pirámide?: ");
		orientacion = s.next();
		s.nextLine();
		
		switch (orientacion){
		case "arriba":
		case "Arriba":
		case "ARRIBA":
		System.out.println("   "+caracter+"    ");
		System.out.println("  "+caracter+caracter+caracter+"   ");
		System.out.println(" "+caracter+caracter+caracter+caracter+caracter+"  ");
		System.out.println(""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"");
		break;
		
		case "abajo":
		case "Abajo":
		case "ABAJO":
		System.out.println(""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"");
		System.out.println(" "+caracter+caracter+caracter+caracter+caracter+"  ");
		System.out.println("  "+caracter+caracter+caracter+"   ");
		System.out.println("   "+caracter+"    ");
		break;
		
		case "derecha":
		case "Derecha":
		case "DERECHA":
		System.out.println(""+caracter+"");
		System.out.println(""+caracter+caracter+"");
		System.out.println(""+caracter+caracter+caracter+"");
		System.out.println(""+caracter+caracter+caracter+caracter+"");
		System.out.println(""+caracter+caracter+caracter+"");
		System.out.println(""+caracter+caracter+"");
		System.out.println(""+caracter+"");
		break;
		
		case "izquierda":
		case "Izquierda":
		case "IZQUIERDA":
		System.out.println("   "+caracter+"");
		System.out.println("  "+caracter+caracter+"");
		System.out.println(" "+caracter+caracter+caracter+"");
		System.out.println(""+caracter+caracter+caracter+caracter+"");
		System.out.println(" "+caracter+caracter+caracter+"");
		System.out.println("  "+caracter+caracter+"");
		System.out.println("   "+caracter+"");
		break;
		
		default:
		System.out.println("Introduzca una respuesta válida");
		}
		
		
		
		
	}
}

