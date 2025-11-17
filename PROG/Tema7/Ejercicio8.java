/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        float[] temperatura = new float[12];
        String[] mes = new String[12];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i<temperatura.length; i++){
            switch (i){
                case 0:
                System.out.print("Introduzca la temperatura media de Enero: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Enero";
                break;

                case 1:
                System.out.print("Introduzca la temperatura media de Febrero: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Febrero";
                break;

                case 2:
                System.out.print("Introduzca la temperatura media de Marzo: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Marzo";
                break;

                case 3:
                System.out.print("Introduzca la temperatura media de Abril: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Abril";
                break;

                case 4:
                System.out.print("Introduzca la temperatura media de Mayo: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Mayo";
                break;

                case 5:
                System.out.print("Introduzca la temperatura media de Junio: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Junio";
                break;

                case 6:
                System.out.print("Introduzca la temperatura media de Julio: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Julio";
                break;

                case 7:
                System.out.print("Introduzca la temperatura media de Agosto: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Agosto";
                break;

                case 8:
                System.out.print("Introduzca la temperatura media de Septiembre: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Septiembre";
                break;

                case 9:
                System.out.print("Introduzca la temperatura media de Octubre: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Octubre";
                break;

                case 10:
                System.out.print("Introduzca la temperatura media de Noviembre: ");
                temperatura[i] = s.nextFloat();
                mes[i] = "Noviembre";
                break;

                default:
                System.out.print("Introduzca la temperatura media de Diciembre: ");
                temperatura[i] = s.nextFloat();
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

        s.close();
    }
}
