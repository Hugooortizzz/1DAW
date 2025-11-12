/* Define tres arrays de 20 números enteros cada una, con nombres numero,
cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
array cuadrado se deben almacenar los cuadrados de los valores que hay en el
array numero. En el array cubo se deben almacenar los cubos de los valores que
hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas. */

package Tema7;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        Random r = new Random();

        System.out.println("Número\tCuadrado\tCubo");
        
        for (int i = 0; i<numero.length; i++){
            numero[i] = r.nextInt(20);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.println(numero[i]+"\t"+cuadrado[i]+"\t\t"+cubo[i]);
        }
    }
}
