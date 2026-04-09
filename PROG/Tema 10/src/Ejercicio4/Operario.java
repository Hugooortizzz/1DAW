package Ejercicio4;

public class Operario implements Empleado {
    private String nombre;

    public Operario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + this.nombre + " -> Operario";
    }
}
