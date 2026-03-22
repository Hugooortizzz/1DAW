package Ejercicio6;

import java.util.Scanner;

public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void suma(){
        int sumar;
        int opcion;

        Scanner s = new Scanner(System.in);

        System.out.println("¿Qué desea sumar a la hora actual? (" + toString() + ")");
        System.out.println("1.- Horas");
        System.out.println("2.- Minutos");
        System.out.println("3.- Segundos");

        opcion = s.nextInt();

        System.out.print("¿Cuánto desea sumar?: ");
        sumar = s.nextInt();

        switch(opcion){
            case 1:
                this.hora += sumar;
                break;
            case 2:
                this.minuto += sumar;
                break;
            case 3:
                this.segundo += sumar;
                break;
            default:
                System.out.println("Introduzca una opción válida");
                break;
        }
    }

    public void resta(){
        int resta;
        int opcion;

        Scanner s = new Scanner(System.in);

        System.out.println("¿Qué desea restar a la hora actual? (" + toString() + ")");
        System.out.println("1.- Horas");
        System.out.println("2.- Minutos");
        System.out.println("3.- Segundos");

        opcion = s.nextInt();

        System.out.print("¿Cuánto desea restar?: ");
        resta = s.nextInt();

        switch(opcion){
            case 1:
                this.hora -= resta;
                break;
            case 2:
                this.minuto -= resta;
                break;
            case 3:
                this.segundo -= resta;
                break;
            default:
                System.out.println("Introduzca una opción válida");
                break;
        }
    }

    @Override
    public String toString() {
        return hora + "h " + minuto + "m " + segundo + "s";
    }
}
