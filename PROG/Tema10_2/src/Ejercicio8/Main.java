//Realiza un programa que escoja al azar 10 cartas de la baraja española
//(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
//almacenarlas y asegúrate de que no se repite ninguna.

package Ejercicio8;

import java.util.ArrayList;

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

        for (Carta c : cartas){
            System.out.println(c);
        }
    }
}
