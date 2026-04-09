package Ejercicio7;

public class PilotoFormula1 implements MetodosDePilotoFormula1 {
    private String escuderia;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int trofeosGanados;
    private int numeroEnParrilla;
    private int edad;
    private int tiempoEnF1;
    private int tiempoEnEscuderia;

    public void celebracionTriunfo(){
        System.out.println("Ahora unas palabras del piloto " + this.nacionalidad + ". Muchas gracias al equipo " + this.escuderia + " por este triunfo");
    }

    public void circuito (String circuito){
        System.out.println("Bienvenidos al circuito de " + circuito + "... y comienza la carrera");
    }

    public void adelanta(PilotoFormula1 piloto){
        System.out.println(this.nombre + " adelanta a " + piloto.getNombre() + " y se pone primero");
    }

    public void gana(){
        System.out.println("¡¡¡" + this.nombre + " cruza la línea de parrilla y gana!!!");
    }

    public void averia(){
        System.out.println("Atención: " + this.nombre + " lleva el coche a boxes por una avería");
    }

    public void nuevoTrofeo(){

    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTrofeosGanados() {
        return trofeosGanados;
    }

    public void setTrofeosGanados(int trofeosGanados) {
        this.trofeosGanados = trofeosGanados;
    }

    public int getNumeroEnParrilla() {
        return numeroEnParrilla;
    }

    public void setNumeroEnParrilla(int numeroEnParrilla) {
        this.numeroEnParrilla = numeroEnParrilla;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempoEnF1() {
        return tiempoEnF1;
    }

    public void setTiempoEnF1(int tiempoEnF1) {
        this.tiempoEnF1 = tiempoEnF1;
    }

    public int getTiempoEnEscuderia() {
        return tiempoEnEscuderia;
    }

    public void setTiempoEnEscuderia(int tiempoEnEscuderia) {
        this.tiempoEnEscuderia = tiempoEnEscuderia;
    }
}
