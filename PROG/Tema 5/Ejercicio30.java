//Realiza una programa que calcule las horas transcurridas entre dos horas de
//dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como
//una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
//introduce los datos correctamente y que el segundo día es posterior al primero.
//A continuación se muestra un ejemplo:

import java.util.Scanner;

public class Ejercicio30 {
    int dia_1;
    int hora_1;
    int dia_2;
    int hora_2;
    boolean bucle;


    Scanner s = new Scanner(System.in);

    while (bucle){
        System.out.print("Introduzca el primer día (1-7): ");
        dia_1 = s.nextInt();

        System.out.print("Introduzca la hora del primer día (00-23): ");
        hora_1 = s.nextInt();

        System.out.print("Introduzca el segundo día (1-7): ");
        dia_2 = s.nextInt();

        System.out.print("Introduzca la hora del segundo día (00-23): ");
        hora_2 = s.nextInt();

        if(dia_1 < 1 || dia_1 > 7){
            bucle = false;
        }if(dia_1 < 1 || dia_1 > 7){
            bucle = false;
        }
    }
    
}
