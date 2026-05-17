package ExamenTarde;

import java.util.Objects;

public class Pedido implements Comparable<Pedido>{
    private String codigo;
    private String cliente;
    private String zona;
    private String estado;
    private double importeBase;

    public Pedido(String cliente, String codigo, String estado, double importeBase, String zona) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.estado = estado;
        this.importeBase = importeBase;
        this.zona = zona;
    }



    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public int compareTo(Pedido o) {
        int resultado = ((Double) o.getImporteBase()).compareTo((this.importeBase));

        if(resultado != 0){
            return resultado;
        }

        return (this.codigo).compareTo(o.getCodigo());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(codigo, pedido.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
