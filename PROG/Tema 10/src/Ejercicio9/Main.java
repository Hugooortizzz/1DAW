package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomestico = new Electrodomestico[10];
        electrodomestico[0] = new Electrodomestico(300, 35);
        electrodomestico[1] = new Television(600, Color.negro, Letra.C, 30, 60, true);
        electrodomestico[2] = new Lavadora();
        electrodomestico[3] = new Television();
        electrodomestico[4] = new Lavadora(200, Color.blanco, Letra.A, 50, 20);
        electrodomestico[5] = new Television(400, 50);
        electrodomestico[6] = new Lavadora(100, 60);
        electrodomestico[7] = new Electrodomestico(150, Color.azul, Letra.F, 43);
        electrodomestico[8] = new Electrodomestico();
        electrodomestico[9] = new Television(1000, 28);

        for (int i = 0; i < electrodomestico.length; i++) {
            electrodomestico[i].precioFinal();
            System.out.println("Precio electrodomestico " + (i+1) + ": " + electrodomestico[i].getPrecioBase());
        }

        System.out.println("Precio Final Electrodomesticos: " + Electrodomestico.getPrecioElectrodomesticos());
        System.out.println("Precio Final Televisiones: " + Television.getPrecioTelevisiones());
        System.out.println("Precio Final Lavadoras: " + Lavadora.getPrecioLavadoras());
    }
}
