//Escribe un programa que genere una secuencia de 5 cartas de la baraja
//española y que sume los puntos según el juego de la brisca. El valor de las
//cartas se debe guardar en una estructura HashMap que debe contener parejas
//(figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
//estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
//de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
//4; el resto de cartas no vale nada.


package Ejercicio12;

import Ejercicio9.Carta;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main (String[] Args){
        HashMap<Integer, Integer> valores = new HashMap<Integer, Integer>();

        valores.put(1, 11);
        valores.put(3, 10);
        valores.put(10, 2);
        valores.put(11, 3);
        valores.put(12, 4);

        ArrayList<Carta> cartas = new ArrayList<Carta>();
        int puntos = 0;

        for (int i = 0; i < 5; i++) {
            cartas.add(new Carta());
        }

        for(Carta c : cartas){
            if (valores.containsKey(c.getValor())){
                puntos += valores.get(c.getValor());
            }
            System.out.println(c);

        }

        System.out.println("Puntos: " + puntos);


    }
}
