package Ejercicio2;

import java.util.Scanner;

public class Coche extends Vehiculo{
    private static double kilometrosRecorridos;

    public Coche() {
        super.setVehiculosCreados(super.getVehiculosCreados() + 1);
    }

    public void andar(){
        double andado;

        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántos kilometros vas a andar con el coche?: ");
        andado = s.nextDouble();

        kilometrosRecorridos += andado;
        super.setKilometrosTotales(super.getKilometrosTotales() + andado);

    }

    public void quemaRueda(){
        System.out.println("Estoy quemando rueda con el coche");
    }

    public static double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static void setKilometrosRecorridos(double kilometrosRecorridos) {
        Coche.kilometrosRecorridos = kilometrosRecorridos;
    }
}
