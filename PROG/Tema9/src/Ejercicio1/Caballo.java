package Tema9.Ejercicio1;

public class Caballo {
    private String nombre;
    private String raza;
    private double peso;
    private String color;
    private int edad;


    //Constructores
    public Caballo(){
    }

    public Caballo(String nombre, String raza, double peso, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.color = color;
    }

    //Métodos
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void beber(){
        System.out.println("Estoy bebiendo");
    }

    public void darCoz(){
        System.out.println("Te voy a dar una coz");
    }

    public void saltar(){
        System.out.print("Voy a saltar");
    }

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //ToString
    @Override
    public String toString() {
        return "Caballo{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }
}
