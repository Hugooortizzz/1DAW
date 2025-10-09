//Escribe un programa que calcule el factorial de un número entero leído por
//teclado.

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int numero;
        int factorial = 1;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = s.nextInt();

        while (numero > 1){
            factorial = factorial * numero;
            numero --;
        }
        System.out.println(factorial);

        s.close();
    }
}
