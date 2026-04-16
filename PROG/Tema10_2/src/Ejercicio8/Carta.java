package Ejercicio8;

import java.util.Random;

public class Carta {
    private Palo palo;
    private int valor;
    private static Palo[] palos = Palo.values(); //Array con los palos



    public Carta() {
        Random r = new Random();
        this.valor = r.nextInt(1,13);
        this.palo = palos[r.nextInt(0,4)];
    }


    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.palo;
    }
}
