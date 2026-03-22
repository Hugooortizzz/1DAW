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
        boolean simplificar = true;

            while (simplificar) {
                if ((numerador % 2 == 0) && (denominador % 2 == 0)) {
                    numerador /= 2;
                    denominador /= 2;
                } else if ((numerador % 3 == 0) && (denominador % 3 == 0)) {
                    numerador /= 3;
                    denominador /= 3;
                } else if ((numerador % 5 == 0) && (denominador % 5 == 0)) {
                    numerador /= 5;
                    denominador /= 5;
                } else if ((numerador % 7 == 0) && (denominador % 7 == 0)) {
                    numerador /= 7;
                    denominador /= 7;
                }else{
                    simplificar = false;
                }
            }
    }

    public Fraccion multiplica(Fraccion fraccion){
        this.numerador *= fraccion.numerador;
        this.denominador *= fraccion.denominador;

        this.simplifica();
        return this;
    }

    public Fraccion divide(Fraccion fraccion){
        this.numerador *= fraccion.denominador;
        this.denominador *= fraccion.numerador;
        this.simplifica();

        return this;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
