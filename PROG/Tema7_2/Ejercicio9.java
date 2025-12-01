/* Realiza un programa que sea capaz de rotar todos los elementos de una
matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
debe tener 12 filas por 12 columnas y debe contener números generados al
azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
resultado, ambas con los números convenientemente alineados. */

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] numero = new int[12][12];
        int esquina_horizontal;
        int esquina_vertical;

        Random r = new Random();

        System.out.println("Primer array");
        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                numero[i][j] = r.nextInt(101);
                System.out.print(numero[i][j] + "\t");
            }
            System.out.println();
        }

        for (int capa=0; capa<6; capa++){
            //for superior
            esquina_horizontal = numero[capa][numero[capa].length - capa - 1];
            for (int columna = numero[capa].length - capa - 1; columna > capa; columna --){
                numero[capa][columna] = numero[capa][columna-1];
            }
            numero[capa][capa] = numero[capa+1][capa];

            //for derecha
            esquina_vertical =  numero[numero.length-capa-1][numero[capa].length - capa - 1];
            for (int fila = numero[capa].length - capa - 1; fila > capa + 1; fila--){
                numero[fila][numero[capa].length - capa -1] = numero[fila-1][numero[capa].length - capa -1];
            }
            numero[capa+1][numero[capa].length - capa - 1] = esquina_horizontal;
            

            //for inferior

            esquina_horizontal = numero[numero.length - capa - 1][capa];
            for (int columna = capa; columna < numero.length -capa -2; columna ++){
                numero[numero.length - capa -1][columna] = numero[numero.length - capa -1][columna+1];
            }
            numero[numero.length - capa - 1][numero[capa].length - capa - 2] = esquina_vertical;

            //for izquierda
            for (int fila = capa; fila < numero.length - capa - 1; fila++){
                numero[fila][capa] = numero[fila+1][capa];
            }
            numero[numero.length - capa - 2][capa] = esquina_horizontal;

        }

        System.out.println("Segundo array");
        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                System.out.print(numero[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
