//Escribe un programa que muestre por pantalla todos los números enteros
//positivos menores a uno leído por teclado que no sean divisibles entre otro
//también leído de igual forma.

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un primer número: ");
        numero1 = s.nextInt();

        System.out.print("Introduzca un segundo número: ");
        numero2 = s.nextInt();

        while (numero1 > 0) {
            if (numero1 % numero2 != 0){
                System.out.println(numero1);
            }
            numero1--;
        }

        s.close();
    }
}
