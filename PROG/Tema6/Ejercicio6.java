/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto. */

package PROG.Tema6;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio6 {
    public static void main(String[] args) {
        int objetivo;
        int numero = 0;

        Scanner s = new Scanner(System.in);

        objetivo = (int) (Math.random() * 101);

        for (int i = 0; i < 5; i++){
            System.out.println("Intente adivinar el numero aleatorio (0-100): ");
            numero = s.nextInt();
            
            if(numero == objetivo){
                System.out.println("Has acertado");
                i = 5;
            }

            if (numero < objetivo){
                System.out.println("Has fallado, el número es mayor que " + numero);
            }else if (numero > objetivo){
                System.out.println("Has fallado, el número es menor que " + numero);
            }
        }

        if (numero != objetivo){
            System.out.println("Se te han acabado los intentos, el número era " + objetivo);
        }
    }
}
