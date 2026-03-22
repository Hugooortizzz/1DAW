package Ejercicio2;

public class Gato {
    private String nombre;
    private String raza;
    private int peso;
    private int altura;
    private int edad;

    public Gato(int altura, int edad, String nombre, int peso, String raza) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
    }

    public Gato() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }
}
