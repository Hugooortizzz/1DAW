/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados. */


import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numero = new int[100];
        int valor1 = 0;
        int valor2;

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        for (int i=0; i<numero.length; i++){
            numero[i] = r.nextInt(21);
            System.out.print(numero[i] + " ");
        }

        System.out.println("¿Qué valores quieres sustituir?");
        System.out.print("Valor 1: ");
        valor1 = s.nextInt();
        System.out.print("Valor 2: ");
        valor2 = s.nextInt();

        for (int j=0; j<numero.length; j++){
            if (numero[j] == valor1){
                System.out.print("\"" + valor2 + "\"");
            }else{
                System.out.print(numero[j]);
            }
            System.out.print(" ");
        }
    }
}
