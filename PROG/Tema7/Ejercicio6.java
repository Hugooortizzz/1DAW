/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numero = new int[15];

        Scanner s = new Scanner(System.in);

        for (int i=0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            
            if(i == numero.length-1){
                numero[0] = s.nextInt();
            }else{
                numero[i+1] = s.nextInt();
            }
        }

        for (int j=0; j<numero.length; j++){
            System.out.println("Número " + j + ": " + numero[j]);
        }
    }
}
