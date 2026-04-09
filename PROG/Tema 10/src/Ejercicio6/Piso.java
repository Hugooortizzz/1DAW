package Ejercicio6;

import java.util.Scanner;

public class Piso extends Vivienda{
    private String balcon;
    Scanner s = new Scanner(System.in);

    public Piso(double precio, int numerodehabitaciones, String nombredebarriada, String calle, String balcon) {
        super(precio, numerodehabitaciones, nombredebarriada, calle);
        this.balcon = balcon;
    }

    public void tieneBalcon(){
        System.out.print("¿Tiene balcón el piso situado en " + this.getCalle() + ", con " + this.getNumerodehabitaciones()
                + " número de habitaciones?: ");

        this.setBalcon(s.next());
    }

    public String getBalcon() {
        return balcon;
    }

    public void setBalcon(String balcon) {
        this.balcon = balcon;
    }

    @Override
    public String toString() {
        return super.toString() + "balcon=" + balcon +
                '}';
    }
}
