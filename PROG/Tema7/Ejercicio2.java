/* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados? */

package Tema7;

public class Ejercicio2 {
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        //Utilizaré este bucle para que vaya mostrando por pantalla lo que vale cada valor del array del 0 al 9
        for (int i=0; i<10; i++){
            System.out.println(simbolo[i]);
        }
        //El resultado será que los valores no inicializados se mostrarán como el caracter ' ' por defecto
    }
}
