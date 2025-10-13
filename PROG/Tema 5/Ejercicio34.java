/* Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos. */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio34 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int contar_cifras;
        int cifras = 0;
        int exponente;
        int digito1;
        int digito2;

        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        numero1 = s.nextInt();
        contar_cifras = numero1;

        System.out.print("Introduzca otro número: ");
        numero2 = s.nextInt();
 

        while (contar_cifras > 0) {
            contar_cifras = contar_cifras / 10;
            cifras++;
        }
        exponente = cifras - 1;


        System.out.print("El número formado por los dígitos pares es: ");
        for (int i = 1; i <= cifras; i++) {
            digito1 = (int) ((numero1 / Math.pow(10, exponente)) % 10);
            if (digito1 % 2 == 0){
                System.out.print(digito1);
            }

            digito2 = (int) ((numero2 / Math.pow(10, exponente)) % 10);
            if (digito2 % 2 == 0){
                System.out.print(digito2);
            }
            

            exponente = exponente -1;
        }
        exponente = cifras -1;

        System.out.print("\nEl número formado por los dígitos impares es: ");
        for (int i = 1; i <= cifras; i++) {
            digito1 = (int) ((numero1 / Math.pow(10, exponente)) % 10);
            if (digito1 % 2 != 0){
                System.out.print(digito1);
            }

            digito2 = (int) ((numero2 / Math.pow(10, exponente)) % 10);
            if (digito2 % 2 != 0){
                System.out.print(digito2);
            }
            

            exponente = exponente -1;
        }

        s.close();
    }
}
