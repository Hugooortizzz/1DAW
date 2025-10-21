/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */

package Tema6;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random r = new Random();

        while (true){ //Creo un bucle infinito para que se generen caracteres constantemente
            System.out.print((char)(r.nextInt(94)+32)); //Genera caracteres aleatorios del codigo ascii del 32 al 126
        }
    }
}
