/* Realiza un programa que sea capaz de rotar todos los elementos de una
matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
debe tener 12 filas por 12 columnas y debe contener números generados al
azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
resultado, ambas con los números convenientemente alineados. */

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] numero = new int[12][12];

        Random r = new Random();

        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                numero[i][j] = r.nextInt(101);
                System.out.print(numero[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i=0; i<numero.length; i++){
            //for superior
            for (int s=i; s<numero[i].length-i; s++){
                
            }
        }


    }
}
