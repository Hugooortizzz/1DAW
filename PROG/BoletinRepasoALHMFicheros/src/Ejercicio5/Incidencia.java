package Ejercicio5;

public class Incidencia implements Comparable<Incidencia>{
    private String alumno;
    private String tipo;

    public Incidencia(String alumno, String tipo) {
        this.alumno = alumno;
        this.tipo = tipo;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int compareTo(Incidencia i){
        return (this.alumno).compareTo(i.getAlumno());
    }
}
