public class Guitarra extends Instrumento {
    private int numCuerdas;
    private boolean electrica;

    public Guitarra(String codigo, String marca, double precioBase, int anioFabricacion, boolean electrica, int numCuerdas) {
        super(codigo, marca, precioBase, anioFabricacion);
        this.electrica = electrica;
        this.numCuerdas = numCuerdas;
    }

    public double calcularPrecioFinal(){
        double precioFinal = this.getPrecioBase();

        if (this.electrica){
            precioFinal += 150;
        }

        if (this.numCuerdas > 6){
           precioFinal += 60;
        }

        return precioFinal;
    }

    public boolean esEspecial(){
        if (this.electrica || this.numCuerdas > 6){
            return true;
        }else{
            return false;
        }
    }

    public String getTipo(){
        return "Guitarra";
    }

    @Override
    public String toString() {
        return super.toString() + "Guitarra{" +
                "numCuerdas=" + numCuerdas +
                ", electrica=" + electrica +
                '}';
    }
}
