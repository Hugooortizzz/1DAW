//Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
//contenidas en un fichero de texto. El nombre del fichero que contiene las
//palabras se debe pasar como argumento en la línea de comandos. El nombre
//del fichero resultado debe ser el mismo que el original añadiendo la coletilla
//sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
//línea.

package Ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();
        String palabra = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));

            while (palabra != null){
                palabra = bf.readLine();
                if(palabra != null){
                    palabras.add(palabra);
                }
            }

            Collections.sort(palabras);

            for(String p : palabras){
                bw.write(p + "\n");
            }

            bf.close();
            bw.close();
        }catch (IOException e){
            System.err.println("No se puede leer el fichero " + args[0]);
        }


    }
}
