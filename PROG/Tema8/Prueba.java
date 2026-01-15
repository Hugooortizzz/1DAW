package Tema8;

import java.util.Scanner;

import Tema8.Matematicas.Matematicas;

public class Prueba {
    public static void main(String[] args) {
        int numero;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = s.nextInt();

        if (Tema8.Matematicas.Matematicas.esCapicua(numero)){
            System.out.println("El número es capicua");
        }else{
            System.out.println("El número NO es capicua");
        }
    }
}

