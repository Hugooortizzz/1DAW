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

        objetivo = (int) (Math.random() * 101); //Primero, el programa genera el número que deberemos adivinar

        for (int i = 0; i < 5; i++){ //El bucle se repetirá solo 5 veces, ya que tenemos 5 intentos
            System.out.print("Intente adivinar el numero aleatorio (0-100): ");
            numero = s.nextInt();
            
            if(numero == objetivo){ //Si el número que hemos introducido es igual al objetivo, la variable local se establecerá fuera del rango del bucle y se parará
                System.out.println("Has acertado");
                i = 5;
            } else if(numero < objetivo){ //Si el número que hemos introducido es más pequeño que el objetivo, significará que el objetivo es mayor.
                System.out.println("Has fallado, el número es mayor que " + numero);
            }else{ //En cualquier otro caso, significará que el objetivo es mayor.
                System.out.println("Has fallado, el número es menor que " + numero);
            }
        }

        if (numero != objetivo){ //Si el programa está fuera del bucle pero no es porque haya acertado el usuario, se mostrará cual era el número
            System.out.println("Se te han acabado los intentos, el número era " + objetivo);
        }
        s.close();
    }
}
