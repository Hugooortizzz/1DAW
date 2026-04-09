package Ejercicio6;

import java.sql.SQLOutput;

public class Vivienda {
    private double precio;
    private int numerodehabitaciones;
    private String nombredebarriada;
    private String calle;
    private static int numeroviviendas;

    public Vivienda(double precio, int numerodehabitaciones, String nombredebarriada, String calle) {
        this.precio = precio;
        this.numerodehabitaciones = numerodehabitaciones;
        this.nombredebarriada = nombredebarriada;
        this.calle = calle;
        numeroviviendas ++;
    }

    public static void numeroDeViviendas(){
        System.out.println("El número de viviendas es: " + numeroviviendas);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumerodehabitaciones() {
        return numerodehabitaciones;
    }

    public void setNumerodehabitaciones(int numerodehabitaciones) {
        this.numerodehabitaciones = numerodehabitaciones;
    }

    public String getNombredebarriada() {
        return nombredebarriada;
    }

    public void setNombredebarriada(String nombredebarriada) {
        this.nombredebarriada = nombredebarriada;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public static int getNumeroviviendas() {
        return numeroviviendas;
    }

    public static void setNumeroviviendas(int numeroviviendas) {
        Vivienda.numeroviviendas = numeroviviendas;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "precio=" + precio +
                ", numerodehabitaciones=" + numerodehabitaciones +
                ", nombredebarriada='" + nombredebarriada + '\'' +
                ", calle='" + calle + '\'' +
                '}';
    }
}
