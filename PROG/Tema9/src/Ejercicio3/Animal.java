package Ejercicio3;

public class Animal {
    private String nombre;
    private double peso;
    private double altura;
    private int edad;

    public Animal(String nombre, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public void hablar(){
        System.out.println("El animal está haciendo un sonido genérico de animal");
    }

    public void comer(){
        System.out.println("El animal está comiendo comida genérica de animal");
    }

    public void moverse(){
        System.out.println("El animal se está moviendo como un animal genérico");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
