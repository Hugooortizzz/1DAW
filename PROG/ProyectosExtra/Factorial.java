/* Programa que calcule el factorial de un número.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int numero;
        double factorial = 1;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número para calcular su factorial: ");
        numero = s.nextInt();

        for (int i=0; i < numero; i++){
            System.out.print(numero-i);
            factorial = factorial * (numero - i);
            if (numero - i != 1){
                System.out.print(" * ");
            }else{
                System.out.print(" = ");
            }
        }
        System.out.print(factorial);
    }
}
