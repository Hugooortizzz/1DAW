/*
 * Ejercicio12.java
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
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 */

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main (String[] args) {
		char respuesta;
		int puntos = 0;
		
		Scanner s = new Scanner(System.in);
		
		//PRIMERA PREGUNTA
		System.out.println("1.- ¿Es HTML un lenguaje de programación?");
		System.out.println("a) Sí \t b) No \t c) Tal vez");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'b'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la b");
			}
			
		//SEGUNDA PREGUNTA
		System.out.println("2.- ¿Que sistema numérico utilizan los ordenadores?");
		System.out.println("a) Binario \t b) Decimal \t c) Hexadecimal");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'a'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la a");
			}
			
		//TERCERA PREGUNTA
		System.out.println("3.- ¿Qué significan las siglas CPU?");
		System.out.println("a) Central Processing Unit \t b) Computer Personal Unit \t c) Control Processing Unit");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'a'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la a");
			}
			
		//CUARTA PREGUNTA
		System.out.println("4.- ¿Cuál de los siguientes es un sistema operativo?");
		System.out.println("a) Microsoft Word \t b) Linux \t c) Google Chrome");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'b'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la b");
			}
			
		//QUINTA PREGUNTA
		System.out.println("5.- ¿Cuál de estos dispositivos es de entrada?");
		System.out.println("a) Monitor \t b) Impresora \t c) Teclado");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'c'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la c");
			}
			
		//SEXTA PREGUNTA
		System.out.println("6.- ¿Qué tipo de memoria es volátil (se borra al apagar el equipo)?");
		System.out.println("a) ROM \t b) RAM \t c) Disco Duro");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'b'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la b");
			}
			
		//SEPTIMA PREGUNTA
		System.out.println("7.- ¿Qué protocolo se utiliza principalmente para enviar correos electrónicos?");
		System.out.println("a) HTTP \t b) FTP \t c) SMTP");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'c'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la c");
			}
			
		//OCTAVA PREGUNTA
		System.out.println("8.- ¿Cuál de las siguientes direcciones IP es válida en IPv4?");
		System.out.println("a) 192.168.1.1 \t b) 256.0.0.1 \t c) 500.300.20.1");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'a'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la a");
			}
			
		//NOVENA PREGUNTA
		System.out.println("9.- ¿Qué extensión corresponde a un archivo comprimido?");
		System.out.println("a) .exe \t b) .txt \t c) .zip");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'c'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la c");
			}
		
		//DÉCIMA PREGUNTA
		System.out.println("10.- ¿Qué tipo de software es Microsoft Excel?");
		System.out.println("a) Sistema Operativo \t b) Hoja de cálculos \t c) Procesador de textos");
		System.out.println("--------------------------------------");
		respuesta = s.next().charAt(0);
		if (respuesta == 'b'){
			System.out.println("Has acertado");
			System.out.println("--------------------------------------");
			puntos ++;
		}else {
				System.out.println("Has fallado, la respuesta correcta era la b");
			}
			
			
		System.out.print("Has sacado un " + puntos);
			
			
	}
}

