package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        Scanner s = new Scanner(System.in);

        boolean salir = false;
        int n_entradas;

        while (!salir){
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            switch(s.nextInt()){
                case 1:
                    System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Zona Compra-Venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Zona VIP: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("¿Para que zóna quieres las entradas?");
                    System.out.println("1. Sala Principal");
                    System.out.println("2. Zona Compra-Venta");
                    System.out.println("3. Zona VIP");
                    switch(s.nextInt()){
                        case 1:
                            System.out.println("¿Cuántas entradas quieres? (" + salaPrincipal.getEntradasPorVender() + " entradas restantes)");
                            salaPrincipal.vender(s.nextInt());
                            break;
                        case 2:
                            System.out.println("¿Cuántas entradas quieres? (" + compraVenta.getEntradasPorVender() + " entradas restantes)");
                            compraVenta.vender(s.nextInt());
                            break;
                        case 3:
                            System.out.println("¿Cuántas entradas quieres? (" + vip.getEntradasPorVender() + " entradas restantes)");
                            vip.vender(s.nextInt());
                            break;
                        default:
                            System.out.println("Introduzca una opción valida");
                            break;
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        }
    }
}
