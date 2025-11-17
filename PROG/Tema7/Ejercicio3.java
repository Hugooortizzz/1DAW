/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa. */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numero = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();
        }

        for (int j=numero.length-1; j>0; j--){
            System.out.println(numero[j]);
        }

        s.close();
    }
}
