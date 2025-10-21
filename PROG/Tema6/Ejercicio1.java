/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */

package PROG.Tema6;

import java.lang.Math;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dado;
        int total = 0;

        for (int i = 1; i <= 3; i++) { //Este bucle se va a repetir 3 veces, una vez por cada tirada
            System.out.print("Tirada dado " + i + ": ");
            dado = (int) ((Math.random() * 6) + 1); //El dado de cada tirada dará un número aleatorio del 1 al 6
            System.out.print(dado + "\n");
            total = total + dado; //Y se va sumando al total de todas las tiradas
        }
        System.out.print("Suma total: " + total);

    }
}
