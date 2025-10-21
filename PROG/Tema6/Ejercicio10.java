/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres. */

package PROG.Tema6;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        int longitud;
        int caracter;

        Random r = new Random();


        for (int i=0; i<10; i++){ //Creamos el bucle para que cree 10 líneas diferentes
            longitud = r.nextInt(40) + 1; //Indicamos la longitud de la línea de forma aleatoria

            for (int j=0; j<longitud; j++){ //Ahora, para cada caracter, se le va a asignar un número aleatorio que corresponderá a un símbolo
                caracter = r.nextInt(6); //El caracter será un número aleatorio del 0 al 5

                switch (caracter){ //Cada número del 0 al 5 representará un caracter distinto
                    case 0:
                    System.out.print("*");
                    break;

                    case 1:
                    System.out.print("-");
                    break;

                    case 2:
                    System.out.print("=");
                    break;

                    case 3:
                    System.out.print(".");
                    break;

                    case 4:
                    System.out.print("|");
                    break;

                    default:
                    System.out.print("@");
                    break;
                }
            }
            System.out.print("\n"); //Salto de línea para diferenciar cada línea
        }
    }
    
}
