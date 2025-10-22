//Realiza una programa que calcule las horas transcurridas entre dos horas de
//dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como
//una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
//introduce los datos correctamente y que el segundo día es posterior al primero.
//A continuación se muestra un ejemplo:

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        int dia1;
        int dia2;
        int hora1;
        int hora2;
        int horas;

        Scanner s = new Scanner(System.in);


        //Este primer do while impedirá al programa avanzar hasta que el segundo día no sea mayor que el primero
        do{
            //Este bloque de 4 bucles impide al programa empezar si no se introducen correctamente los datos
            do{
                System.out.print("Introduzca el primer día: ");
                dia1 = s.nextInt();
            }while ((dia1 < 1) ||(dia1 > 7));

            do{
                System.out.print("Introduzca la hora del primer día: ");
                hora1 = s.nextInt();
            }while ((hora1 < 0) ||(hora1 > 23));

            do{
                System.out.print("Introduzca el segundo día: ");
                dia2 = s.nextInt();
            }while ((dia2 < 1) ||(dia2 > 7));

            do{
                System.out.print("Introduzca la hora del segundo día: ");
                hora2 = s.nextInt();
            }while ((hora2 < 0) ||(hora2 > 23));
            if (dia2 < dia1){
                System.out.println("El primer día debe ser mayor que el segundo");
            }
        }while (dia2 < dia1);

        //Finalmente, se restaran los días que hay entre los dos días y se pasará a horas, y a eso se le sumará la diferencia entre las dos horas
        horas = ((dia2 - dia1) * 24) + (hora2 - hora1);
        System.out.print("Desde las " + hora1 + " del día " + dia1 + " hasta las " + hora2 + " del dia " + dia2 + " han pasado " + horas + " horas");



    }
}
