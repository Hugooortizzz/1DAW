/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int contador;
        int contador_primo;
        boolean primo;
        int n_primo = 0;

        contador = 0;

        Scanner s = new Scanner(System.in);

        /* numero[0] = 20;
        numero[1] = 5;
        numero[2] =  7;
        numero[3] = 4;
        numero[4] = 32;
        numero [5] = 9;
        numero[6] = 2;
        numero [7] = 14;
        numero[8] = 11;
        numero[9] = 6; */

        //Bucle para introducir los números en el array
        for (int i=0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();
        }

        //Bucle para mostrar el primer índice
        for (int j=0; j<numero.length; j++){
            System.out.print(j + "\t");
        }

        System.out.print("\n");

        //Bucle para mostar el primer array
        for (int k=0; k<numero.length; k++){
            System.out.print(numero[k] + "\t");
        }

        System.out.print("\n\n");

        //Bucle para mostrar el segundo indice
        for (int p=0; p<numero.length; p++){
            System.out.print(p + "\t");
        }

        //Bucle para asignar los valores al segundo array
        for (int n=0; n<numero.length; n++){
            primo = false;
            contador_primo = 0;
            for (int m=1; m<=numero[n]; m++){
                if (numero[n] % m == 0){
                    contador_primo ++;
                }
                
            }
            if(contador_primo == 2){
                    primo = true;
                    n_primo = numero[n];
                }
            if (primo){
                for (int q=n; q>contador; q--){
                    numero[q] = numero[q-1];
                }
                numero[contador] = n_primo;
                contador++;

            }
        }

        System.out.print("\n");

        for (int j=0; j<numero.length; j++){
            System.out.print(numero[j] + "\t");
        }

        System.out.print("\n");

        s.close();
    }
}
