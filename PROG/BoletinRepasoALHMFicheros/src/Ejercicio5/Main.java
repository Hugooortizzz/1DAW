package Ejercicio5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("incidencias.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("informe_incidencias.txt"));

            ArrayList<Incidencia> incidencias = new ArrayList<>();
            HashMap<String, Integer> alumnosIncidencias = new HashMap<>();
            HashMap<String, Integer> tiposIncidencias = new HashMap<>();

            String linea = "";

            while(linea != null){
                linea = br.readLine();

                if(linea != null){
                    String[] partes = linea.split(";");

                    incidencias.add(new Incidencia(partes[0], partes[1]));
                }
            }

            Collections.sort(incidencias);

            for(Incidencia i : incidencias){
                if (!alumnosIncidencias.containsKey(i.getAlumno())){
                    alumnosIncidencias.put(i.getAlumno(), 1);
                }else{
                    alumnosIncidencias.put(i.getAlumno(), alumnosIncidencias.get(i.getAlumno() + 1));
                }

                if(!tiposIncidencias.containsKey(i.getTipo())){
                    tiposIncidencias.put(i.getTipo(), 1);
                }else{
                    tiposIncidencias.put(i.getTipo(), tiposIncidencias.get(i.getTipo() + 1));
                }
            }



            bw.write("INCIDENCIAS POR ALUMNO\n");
            for(Map.Entry pareja : alumnosIncidencias.entrySet()){
                bw.write(pareja.getKey() + ":");
                bw.write(String.valueOf(pareja.getValue()) + "\n");
            }
            bw.write("\n");

            bw.write("INCIDENCIAS POR TIPO\n");
            for(Map.Entry pareja : tiposIncidencias.entrySet()){
                bw.write(pareja.getKey() + ":");
                bw.write(String.valueOf(pareja.getValue()) + "\n");
            }

            bw.close();
            br.close();

        }catch(IOException e){
            System.err.println("No se ha podido leer el fichero");
        }
    }
}
