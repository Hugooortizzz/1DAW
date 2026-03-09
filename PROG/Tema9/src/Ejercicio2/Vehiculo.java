package Ejercicio2;

public class Vehiculo {
    private static int vehiculosCreados;
    private static double kilometrosTotales;

    public Vehiculo() {
    }


    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(double kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }
}
