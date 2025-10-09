//Realiza un programa que pida un número por teclado y que luego muestre ese
//número al revés.

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio25 {
    public static void main(String[] args) {
        int numero;
        int cifras = 0;
        int contar_cifras;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = s.nextInt();
        contar_cifras = numero;

        //Primero el programa cuenta las cifras;
        while (contar_cifras > 0){
            contar_cifras = contar_cifras / 10;
            cifras ++;
        }

        System.out.print("El número " + numero + " al revés es ");
        for (int i = 1; i <= cifras; i++){
            if (i == 1){ //Para calcular la primera cifra (la última del número que hemos introducido), es tan facil como calcular su módulo entre 10.
                System.out.print(numero % 10);
            }else{ //Sin embargo, en las demás cifras, tendremos que calcular su módulo entre 10 elevado a su número de cifra y dividirlo entre su número de cifra menos uno
                System.out.print((int) ((numero % Math.pow(10, i))/Math.pow(10, i-1)));
            }
            
        }

        s.close();


    }
}
