package Ejercicio7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("canciones.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("canciones_ordenadas.txt"));
            ArrayList<Cancion> canciones = new ArrayList<>();
            HashMap<String, Integer> duracionArtista = new HashMap<>();

            String linea = "";

            while(linea != null){
                linea = br.readLine();

                if(linea != null){
                    String[] dividido = linea.split(";");

                    canciones.add(new Cancion(dividido[0], dividido[1], Integer.parseInt(dividido[2])));

                    if(!duracionArtista.containsKey(dividido[1])){
                        duracionArtista.put(dividido[1], Integer.parseInt(dividido[2]));
                    }else{
                        duracionArtista.put(dividido[1], duracionArtista.get(dividido[1]) + Integer.parseInt(dividido[2]));
                    }
                }
            }

            Collections.sort(canciones);

            for(Cancion c : canciones) {
                System.out.println(c.toString());
                bw.write(c.getTitulo() + ";" + c.getArtista() + ";" + c.getDuracionSegundos() + "\n");
            }

            for(Map.Entry pareja : duracionArtista.entrySet()){
                System.out.println(pareja.getKey() + ": " + pareja.getValue());
            }

            bw.close();
            br.close();

        }catch(IOException e){
            System.err.println("No se ha podido leer/escribir el/los fichero/s");
        }
    }
}
