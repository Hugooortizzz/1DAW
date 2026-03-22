package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean salir = false;
        int opcion;

        Scanner s = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        while (!salir){
            System.out.println("VEHÍCULOS");
            System.out.println("==========");
            System.out.println("1.- Anda con la bicicleta");
            System.out.println("2.- Haz el caballito con la bicicleta");
            System.out.println("3.- Anda con el coche");
            System.out.println("4.- Quema rueda con el coche");
            System.out.println("5.- Ver kilometraje de la bicicleta");
            System.out.println("6.- Ver kilometraje del coche");
            System.out.println("7.- Ver kilometraje total");
            System.out.println("8.- Salir");
            System.out.print("Elige una opción (1-8): ");

            opcion = s.nextInt();

            switch(opcion){
                case 1:
                    bicicleta.andar();
                    break;
                case 2:
                    bicicleta.caballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:
                    System.out.println(bicicleta.getKilometrosRecorridos() + " km");
                    break;
                case 6:
                    System.out.println(coche.getKilometrosRecorridos() + " km");
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales() + " km");
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }

        }
    }
}
