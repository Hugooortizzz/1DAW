package Ejercicio5;

import java.util.Scanner;

public class Bicicleta extends Vehiculo {
    private int kilometrosRecorridos;
    Scanner s = new Scanner(System.in);

    public Bicicleta() {
        super();
    }

    public void andar(){
        int kilometros;

        System.out.println("¿Cuántos kilómetros quieres andar?: ");
        kilometros = s.nextInt();

        System.out.println("Estoy andando con la bicicleta por " + kilometros + " kilómetros" );
        this.kilometrosRecorridos += kilometros;
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + kilometros);
    }

    public void caballito(){
        System.out.println("Estoy haciendo un caballito con la bicicleta");
    }

    public  int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public  void setKilometrosRecorridos(int kilometrosRecorridos) {
        kilometrosRecorridos = kilometrosRecorridos;
    }
}
