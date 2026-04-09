package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalaPrincipal salaprincipal = new SalaPrincipal();
        CompraVenta compraventa = new CompraVenta();
        Vip vip = new Vip();
        Scanner s = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        int entradas;

        while (!salir){
            System.out.println();
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            opcion = s.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Quedan en total " + (salaprincipal.getEntradasPorVender() +
                            compraventa.getEntradasPorVender() + vip.getEntradasPorVender()) +
                            " entradas por vender");
                    System.out.println("Sala Principal: " + salaprincipal.getEntradasPorVender());
                    System.out.println("Compra Venta: " + compraventa.getEntradasPorVender());
                    System.out.println("Vip: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("¿Para que zona quiere las entradas?");
                    System.out.println("1.- Sala principal (" + salaprincipal.getEntradasPorVender() + " entradas disponibles)");
                    System.out.println("2.- Compra venta (" + compraventa.getEntradasPorVender() + " entradas disponibles)");
                    System.out.println("3.- Vip (" + vip.getEntradasPorVender() + " entradas disponibles)");
                    opcion = s.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("Entradas Sala Principal....(Hay " + salaprincipal.getEntradasPorVender() + ")");
                            entradas = s.nextInt();

                            if(entradas > salaprincipal.getEntradasPorVender()){
                                System.out.println("No hay suficientes entradas en venta (Quiere comprar " + entradas + " y solo hay " + salaprincipal.getEntradasPorVender() + ")");
                            } else{
                                System.out.println("Ha elegido comprar " + entradas + " entradas");
                                salaprincipal.vender(entradas);
                            }

                            System.out.println("....Fin Entradas Sala Principal");
                            break;
                        case 2:
                            System.out.println("Entradas Compra Venta....(Hay " + compraventa.getEntradasPorVender() + ")");
                            entradas = s.nextInt();

                            if(entradas > compraventa.getEntradasPorVender()){
                                System.out.println("No hay suficientes entradas en venta (Quiere comprar " + entradas + " y solo hay " + compraventa.getEntradasPorVender() + ")");
                            } else {
                                System.out.println("Ha elegido comprar " + entradas + " entradas");
                                compraventa.vender(entradas);
                            }
                            System.out.println("....Fin Entradas Compra Venta");
                            break;
                        case 3:
                            System.out.println("Entradas Vip....(Hay " + vip.getEntradasPorVender() + ")");
                            entradas = s.nextInt();

                            if(entradas > vip.getEntradasPorVender()){
                                System.out.println("No hay suficientes entradas en venta (Quiere comprar " + entradas + " y solo hay " + vip.getEntradasPorVender() + ")");
                            } else {
                                System.out.println("Ha elegido comprar " + entradas + " entradas");
                                vip.vender(entradas);
                            }

                            System.out.println("....Fin Entradas Vip");
                            break;
                        default:
                            System.out.println("Introduzca una opción válida");
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
