/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo. */

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] numero = new int[6][10];
        int maximo = 0;
        int minimo = 1000;

        Random r = new Random();

        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                numero[i][j] = r.nextInt(1001);
                if (numero[i][j] > maximo){
                    maximo = numero[i][j];
                }else if (numero[i][j] < minimo){
                    minimo = numero[i][j];
                }
            }
        }

        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);

    }
}
