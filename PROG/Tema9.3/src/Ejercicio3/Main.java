package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int nDiscos = 100;
        boolean salir = false;

        Scanner s = new Scanner(System.in);

        Disco[] disco = new Disco[nDiscos];

        while (!salir){
            System.out.println("Colección de discos");
            System.out.println("--------------------");
            System.out.println("1.- Añadir disco");
            System.out.println("2.- Eliminar disco");
            System.out.println("3.- Editar disco");
            System.out.println("4.- Salir");

            switch(s.nextInt()){
                
            }
        }


    }
}
