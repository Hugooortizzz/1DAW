package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        Paquete paquete;

        while (!salir){
            System.out.println("Clasificador de paquetes de mensajería");
            System.out.println("--------------------------------------");
            System.out.println("1.- Dar de alta un paquete");
            System.out.println("2.- Cambiar estado de un paquete");
            System.out.println("3.- Mostrar paquetes");
            System.out.println("4.- Salir");

            switch(s.nextInt()){
                case 1:
                    do{
                       paquete = new Paquete();
                        System.out.println("Introduzca el código del producto: ");
                        paquete.setCodigo(s.next());
                        System.out.println("Introduzca el destinatario del producto: ");
                        paquete.setDestinatario(s.next());
                        System.out.println("Introduzca la zona(local, regional o nacional)");
                        switch(s.next()){
                            case "local":
                            case "Local":
                            case "LOCAL":
                                paquete.setZona(Zona.local);
                                break;
                            case "regional":
                            case "Regional":
                            case "REGIONAL":
                                paquete.setZona(Zona.regional);
                                break;
                            case "nacional":
                            case "Nacional":
                            case "NACIONAL":
                                paquete.setZona(Zona.nacional);
                                break;
                        }

                        System.out.println("Introduzca el peso del producto: ");
                        paquete.setPeso(s.nextDouble());
                        System.out.println("Introduzca el estado del producto");
                        switch(s.nextLine()){
                            case "pendiente":
                                paquete.setEstado(Estado.pendiente);
                                break;
                            case "enreparto":
                                paquete.setEstado(Estado.enReparto);
                                break;
                            case "entregado":
                                paquete.setEstado(Estado.entregado);
                                break;
                        }

                    }while(paquetes.contains(paquete));
                    paquetes.add(paquete);
            }
        }

    }
}
