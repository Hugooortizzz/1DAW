package Ejercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invierte(){
        int aux;

        aux = this.denominador;

        this.denominador = this.numerador;
        this.numerador = aux;
    }

    public void simplifica(){

    }
}
