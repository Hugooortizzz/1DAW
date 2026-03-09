package Ejercicio2;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{
    private static double kilometrosRecorridos;

    public Bicicleta() {
        super.setVehiculosCreados(super.getVehiculosCreados() + 1);
    }

    public void andar(){
        double andado;

        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántos kilometros vas a andar con la bici?: ");
        andado = s.nextDouble();

        kilometrosRecorridos += andado;
        super.setKilometrosTotales(super.getKilometrosTotales() + andado);

    }

    public void caballito(){
        System.out.println("Estoy haciendo un caballito con la bicicleta");
    }

    public static double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static void setKilometrosRecorridos(double kilometrosRecorridos) {
        Bicicleta.kilometrosRecorridos = kilometrosRecorridos;
    }
}
