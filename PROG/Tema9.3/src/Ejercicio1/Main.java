package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Gato[] gato = new Gato[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < gato.length; i++) {
            gato[i] = new Gato();

            System.out.println("Gato " + (i+1));
            System.out.print("Nombre: ");
            gato[i].setNombre(s.next());
            System.out.print("Raza: ");
            gato[i].setRaza(s.next());
            System.out.print("Altura: ");
            gato[i].setAltura(s.nextInt());
            System.out.print("Peso: ");
            gato[i].setPeso(s.nextInt());
            System.out.print("Edad: ");
            gato[i].setEdad(s.nextInt());
            System.out.println();
        }

        for (int i = 0; i < gato.length; i++) {
            System.out.println(gato[i].toString());
        }
    }
}
