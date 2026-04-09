package Ejercicio6;

import java.util.Scanner;

public class Casa extends Vivienda{
    private boolean jardin;
    private boolean patio;
    Scanner s = new Scanner(System.in);

    public Casa(double precio, int numerodehabitaciones, String nombredebarriada, String calle, boolean jardin, boolean patio) {
        super(precio, numerodehabitaciones, nombredebarriada, calle);
        this.jardin = jardin;
        this.patio = patio;
    }

    public void precioFinal(){
        double precioFinal = this.getPrecio();
        boolean extras = false;

        if(this.jardin){
            precioFinal += 15000;
            extras = true;
        }

        if(this.patio){
            precioFinal += 15000;
            extras = true;
        }

        System.out.print("El precio de la casa situada en la " + this.getNombredebarriada() + " es de " + this.getPrecio()
                + "€. Esta vivienda se encuentra en la calle: " + this.getCalle() + ". ");
        if (extras){
            System.out.print("Debido a que incorpora algunos extras, situado en la " + this.getCalle()
                    + ", tiene un precio final de: " + precioFinal + "€.");
        }else{
            System.out.println("No tiene ningún extra, por lo que situado en la " + this.getCalle()
                    + ", sigue teniendo un precio final de: " + precioFinal + "€.");
        }

        this.setPrecio(precioFinal);
    }

    public void actualizarNombre(){
        System.out.print("La casa situada en la barriada Barriada del Carmen cambió de nombre, ahora se llama: ");
        this.setNombredebarriada(s.next());
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    @Override
    public String toString() {
        return super.toString() + "jardin=" + jardin +
                ", patio=" + patio +
                '}';
    }
}
