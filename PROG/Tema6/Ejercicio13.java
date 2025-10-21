/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */


package PROG.Tema6;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int contador = 0;

        Random r = new Random();

        do{
            contador++; //No lo pide el ejercicio, pero he hecho una variable contador para saber el número de la tirada y saber al final del programa cuantas tiradas han hecho falta para que salga doble
            dado1 = r.nextInt(6) + 1; //Asigno las tiradas de los dados a un numero aleatorio con límite al 6 mas uno, para que sea del 1 al 6 en vez del 0 al 5
            dado2 = r.nextInt(6) + 1;


            System.out.println("Tirada " + contador);
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("------------------");

        }while(dado1 != dado2);

        System.out.println("Ha tomado " + contador + " tiradas que los dos dados salgan iguales");
    }
}
