/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). */


package PROG.Tema6;

import java.lang.Math;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dado;
        int total = 0;

        for (int i = 1; i <= 3; i++){
        System.out.print("Tirada dado " + i + ": ");
        dado = (int) ((Math.random()*6)+1);
        System.out.print(dado + "\n");
        total = total + dado;
        }
        System.out.print("Suma total: " + total);

    }
}
