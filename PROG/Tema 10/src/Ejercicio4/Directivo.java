package Ejercicio4;

public class Directivo implements Empleado {
    private String nombre;

    public Directivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + this.nombre + " -> Directivo";
    }
}
