//Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
//entre 1 y un número leído por teclado.

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int numero;
        int multiplo = 3;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = s.nextInt();

        while (multiplo <= numero){
            System.out.println(multiplo);
            multiplo = multiplo +3;
            
        }
    }
}
