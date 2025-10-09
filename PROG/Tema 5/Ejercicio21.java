//Realiza un programa que vaya pidiendo números hasta que se introduzca un
//numero negativo y nos diga cuantos números se han introducido, la media de
//los impares y el mayor de los pares. El número negativo sólo se utiliza para
//indicar el final de la introducción de datos pero no se incluye en el cómputo.

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int numero;
        int cantidad_numeros = 0;
        int numeros_impares = 0;
        int media_impares = 0;
        int par_mayor = 0;

        Scanner s = new Scanner(System.in);


        do{
            System.out.print("Introduzca un número positivo, (número negativo cerrará el programa): ");
            numero = s.nextInt();
            
            //Calcular la cantidad de números introducidos
            if (numero >= 0){
                cantidad_numeros ++;
            }

            //Calcular la media de los numeros impares
            if ((numero > 0)  && (numero % 2 == 1)); {
                numeros_impares = numeros_impares + numero;
                media_impares ++;
            }
            if (numero % 2 == 0){//Calcular par mayor
                if (numero > par_mayor){
                    par_mayor = (int) numero;
                }
            }
        }while (numero >= 0);

        //Terminar de calcular la media de los numeros impares
        media_impares = numeros_impares / media_impares;

        System.out.println("Has introducido " + cantidad_numeros + " números");
        System.out.println("La media de todos los numeros impares que has introducido es " + media_impares);
        System.out.println("El mayor número par que has introducido es " + par_mayor);

        
        s.close();
    }
}
