package Ejercicio7;

import java.util.Random;

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
    private static int n_pilotos = 0;
    private static int n_carreras;

    public PilotoFormula1(String escuderia, String nombre, String apellido, String nacionalidad, int trofeosGanados, int numeroEnParrilla, int edad, int tiempoEnF1, int tiempoEnEscuderia) {
        this.escuderia = escuderia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.trofeosGanados = trofeosGanados;
        this.numeroEnParrilla = numeroEnParrilla;
        this.edad = edad;
        this.tiempoEnF1 = tiempoEnF1;
        this.tiempoEnEscuderia = tiempoEnEscuderia;
    }

    public void celebracionTriunfo(){
        System.out.println("Ahora unas palabras del piloto " + this.nacionalidad + ". Muchas gracias al equipo " + this.escuderia + " por este triunfo");
    }

    //No sería mejor que fuera static?
    public void circuito (String circuito){
        System.out.println("Bienvenidos al circuito de " + circuito + "... y comienza la carrera");
    }

    public void adelanta(PilotoFormula1 piloto){
        System.out.println(this.nombrar() + " adelanta a " + piloto.getApellido() + " y se pone primero");
    }

    public void gana(){
        System.out.println("¡¡¡" + this.nombrar() + " cruza la línea de parrilla y gana!!!");
    }

    public void averia(){
        System.out.println("Atención: " + this.nombrar() + " lleva el coche a boxes por una avería");
    }

    public int nuevoTrofeo(){
        this.trofeosGanados ++;
        System.out.println("Y con este, " + nombrar() + " lleva " + this.getTrofeosGanados() + " trofeos este año.");
        return trofeosGanados;
    }

    public void nuevaEscuderia(String nuevaEscuderia){
        System.out.println(this.apellido + " ha cambiado a la escudería " + nuevaEscuderia);
        this.setEscuderia(nuevaEscuderia);
        this.tiempoEnEscuderia = 0;
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
        System.out.println(this.nombrar() + " lleva " + this.trofeosGanados + " trofeos este año.");
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

    public String nombrar(){
        Random r = new Random();
        int opcion = r.nextInt(1, 3);

        if (opcion == 1){
            return this.nombre;
        }else if (opcion == 2){
            return this.apellido;
        }else{
            return this.nombre + this.apellido;
        }
    }


}
