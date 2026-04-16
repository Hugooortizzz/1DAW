package Ejercicio9;

import java.util.Random;

public class Carta implements Comparable<Carta>{
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

    public int compareTo(Carta c){
        int resultado = (this.palo).compareTo(c.getPalo());

        if (resultado != 0){ //Si el palo no es el mismo, lo devuelve ordenado por el palo
            return resultado;
        }

        //Sin embargo, si sí que tiene el mismo palo, devuelve la comparación según su valor
        return ((Integer) this.valor).compareTo(c.getValor());
    }

    @Override
    public String toString() {
        String valor = String.valueOf(this.valor);
        switch(valor){
            case "1":
                valor = "as";
                break;
            case "10":
                valor = "sota";
                break;
            case "11":
                valor = "caballo";
                break;
            case "12":
                valor = "rey";
                break;
        }
        return valor + " de " + this.palo;
    }
}
