package Tema10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("notas_modulos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("medias_modulos.txt"));
            ArrayList<RegistroNota> registroNota = new ArrayList<>();
            ArrayList<String> alumnosEnRiesgo = new ArrayList<>();
            HashMap<String, ArrayList<Double>> moduloNota = new HashMap<>();
            HashMap<String, Double> medias = new HashMap<>();
            HashMap<String, Integer> contadorModulo = new HashMap<>();

            String linea = "";

            while(linea != null){
                linea = br.readLine();

                if (linea != null){
                    String[] dividir = linea.split(";");

                    registroNota.add(new RegistroNota(dividir[0], dividir[1], dividir[2]));

                    if (!moduloNota.containsKey(dividir[1])){
                        moduloNota.put(dividir[1], new ArrayList<Double>());
                        medias.put(dividir[1], 0.0);
                        contadorModulo.put(dividir[1], 1);
                    }else{
                        contadorModulo.put(dividir[1], contadorModulo.get(dividir[1]) + 1);
                    }

                    moduloNota.get(dividir[1]).add(Double.parseDouble(dividir[2]));
                    medias.put(dividir[1], (Double)medias.get(dividir[1]) + Double.parseDouble(dividir[2]));
                }
            }
            for (String c : contadorModulo.keySet()){
                medias.put(c, medias.get(c) / contadorModulo.get(c));
            }

            ArrayList<String> modulos = new ArrayList<>(contadorModulo.keySet());

            Collections.sort(modulos);

            for (Map.Entry pareja : medias.entrySet()){
                bw.write(pareja.getKey() + ";" + pareja.getValue() + "\n");
            }

            bw.close();

            bw = new BufferedWriter(new FileWriter("alumnado_en_riesgo.txt"));


            for(RegistroNota r : registroNota){
                if (r.getNota() < 4 && !alumnosEnRiesgo.contains(r.getAlumno())){
                    alumnosEnRiesgo.add(r.getAlumno());
                }
            }

            for(String a : alumnosEnRiesgo){
                bw.write(a);
            }

            bw.close();


        }catch(IOException e){
            System.err.println("No se ha podido leer/escribir el/los fichero/s");
        }
    }
}
