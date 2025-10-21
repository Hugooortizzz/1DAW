/*
 * Ejercicio7.java
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
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		int establecer_contraseña = 0; //Esta variable será la contraseña que definamos en primer lugar
		int contraseña; //Esta variable será la que usemos como intento de introducir la contraseña
		
		Scanner s = new Scanner(System.in); 
		
		while (establecer_contraseña > 9999 || establecer_contraseña < 1000){ //Este bucle impedirá continuar al programa si la contraseña no tiene 4 cifras
			System.out.print("Establezca una contraseña de 4 cifras: ");
			establecer_contraseña = s.nextInt();
			}
	
		
		for (int i = 0; i<4; i++){ //Este segundo bucle se repetirá 4 veces, ya que solo tenemos 4 intentos para "adivinar" la contraseña
			System.out.print("Introduzca la contraseña: ");
			contraseña = s.nextInt();
			
			if (contraseña == establecer_contraseña){
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				i = 4; //Cuando acertamos la contraseña, el contador sale del límite del bucle para acabarlo
			}else{
				System.out.println("Lo siento, esa no es la combinación");
			}
		}
		s.close();
	}
}

