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

        while (numero > 0){ //El bucle se repetirá mientras que el número sea mayor que 0, ya que va a multiplicar desde el número hasta que sea 1
            factorial = factorial * numero; //Al factorial se le multiplicará lo que vale el número en este caso
            if(numero == 1){ //Cuando finalmente el número sea 1, no mostrará el símbolo de multiplicación
                System.out.print(numero + " ");
            }else{ //En el resto de casos si lo hará
                System.out.print(numero + " * " + " ");
            }
            
            numero --; //Y se restará uno al número en cada repetición

        }
        System.out.print("= " + factorial);

        s.close();
    }
}
