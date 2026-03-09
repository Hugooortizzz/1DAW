package Ejercicio3;

public class Main {
    public static void main(String[] args){


        Animal animal = new Animal("Animal Genérico", 70, 120, 7);
        Ave ave = new Ave("Ave Genérica", 5, 20, 3);
        Mamifero mamifero = new Mamifero("Mamífero Genérico", 90, 130, 10);
        Perro perro = new Perro("Pluto", 70, 140, 8);
        Gato gato = new Gato("Garfield", 40, 110, 6);
        Canario canario = new Canario("Canario", 0.24, 10, 3);
        Pinguino pinguino = new Pinguino("Tux", 23, 110, 12);
        Lagarto lagarto = new Lagarto("Connors", 5, 40, 4);

        System.out.println("Prueba de métodos hablar()");
        System.out.println("===========================");
        System.out.print("Animal: ");
        animal.hablar();
        System.out.print("Ave: ");
        ave.hablar();
        System.out.print("Mamífero: ");
        mamifero.hablar();
        System.out.print("Perro: ");
        perro.hablar();
        System.out.print("Gato: ");
        gato.hablar();
        System.out.print("Canario: ");
        canario.hablar();
        System.out.print("Pingüino: ");
        pinguino.hablar();
        System.out.print("Lagarto: ");
        lagarto.hablar();
        System.out.println("===========================\n");

        System.out.println("Prueba de métodos comer()");
        System.out.println("===========================");
        System.out.print("Animal: ");
        animal.comer();
        System.out.print("Ave: ");
        ave.comer();
        System.out.print("Mamífero: ");
        mamifero.comer();
        System.out.print("Perro: ");
        perro.comer();
        System.out.print("Gato: ");
        gato.comer();
        System.out.print("Canario: ");
        canario.comer();
        System.out.print("Pingüino: ");
        pinguino.comer();
        System.out.print("Lagarto: ");
        lagarto.comer();
        System.out.println("===========================\n");

        System.out.println("Prueba de métodos moverse()");
        System.out.println("===========================");
        System.out.print("Animal: ");
        animal.moverse();
        System.out.print("Ave: ");
        ave.moverse();
        System.out.print("Mamífero: ");
        mamifero.moverse();
        System.out.print("Perro: ");
        perro.moverse();
        System.out.print("Gato: ");
        gato.moverse();
        System.out.print("Canario: ");
        canario.moverse();
        System.out.print("Pingüino: ");
        pinguino.moverse();
        System.out.print("Lagarto: ");
        lagarto.moverse();
        System.out.println("===========================\n");

    }
}
