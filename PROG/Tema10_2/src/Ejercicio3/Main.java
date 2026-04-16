//Escribe un programa que ordene 10 números enteros introducidos por teclado
//y almacenados en un objeto de la clase ArrayList.

package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ordenar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca el número " + (i+1) + ": ");
            ordenar.add(s.nextInt());
        }

        Collections.sort(ordenar);

        System.out.println("ArrayList ordenado:");

        for(int numero : ordenar){
            System.out.println(numero);
        }
    }
}
