package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;



public class Main {
    public static void main(String[] args) {
        try{
            HashMap<String, Integer> frecuencia = new HashMap<>();
            ArrayList<String> palabras = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader("palabras.txt"));

            String linea = "";

            while(linea != null){
                linea = br.readLine();

                if (linea != null){
                    if (!frecuencia.containsKey(linea)){
                        frecuencia.put(linea, 1);
                        palabras.add(linea);
                    }else{
                        frecuencia.put(linea, frecuencia.get(linea) + 1);
                    }
                }
            }

            Collections.sort(palabras);

            for(String p : palabras){
                System.out.println(p);
            }

            for()


        }catch(IOException e){
            System.err.println("No se ha podido leer el archivo");
        }
    }
}
