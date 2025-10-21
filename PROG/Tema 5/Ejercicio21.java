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


        do{ //Este bucle se repetirá mientras el número introducido sea positivo
            System.out.print("Introduzca un número positivo, (número negativo cerrará el programa): ");
            numero = s.nextInt();
            
            //Si el numero NO es negativo, se suma 1 al contador de numeros introducidos
            if (numero >= 0){
                cantidad_numeros ++;
            }

            //Si el número es positivo y además es impar, se sumará al total de numeros impares y al contador de numeros impares
            if ((numero > 0)  && (numero % 2 == 1)) {
                numeros_impares = numeros_impares + numero;
                media_impares ++;
            }
            if (numero % 2 == 0){//Si el número es par y si el numero es mayor que el par mayor actal, se establece como el nuevo par mayor.
                if (numero > par_mayor){
                    par_mayor = (int) numero;
                }
            }
        }while (numero >= 0);

        //Terminar de calcular la media de los numeros impares (si NO es 0, ya que si es 0 se carga el programa)
        if (numeros_impares != 0){
            media_impares = numeros_impares / media_impares;
        }

        System.out.println("Has introducido " + cantidad_numeros + " números");
        System.out.println("La media de todos los numeros impares que has introducido es " + media_impares);
        System.out.println("El mayor número par que has introducido es " + par_mayor);

        
        s.close();
    }
}
