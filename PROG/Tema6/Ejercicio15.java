/* Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera. */

package Tema6;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        int numero_aleatorio;
        int primera_nota;
        int longitud;

        Random r = new Random();


        primera_nota = r.nextInt(7); //Esta variable va a almacenar la primera (y por ende, última) nota fuera del bucle ya que va a ser siempre la misma
        longitud = r.nextInt( 7) + 1; //También, se crea la longitud aleatoriamente del 1 al 7, ya que 1*4 es 4 y 7*4 es 28.

        for (int i = 1; i <= longitud; i++){ //El primer bucle crea los compases dependiendo del número aleatorio que ha salido anteriormente
            for (int j=1; j<=4; j++){ //Este segundo bucle crea 4 notas por cada compás
                if (((i == 1) && (j == 1)) || ((i == longitud) && (j == 4))){ //Esta condicion sirve para que si se trata de la primera nota o de la última...
                    numero_aleatorio = primera_nota; //...el número aleatorio va a ser el de la primera nota que se ha generado anteriormente
                }else{
                    numero_aleatorio = r.nextInt(7); //En cualquier otro caso, se genera un número aleatoriamente del 0 al 7
                }
                
                switch(numero_aleatorio){ //Este switch imprimirá una nota correspondiendo al número aleatorio que ha salido
                    case 0:
                    System.out.print(" Do");
                    break;

                    case 1:
                    System.out.print(" Re");
                    break;

                    case 2: 
                    System.out.print(" Mi");
                    break;

                    case 3:
                    System.out.print(" Fa");
                    break;

                    case 4:
                    System.out.print(" Sol");
                    break;
                    
                    case 5:
                    System.out.print(" La");
                    break;

                    case 6:
                    System.out.print(" Si");
                    break;
                }
            }
            System.out.print(" |"); //Por cada fin de compás, se imprimirá un | por lo que tendrá que estar al final del primer bucle
        }
        System.out.print("|"); //Y al final de la partitura se imprimirán 2 ||, por lo que se imprimirá un | más fuera de los bucles.

    }
}
