/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generad */

package Tema6;

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;

        Random r = new Random();

        do{ //Este bucle se ejecutará mientras que el número aleatorio no sea igual a 24
            numero = r.nextInt(100);

            if((numero % 2 == 0) && (numero != 24)){ //Esta condición solo se cumplirá si el numero es par y NO es igual a 24
                System.out.println(numero); //Imprimirá el número
                contador ++; //Y sumará uno al contador, que indicará cuantos números ha tardado en que salga el 24
            }
        }while (numero != 24);

        System.out.print("El programa ha generado " + contador + " números");
    }
}
