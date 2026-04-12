package Ejercicio8;

public class NoPerecedero extends Producto{
    private Tipo tipo;

    public NoPerecedero(String nombre, double precio, Tipo tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNoPerecedero{" +
                "tipo=" + tipo +
                '}';
    }
}
