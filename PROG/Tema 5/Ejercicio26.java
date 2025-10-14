//Realiza un programa que pida primero un número y a continuación un dígito.
//El programa nos debe dar la posición (o posiciones) contando de izquierda a
//derecha que ocupa ese dígito en el número introducido.

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio26 {
    public static void main(String[] args) {
        int numero;
        int digito;
        int numero_cifras;
        int cifras = 0;
        int exponente;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número");
        numero = s.nextInt();
        numero_cifras = numero;

        System.out.println("Indique un dígito del número " + numero);
        digito = s.nextInt();

        while (numero_cifras > 0){
            numero_cifras = numero_cifras / 10;
            cifras ++;
        }
        exponente = cifras-1;

        for (int i = 1; i <= cifras; i++){
            if ((int) ((numero / Math.pow(10,exponente)) % 10) == digito){
                System.out.print(i + " ");
                
            }
            exponente --;
        }
        s.close();
    }
}
