/* Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n). */


package Tema6;

import java.lang.Math;

public class Ejercicio2 {
    public static void main(String[] args) {
    int n_palo;
    String palo = "";
    String numero;

    //Primero el programa genera los valores aleatorios, el numero que va a representar al palo y el número de la carta
    n_palo = (int) (Math.random() * 4);
    numero = String.valueOf((int) ((Math.random() * 13) + 1));

    switch (n_palo){ //Este switch indica a que palo corresponde cada valor aleatorio y lo asigna a la variable palo
        case (0):
        palo = "Picas";
        break;

        case (1):
        palo = "Treboles";
        break;

        case (2):
        palo = "Corazones";
        break;

        case (3):
        palo = "Diamantes";
        break;
    }

    switch (numero){ //Este switch hace lo mismo pero para los números que se representan como cadenas
        case ("1"):
        numero = "As";
        break;

        case ("11"):
        numero = "J";
        break;

        case ("12"):
        numero = "Q";
        break;

        case ("13"):
        numero = "K";
        break;
    }

    System.out.println("Ha salido el " + numero + " de " + palo);
    }
}
