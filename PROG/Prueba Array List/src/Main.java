import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Garfield", "naranja", "mestizo", 5));
        g.add(new Gato("Pepe", "gris", "angora", 4));
        g.add(new Gato("Mauri", "blanco", "manx", 1));
        g.add(new Gato("Ulises", "marrón", "persa", 10));
        g.add(new Gato("Adán", "negro", "angora", 20));
        Collections.sort(g);
        System.out.println("\nDatos de los gatos ordenados por nombre:");
        for (Gato gatoAux: g) {
            System.out.println(gatoAux+"\n");
        }
    }
}
