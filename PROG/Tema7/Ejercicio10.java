/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario. */

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int numero_aleatorio;
        int contador_negativo;
        int contador_positivo;

        contador_negativo = numero.length - 1;
        contador_positivo = 0;

        Random r = new Random();

        for (int i = 0; i<numero.length; i++){
            numero_aleatorio = r.nextInt(101);
            
            if (numero_aleatorio % 2 == 0){
                numero[contador_positivo] = numero_aleatorio;
                contador_positivo ++;
            }else{
                numero[contador_negativo] = numero_aleatorio;
                contador_negativo --;
            }
        }

        for (int j=0; j<numero.length; j++){
            System.out.println("Numero " + (j+1) + ": " + numero[j]);
        }
    }
}
