/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
 */
package Tema6;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int apuesta;
        
        Random r = new Random();

        for (int i = 1; i<15; i++){ //Este bucle se repetirá 14 veces ya que una quiniela consta de 14 partidos.
            System.out.print("Partido " + i + ":\t");
            for (int j = 0; j<3; j++){ //Dentro, habrá un bucle que se repetirá 3 veces, una por cada columna
                apuesta = r.nextInt(3); //En cada columna se hará una apuesta aleatoria del 0 al 2
                if(apuesta == 0){ //Y en caso de que sea 0 se representará como X que significa un empate entre los dos equipos
                    System.out.print("X\t");
                }else{ //Si no, se muestra el 1 o el 2 que representa el equipo que va a ganar
                    System.out.print(apuesta + "\t");
                }
            }
            System.out.print("\n");
            
        }

        //Por último, se realiza el pleno a 15 que intenta adivinar el resultado exacto del último partido,
        //es decir, los goles que va a marcar cada equipo siendo 0, 1, 2 o M (más de 3) por cada equipo
        System.out.println("Pleno a 15:");
        for (int k = 1; k<=2; k++){ //Este bucle se repetirá dos veces, una vez por cada equipo que juega el partido
            apuesta = r.nextInt(4); //Y generá una apuesta aleatoria del 0 al 3
            System.out.print("Equipo " + k + ": ");
            if (apuesta == 3){ //En caso de que sea 3, se representará como M
                System.out.print("M");
            }else{ //Si no, se mostrará el número que ha salido (0, 1 o 2)
                System.out.print(apuesta);
            }
            System.out.print("\n");
        }
        
    }
}
