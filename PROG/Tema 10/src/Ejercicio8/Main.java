package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Producto[] producto = new Producto[3];
        producto[0] = new Producto("Lejía", 0.80);
        producto[1] = new Perecedero("Galletas María", 1.40, 3);
        producto[2] = new NoPerecedero("Lenteja", 2.05, Tipo.Legumbres);

        for (int i = 0; i < producto.length; i++) {
            System.out.println("Precio vender 5 unidades de " + producto[i].getNombre() + ": " + producto[i].calcular(5));
        }

    }
}
