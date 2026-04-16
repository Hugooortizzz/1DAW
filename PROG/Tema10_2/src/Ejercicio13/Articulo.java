package Ejercicio13;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = 0;
    }

    public Articulo() {
    }

    public void entrada(int n){
        System.out.println("Han entrado " + n + " unidades del artículo " + this.codigo + " correctamente.");
        this.stock += n;
    }

    public void salida(int n){
        if (n > this.stock){
            System.out.println("No puedes sacár más unidades de las que hay en stock");
        }else{
            this.stock -= n;
            System.out.println("Han salido " + n + " unidades del artículo " + this.codigo + " correctamente.");

        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }
}
