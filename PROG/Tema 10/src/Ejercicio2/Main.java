package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;

        System.out.println("¿Qué tipo de dato desea introducir?");
        System.out.println("1.- int");
        System.out.println("2.- char");
        System.out.println("3.- double");
        System.out.println("4.- float");
        System.out.println("5.- long");
        System.out.println("6.- short");
        System.out.println("7.- boolean");
        System.out.println("8.- byte");
        System.out.println("9.- Nada");

        opcion = s.nextInt();

        System.out.println("Introduzca el dato: ");
        switch(opcion){
            case 1:
                int i_dato;
                i_dato = s.nextInt();
                Parametros.tipoParametro(i_dato);
                break;
            case 2:
                char c_dato;
                c_dato = s.next().charAt(0);
                Parametros.tipoParametro(c_dato);
                break;
            case 3:
                double d_dato;
                d_dato = s.nextDouble();
                Parametros.tipoParametro(d_dato);
                break;
            case 4:
                double f_dato;
                f_dato = s.nextFloat();
                Parametros.tipoParametro(f_dato);
                break;
            case 5:
                double l_dato;
                l_dato = s.nextLong();
                Parametros.tipoParametro(l_dato);
                break;
            case 6:
                double s_dato;
                s_dato = s.nextShort();
                Parametros.tipoParametro(s_dato);
                break;
            case 7:
                boolean b_dato;
                b_dato = s.nextBoolean();
                Parametros.tipoParametro(b_dato);
                break;
            case 8:
                byte by_dato;
                by_dato = s.nextByte();
                Parametros.tipoParametro(by_dato);
                break;
            case 9:
                Parametros.tipoParametro();
                break;
            default:
                System.out.println("Introduzca una opción válida");
                break;
        }


    }
}
