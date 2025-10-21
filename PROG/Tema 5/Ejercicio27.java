//Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
//entre 1 y un número leído por teclado.

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int numero;
        int multiplo = 3;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = s.nextInt();

        while (multiplo <= numero){ //Mientras que el multiplo (el número que se va a mostrar por pantalla) sea menor o igual al número introducido por pantalla el bucle se repetirá
            System.out.println(multiplo);
            multiplo = multiplo +3; //Y se irá sumando de 3 en 3, ya que como empieza en uno, si se le suma 3 siempre va a ser múltiplo de 3.
            
        }
    }
}
