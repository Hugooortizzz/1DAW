public class Persona implements Cloneable {
    String nombre;
    Direccion direccion;

    Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public Persona clone() {
        try {
            Persona copia = (Persona) super.clone();
            copia.direccion = this.direccion.clone();
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
