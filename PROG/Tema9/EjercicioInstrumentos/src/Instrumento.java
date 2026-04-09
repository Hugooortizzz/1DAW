public abstract class Instrumento {
    private String codigo;
    private String marca;
    private double precioBase;
    private int anioFabricacion;
    private boolean vendido;

    public Instrumento(String codigo, String marca, double precioBase, int anioFabricacion) {
        this.codigo = codigo;
        this.marca = marca;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.vendido = false;
    }

    public boolean estaVendido(){
        return this.vendido;
    }

    public void aplicarDescuento(double porcentaje){
        this.precioBase *= (100 / porcentaje);
    }

    public boolean esVintage(){
        if (this.anioFabricacion < 2000){
            return true;
        }else{
            return false;
        }
    }

    public abstract double calcularPrecioFinal();

    public abstract boolean esEspecial();

    public abstract String getTipo();

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "anioFabricacion=" + anioFabricacion +
                ", codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", precioBase=" + precioBase +
                ", vendido=" + vendido +
                '}';
    }
}
