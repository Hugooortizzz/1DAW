//Realiza una programa que calcule las horas transcurridas entre dos horas de
//dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como
//una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
//introduce los datos correctamente y que el segundo día es posterior al primero.
//A continuación se muestra un ejemplo:

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        
    int dia_1 = 0;
    int hora_1 = 0;
    int dia_2 = 0;
    int hora_2 = 0;
    int horas = 0;
    boolean bucle = true;


    Scanner s = new Scanner(System.in);

    while (bucle){
        System.out.print("Introduzca el primer día (1-7): ");
        dia_1 = s.nextInt();
        if(dia_1 >= 1 && dia_1 <= 7){
            bucle = false;
        }

        System.out.print("Introduzca la hora del primer día (00-23): ");
        hora_1 = s.nextInt();
        if(hora_1 >= 0 && hora_1 <= 23){
            bucle = false;
        }

        System.out.print("Introduzca el segundo día (1-7): ");
        dia_2 = s.nextInt();
        if(dia_2 >= 1 && dia_2 <= 7){
            bucle = false;
        }
        }

        System.out.print("Introduzca la hora del segundo día (00-23): ");
        hora_2 = s.nextInt();
        if(hora_2 >= 0 && hora_2 <= 23){
            bucle = false;
        }

        for (int i = dia_1; i < dia_2; i++){
            horas ++;
        }

        horas = horas * 24;


        if (hora_1 > hora_2){
            horas = horas + hora_2 - hora_1;
        }else{
            horas = horas - hora_1 + hora_2;
        }
        
        System.out.println("Entre las " + hora_1 + ":00 horas del día " + dia_1 + " y las " + hora_2 + ":00 horas del día " + dia_2 + " han pasado " + horas + " horas");
    }
}
