//Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
//ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
//números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
//y 20 elementos ambos inclusive.

package Ejercicio2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> valores = new ArrayList<Integer>();

        int tamañoLista = r.nextInt(10,21);
        int suma = 0;
        double media = 0;
        int minimo = 100;
        int maximo = 0;

        for (int i=0; i<tamañoLista; i++){
            //Intento no usar variables de mas
            valores.add(r.nextInt(0,101));
            suma += valores.get(valores.size()-1); //El IDE me recomienda valores.getLast();
            media += valores.get(valores.size()-1);
            System.out.print(valores.get(valores.size()-1) + " ");
        }

        media /= valores.size();

        //Calcular maximo y minimo
        for (int valor : valores){
            if (valor > maximo){
                maximo = valor;
            }

            if (valor < minimo){
                minimo = valor;
            }
        }

        System.out.println("\nSuma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);


    }
}
