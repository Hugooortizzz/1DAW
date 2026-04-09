package Ejercicio5;

import java.util.Scanner;

public class Coche extends Vehiculo{
    private int kilometrosRecorridos;
    Scanner s = new Scanner(System.in);

    public Coche() {
        super();
    }

    public void quemaRueda(){
        System.out.println("Estoy quemando rueda con el coche");
    }

    public void andar(){
        int kilometros;

        System.out.println("¿Cuántos kilómetros quieres andar?: ");
        kilometros = s.nextInt();

        System.out.println("Estoy andando con el coche por " + kilometros + " kilómetros");
        this.kilometrosRecorridos += kilometros;
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + kilometros);
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        kilometrosRecorridos = kilometrosRecorridos;
    }
}
