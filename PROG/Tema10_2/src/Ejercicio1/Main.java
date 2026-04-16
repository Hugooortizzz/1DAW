//Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
//muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
//todo el ArrayList sin usar ningún índice.

package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();

        compañeros.add("Francisco Javier");
        compañeros.add("Francisco José");
        compañeros.add("Pablo");
        compañeros.add("Adrián");
        compañeros.add("Nahum");
        compañeros.add("Miguel");

        for(String r : compañeros){
            System.out.println(r);
        }
    }
}
