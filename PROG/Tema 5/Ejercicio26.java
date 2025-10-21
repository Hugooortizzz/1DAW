//Realiza un programa que pida primero un número y a continuación un dígito.
//El programa nos debe dar la posición (o posiciones) contando de izquierda a
//derecha que ocupa ese dígito en el número introducido.

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio26 {
    public static void main(String[] args) {
        int numero;
        int digito;
        int numero_cifras;
        int cifras = 0;
        int exponente;
        int detector = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número"); //Primero el usuario introducirá el número que el quiera;
        numero = s.nextInt();
        numero_cifras = numero; //Esta variable servirá para poder contar los números posteriormente sin tocar directamente la variable número

        System.out.println("Indique un dígito del número " + numero); //Luego, el usuario indicará un digito que quiere buscar en el número que ha introducido
        digito = s.nextInt();

        while (numero_cifras > 0){ //Este while contará el número de cifras que tiene el número
            numero_cifras = numero_cifras / 10;
            cifras ++;
        }
        exponente = cifras-1; //El número de cifras - 1 se sumará a la variable exponente para ir dividiendo el número posteriormente e ir identificando cada cifra

        

        for (int i = 1; i <= cifras; i++){ //El bucle se repetirá el número de cifras que tenga el número
            //Esta condición detectará si el módulo del numero entre 10 elevado al exponente en ese momento es igual al digito indicado. La operación indicada
            //anteriormente sirve para identificar los digitos del número introducido de izquierda a derecha. Ya que si, por ejemplo, si a 523 le dividimos 10^1,
            //sería igual a 52,3, y si a ese número le cálculamos el módulo de 10, saldría 2,3 que con un casting a int se quedaría en 2.
            if ((int) ((numero / Math.pow(10,exponente)) % 10) == digito){
                detector ++; //Esta variable tiene la simple función de detectar si alguna vez se ha entrado en el bucle, es decir, alguna vez el número ha coincidido con el digito

                if (detector == 1){ //En caso de que el detector sea exactamente 1, se mostrará el siguiente mensaje (para que no se repita cada vez que se cumple la condicion)
                    System.out.print("El dígito " + digito + " se encuentra en la/s posicion/es: ");
                }
                System.out.print(i + " "); //Y se por pantalla el número de repetición del bucle, es decir, la posición del digito
                
                
            }
            exponente --; //Se debe restar 1 al exponente para que el número vaya dividiendo cada vez entre menos
        }

        if (detector == 0){ //En caso de que nunca se haya entrado a la condición en la que el número es igual al digito, se mostrará este mensaje ya que el digito que hemos introducido no se encuentra en el número
            System.out.print("El dígito " + digito + " no se encuentra en el número que has introducido");
        }
        s.close();
    }
}
