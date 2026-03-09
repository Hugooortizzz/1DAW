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

    public void simplifica(int numerador, int denominador){

        int maximoComunDivisor;

        if ((numerador % 2 == 0) && (denominador % 2 == 0)){
            numerador /= 2;
            denominador /= 2;
        } else if ((numerador % 3 == 0) && (denominador % 3 == 0)) {
            numerador /= 3;
            denominador /= 3;
        } else if ((numerador % 5 == 0) && (denominador % 5 == 0)) {
            numerador /= 5;
            denominador /= 5;
        } else if ((numerador % 7 == 0) && (denominador % 5 == 0)) {
            numerador /= 5;
            denominador /= 5;
        }
    }
}
