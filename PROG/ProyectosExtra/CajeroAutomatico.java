/* Simulador de cajero automático con menú de opciones (consultar saldo, retirar, depositar, salir).
 */

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        int accion;
        double saldo = 0;
        double transaccion;
        boolean salir = false;

        Scanner s = new Scanner(System.in);

        while (!salir){
        System.out.println("\nTU CUENTA BANCARIA");
        System.out.println("------------------");
        System.out.println("¿Qué operación quieres llevar a cabo?");
        System.out.println("1.- Consultar saldo");
        System.out.println("2.- Depositar");
        System.out.println("3.- Retirar");
        System.out.println("4.- Salir");
        accion = s.nextInt();

        switch (accion){
            case 1:
            System.out.println("Saldo actual: " + saldo);
            break;

            case 2:
            System.out.print("Indique la cantidad a depositar: ");
            transaccion = s.nextDouble();
            saldo = saldo + transaccion;
            break;

            case 3:
            System.out.print("Indique la cantidad a retirar");
            transaccion = s.nextDouble();
            saldo = saldo - transaccion;
            break;

            case 4:
            salir = true;
        }
        }
        
        s.close();
    }    
}
