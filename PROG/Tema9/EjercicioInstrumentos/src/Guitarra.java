public class Guitarra extends Instrumento {
    private int numCuerdas;
    private boolean electrica;

    public Guitarra(String codigo, String marca, double precioBase, int anioFabricacion, boolean electrica, int numCuerdas) {
        super(codigo, marca, precioBase, anioFabricacion);
        this.electrica = electrica;
        this.numCuerdas = numCuerdas;
    }


}
