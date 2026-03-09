package Ejercicio1;

public class Main {
    public static void main(String[] args){
        Caballo caballo1 = new Caballo("Paco", "Árabe", 120.5,  15, "Marrón");
        Caballo caballo2 = new Caballo();

        caballo2.setNombre("Pepe");
        caballo2.setEdad(12);
        caballo2.setColor("Blanco");
        caballo2.setRaza("Albino");

        caballo1.beber();
        caballo2.comer();
        caballo2.darCoz();
        caballo1.saltar();
        caballo1.correr();

        System.out.println(caballo1.toString());
        System.out.println(caballo2.toString());
    }
}
