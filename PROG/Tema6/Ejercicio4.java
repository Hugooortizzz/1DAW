/* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */

package Tema6;

import java.lang.Math;

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){ //Este bucle se repetirá 20 veces ya que se desea mostrar 20 números aleatorios
            System.out.print((int) (Math.random()*11) + " "); //El programá imprimirá un entero entre el 0 y el 10 junto a un espacio
        }
    }
}
