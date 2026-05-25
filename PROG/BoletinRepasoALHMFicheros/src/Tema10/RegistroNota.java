package Tema10;

public class RegistroNota {
    private String alumno;
    private String modulo;
    private double nota;

    public RegistroNota(String alumno, String modulo, String nota) {
        this.alumno = alumno;
        this.modulo = modulo;
        this.nota = Double.parseDouble(nota);
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
