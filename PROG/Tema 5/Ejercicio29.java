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

        while (numero1 > 0) { //Mientras que el número sea mayor que 0 el bucle continuará, ya que debe pasar por todos los números hasta el 1
            if (numero1 % numero2 != 0){ //En caso de que el número 1 NO sea divisible entre el número 2, se mostrará por pantalla
                System.out.println(numero1);
            }
            numero1--; //Y se restará uno por cada repetición del bucle para ir decrementando su valor
        }

        s.close();
    }
}
