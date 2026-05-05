package Ejercicio1;

import java.util.ArrayList;
import java.util.Objects;

public class Paquete {
    private String codigo;
    private String destinatario;
    private Zona zona;
    private double peso;
    private Estado estado;

    public Paquete(String codigo, String destinatario, double peso, Zona zona) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.estado = Estado.pendiente;
        this.peso = peso;
        this.zona = zona;
    }

    public Paquete() {
    }

    public boolean existe(ArrayList<Paquete> coleccion, Paquete paquete){
        return coleccion.contains(paquete);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }



public int compareTo (Paquete p){
    int resultado = (this.zona).compareTo(p.getZona());

    if (resultado != 0){
        return resultado;
    }else{
        return ((Double) this.peso).compareTo(p.getPeso());
    }
}

    @Override
    public String toString() {
        return "Paquete{" +
                "codigo='" + codigo + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", zona=" + zona +
                ", peso=" + peso +
                ", estado=" + estado +
                '}';
    }
}
