package Ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<>();
        double minima = Double.MAX_VALUE;
        double maxima = Double.MIN_VALUE * -1;
        double media = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader("temperaturas.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("resumen_temperaturas.txt"));

            String palabra = br.readLine();

            if(palabra == null){
                System.out.println("Esta vacio");
            }else{
                while(palabra != null){
                    if(palabra != null){
                        temperaturas.add(Double.parseDouble(palabra));
                    }
                    palabra = br.readLine();
                }

                for(Double t : temperaturas){
                    if(t > maxima){
                        maxima = t;
                    }

                    if(t < minima){
                        minima = t;
                    }

                    media += t;
                }

                media /= temperaturas.size();

                System.out.println("Máxima temperatura: " + maxima);
                bw.write("Máxima temperatura: " + maxima + "\n");
                System.out.println("Mínima temperatura: " + minima);
                bw.write("Mínima temperatura: " + minima + "\n");
                System.out.println("Media: " + media);
                bw.write("Media: " + media + "\n");


            }

            br.close();
            bw.close();

        }catch(IOException e){
            System.err.println("No se ha podido leer el archivo");
        }
    }
}
