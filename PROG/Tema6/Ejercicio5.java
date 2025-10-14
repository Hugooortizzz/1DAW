/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */

package PROG.Tema6;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int maximo = 0;
        int minimo = 199;
        int media = 0;

    for (int i = 0; i < 50; i++){
        numero = (int) ((Math.random()*100)+100);
        System.out.print(numero + " ");

        if (numero > maximo){
            maximo = numero;
        }
        if (numero < minimo){
            minimo = numero;
        }

        media = media + numero;
    }
    System.out.print("\n");
    media = media / 50;

    System.out.println("El número más grande de la secuencia ha sido el " + maximo);
    System.out.println("El número más pequeño de la secuencia ha sido el " + minimo);
    System.out.println("La media de todos los numeros es " + media);


    }
}
