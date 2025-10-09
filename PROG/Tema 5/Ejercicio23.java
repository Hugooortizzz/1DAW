//Escribe un programa que permita ir introduciendo una serie indeterminada
//de números mientras su suma no supere el valor 10000. Cuando esto último
//ocurra, se debe mostrar el total acumulado, el contador de los números
//introducidos y la media.

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int numero;
        int total = 0;
        int contador = 0;
        int media;

        Scanner s = new Scanner(System.in);

        while (total < 10000){
            System.out.print("Introduzca un número: ");
            numero = s.nextInt();

            total = total + numero;
            contador ++;
        }
        media = total / contador;

        System.out.println("El total acumulado ha sido de " + total);
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("La media de todos los numeros es " + media);

        s.close();
    }
}
