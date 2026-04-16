public class Gato implements Comparable<Gato> {
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    public Gato(String nombre, String color, String raza, Integer edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza + "\nEdad: " + this.edad;
    }
    public int compareTo(Gato g) {
        return (Integer.valueOf(this.edad)).compareTo   (Integer.valueOf(g.getEdad()));
    }
    public boolean equals(Gato g) {
        return (this.nombre).equals(g.getNombre());
    }
}