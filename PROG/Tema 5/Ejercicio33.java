/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        int altura = 0;

        Scanner s = new Scanner(System.in);

        // Este bucle impide al programa avanzar si la altura es menor que 2
        while (altura < 2) {
            System.out.print("Introduzca la altura de la U: ");
            altura = s.nextInt();
        }

        //Este primer bucle se ejecutará el número de veces que hayamos introducido en altura MENOS 1, ya que la 
        //última línea se ejecutará fuera de este bucle
        for (int i = 1; i < altura; i++) { 
            System.out.print("*"); //El primer asterisco se pinta siempre solo una vez
            //Este bucle se ejecutará tambien el número de veces que hayamos introducido en altura y pintará los espacios entre los caracteres
            for (int j = 1; j <= altura; j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");//El último asterisco también se pinta siempre solo una vez
        }

        System.out.print(" ");
        //Por último, este for funcionará igual que el de los espacios pero con asteriscos
        for (int k = 1; k <= altura; k++) {
            System.out.print("*");
        }
        System.out.print(" ");

    }
}
