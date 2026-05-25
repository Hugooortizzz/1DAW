package Ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private BufferedReader br;
    private BufferedWriter bw;
    private HashMap<String, ArrayList<String>> catalogo;

    public Catalogo() {
        try{
            catalogo = new HashMap<>();
            br = new BufferedReader(new FileReader("etiquetas.txt"));
            bw = new BufferedWriter(new FileWriter("catalogo_etiquetas.txt"));

            this.introducirHM();
        }catch(IOException e){
            System.err.println("No se ha podido leer el/los ficheros");
        }
    }

    public void introducirHM() throws IOException {
        String linea = "";

        while(linea != null){
            linea = br.readLine();

            if(linea != null){
                String[] etiquetas = linea.split(";");

                if (!catalogo.containsKey(etiquetas[0])){
                    catalogo.put(etiquetas[0], new ArrayList<>());
                }

                for (int i = 1; i < etiquetas.length; i++) {
                    catalogo.get(etiquetas[0]).add(etiquetas[i]);
                }
            }
        }
    }

    public String mostrarCodigo(String etiqueta){
        String resultado = "Esa etiqueta no existe";
        if(catalogo.containsKey(etiqueta)){
            resultado = etiqueta + ": ";

            for(String c : catalogo.get(etiqueta)){
                resultado += c + ", ";
            }
        }

        return resultado;
    }

    public void guardarCatalogo() throws IOException {
        for(Map.Entry pareja : catalogo.entrySet()){
            bw.write(mostrarCodigo((String.valueOf(pareja.getKey()))) + "\n");
        }
    }

    public void cerrar() throws IOException {
        br.close();
        bw.close();
    }


}
