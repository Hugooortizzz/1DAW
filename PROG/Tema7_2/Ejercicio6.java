/*  */

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] numero = new int[6][10];
        int maximo = 0;
        int minimo = 1000;
        int numero_aleatorio;
        boolean repetido = false;


        Random r = new Random();

        for (int i=0; i<numero.length; i++){
            for (int j=0; j<numero[i].length; j++){
                
                do{
                    repetido = false;
                    numero_aleatorio = r.nextInt(1001);
                    for (int k=0; k<numero.length; k++){
                        for (int p=0; p<numero[k].length; p++){
                            if (numero_aleatorio == numero[k][p]){
                                repetido = true;
                            }
                        }
                    }
                }while (repetido);

                numero[i][j] = numero_aleatorio;
                
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

