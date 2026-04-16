package Ejercicio7;

import java.util.Random;

public class Moneda {
    private String moneda;
    private String posicion;


    public Moneda() {
    }

    public void generarMonedaAleatoria(){
        Random r = new Random();

        switch (r.nextInt(0,8)){
            case 0:
                this.moneda = "1 céntimo";
                break;
            case 1:
                this.moneda = "2 céntimos";
                break;
            case 2:
                this.moneda = "5 céntimos";
                break;
            case 3:
                this.moneda = "10 céntimos";
                break;
            case 4:
                this.moneda = "25 céntimos";
                break;
            case 5:
                this.moneda = "50 céntimos";
                break;
            case 6:
                this.moneda = "1 euro";
                break;
            case 7:
                this.moneda = "2 euros";
                break;

        }

    }

    public void generaPosicionAleatoria(){
        Random r = new Random();

        switch(r.nextInt(0,2)){
            case 0:
                this.posicion = "cara";
                break;
            case 1:
                this.posicion = "cruz";
                break;
        }
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return this.moneda + " - " + this.posicion;
    }
}
