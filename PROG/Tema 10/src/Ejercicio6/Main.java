package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(120000, 3, "Barriada del Carmen", "Calle falsa 123", false, true);
        Vivienda vivienda = new Vivienda(150000, 3, "Barriada del Carmen", "Calle falsa 178");
        Piso piso = new Piso(0, 4, "El paseo de Consolación", "calle Av. de Italia 1290", "Tiene balcon");

        System.out.println(casa.toString());
        System.out.println(vivienda.toString());
        System.out.println(piso.toString());
        System.out.println("********************************");

        piso.tieneBalcon();
        System.out.println();

        casa.precioFinal();
        System.out.println();

        casa.actualizarNombre();
        System.out.println();

        Vivienda.numeroDeViviendas();
    }
}
