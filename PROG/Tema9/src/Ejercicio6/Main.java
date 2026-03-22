package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean salir = false;

        Tiempo t = new Tiempo(0, 0 ,0);

        Scanner s = new Scanner(System.in);

        while (!salir){
            System.out.println("¿Que quiéres hacer con la hora?");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Ver hora");
            System.out.println("4.- Salir");

            switch(s.nextInt()){
                case 1:
                    t.suma();
                    break;
                case 2:
                    t.resta();
                    break;
                case 3:
                    System.out.println(t.toString());
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción valida");
            }

        }


    }
}
