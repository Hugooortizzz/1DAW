/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */

package Tema6;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int maximo = 0;
        int minimo = 199; //El mínimo empieza siendo 199 ya que es el número más grande y siempre va a ser menor que este
        int media = 0;

    for (int i = 0; i < 50; i++){ //EL bucle se repetirá 50 veces ya que se desea mostrar 50 números
        numero = (int) ((Math.random()*100)+100); //A la variable número se le asignará un valor aleatorio entre el 0 y el 99 + 100 (es decir, 100-199)
        System.out.print(numero + " ");//Y se mostrará por pantalla junto a un espacio

        if (numero > maximo){  //Si el número actual es mayor que el máximo actual...
            maximo = numero; //este será el nuevo máximo
        }
        if (numero < minimo){ //Si el número actual es menor que el mínimo actual...
            minimo = numero; //este será el nuevo mínimo
        }

        media = media + numero; //y se sumará al total para calcular la media
    }
    System.out.print("\n");
    media = media / 50; //Una vez el programa tiene el total de todos los números, lo divide entre los 50 números que se han generado

    System.out.println("El número más grande de la secuencia ha sido el " + maximo);
    System.out.println("El número más pequeño de la secuencia ha sido el " + minimo);
    System.out.println("La media de todos los numeros es " + media);


    }
}
