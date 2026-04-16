//Realiza un programa equivalente al anterior pero en esta ocasión, el programa
//debe ordenar palabras en lugar de números.

package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> ordenar = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca la palabra " + (i+1) + ": ");
            ordenar.add(s.next());
        }

        Collections.sort(ordenar);

        System.out.println("ArrayList ordenado: ");

        for(String palabra : ordenar){
            System.out.println(palabra);
        }
    }
}
