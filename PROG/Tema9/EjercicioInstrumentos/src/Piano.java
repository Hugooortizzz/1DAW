public class Piano extends Instrumento {
    private int numTeclas;
    private boolean deCola;

    public Piano(String codigo, String marca, double precioBase, int anioFabricacion, int numTeclas, boolean deCola) {
        super(codigo, marca, precioBase, anioFabricacion);
        this.numTeclas = numTeclas;
        this.deCola = deCola;
    }

    public double calcularPrecioFinal(){
        double precioFinal = this.getPrecioBase();

        if (this.deCola){
            precioFinal += 600;
        }

        if (this.numTeclas > 61){
            precioFinal += 100;
        }

        return precioFinal;
    }

    public boolean esEspecial(){
        if (this.deCola || this.numTeclas > 61){
            return true;
        }else{
            return false;
        }
    }

    public String getTipo(){
        return "Piano";
    }

    @Override
    public String toString() {
        return super.toString() + "Piano{" +
                "numTeclas=" + numTeclas +
                ", deCola=" + deCola +
                '}';
    }
}
