package Tema7;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] temperatura = new int[12];
        String[] mes = new String[12];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i<temperatura.length; i++){
            switch (i){
                case 0:
                System.out.print("Introduzca la temperatura media de Enero: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Enero";
                break;

                case 1:
                System.out.print("Introduzca la temperatura media de Febrero: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Febrero";
                break;

                case 2:
                System.out.print("Introduzca la temperatura media de Marzo: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Marzo";
                break;

                case 3:
                System.out.print("Introduzca la temperatura media de Abril: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Abril";
                break;

                case 4:
                System.out.print("Introduzca la temperatura media de Mayo: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Mayo";
                break;

                case 5:
                System.out.print("Introduzca la temperatura media de Junio: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Junio";
                break;

                case 6:
                System.out.print("Introduzca la temperatura media de Julio: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Julio";
                break;

                case 7:
                System.out.print("Introduzca la temperatura media de Agosto: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Agosto";
                break;

                case 8:
                System.out.print("Introduzca la temperatura media de Septiembre: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Septiembre";
                break;

                case 9:
                System.out.print("Introduzca la temperatura media de Octubre: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Octubre";
                break;

                case 10:
                System.out.print("Introduzca la temperatura media de Noviembre: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Noviembre";
                break;

                default:
                System.out.print("Introduzca la temperatura media de Diciembre: ");
                temperatura[i] = s.nextInt();
                mes[i] = "Diciembre";
                break;
            }

            
        }

        for (int j=0; j<temperatura.length; j++){
                System.out.println(mes[j]);
                for (int p=0; p<temperatura[j]; p++){
                    System.out.print("*");
                }
                System.out.print(" " + temperatura[j]);
                System.out.print("\n");
            }
    }
}
