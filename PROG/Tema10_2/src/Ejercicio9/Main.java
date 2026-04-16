//Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
//coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.

package Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        Carta cartaAleatoria;
        boolean existe;

        for (int i = 0; i < 9; i++) {
            do{
                existe = false;
                cartaAleatoria = new Carta();
                for (Carta c : cartas){
                    if (cartaAleatoria.getPalo().equals(c.getPalo()) && cartaAleatoria.getValor() == c.getValor()){
                        existe = true;
                    }
                }
            }while(existe);

            cartas.add(cartaAleatoria);
        }

        Collections.sort(cartas);

        for (Carta c : cartas){
            System.out.println(c);
        }
    }
}
