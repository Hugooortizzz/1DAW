package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Gato[] gato = new Gato[4];


        gato[0] = new Gato("Garfield", "Gato Naranja", 30, 60, 5);
        gato[1] = new Gato("Tom", "Gato Gris", 24, 48, 8);
        gato[2] = new Gato("Pedro", "Gato Egipcio", 29, 54, 3);
        gato[3] = new Gato("Lolito", "Gato Negro", 16, 22, 1);

        for (int i = 0; i < gato.length; i++) {
            System.out.println(gato[i].toString());
        }
    }
}
