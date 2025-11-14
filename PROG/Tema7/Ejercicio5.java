/* Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente. */


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int maximo = numero[0];
        int minimo = numero[0];
        
        Scanner s = new Scanner(System.in);

        for (int i=0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();

            if (numero[i] > maximo){
                maximo = numero[i];
            }

            if (numero[i] < minimo){
                minimo = numero[i];
            }
        }

        for(int j=0; j<numero.length; j++){
            System.out.print(numero[j]);

            if (numero[j] == maximo){
                System.out.print(" Máximo");
            }else if(numero[j] == minimo){
                System.out.print(" Mínimo");
            }

            System.out.print("\n");
        }
    }
}
