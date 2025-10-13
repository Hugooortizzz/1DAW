/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        int altura = 0;

        Scanner s = new Scanner(System.in);


        while (altura < 2){
        System.out.print("Introduzca la altura de la U: ");
        altura = s.nextInt();
        }

        for (int i = 1; i < altura; i++){
            System.out.print("*");
            for (int j = 1; j <= altura; j++){
                System.out.print(" ");
            }
            System.out.print("*\n");
        }

            System.out.print(" ");
            for (int k = 1; k <= altura; k++){
                System.out.print("*");
            }
                System.out.print(" ");


    }
}
