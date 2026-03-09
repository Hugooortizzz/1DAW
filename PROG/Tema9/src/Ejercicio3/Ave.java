package Ejercicio3;

public class Ave extends Animal {
    public Ave(String nombre, double peso, double altura, int edad){
        super(nombre, peso, altura, edad);
    }

    public void hablar(){
        System.out.println("El ave está cantando");
    }

    public void comer(){
        System.out.println("El ave está comiendo semillas");
    };

    public void moverse(){
        System.out.println("El ave está volando");
    }

    public double getAltura() {
        return super.getAltura();
    }

    public void setAltura(double altura) {
        super.setAltura(altura);
    }

    public int getEdad() {
        return super.getEdad();
    }

    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public double getPeso() {
        return super.getPeso();
    }

    public void setPeso(double peso) {
        super.setPeso(peso);
    }
}
