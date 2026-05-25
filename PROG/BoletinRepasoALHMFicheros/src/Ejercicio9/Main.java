package Ejercicio9;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("prestamos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("avisos.txt"));
            ArrayList<Prestamo> prestamos = new ArrayList<>();

            String linea = "";

            while(linea != null){
                linea = br.readLine();

                if (linea != null){
                    String[] dividido = linea.split(";");

                    prestamos.add(new Prestamo(dividido[0], dividido[1], dividido[2]));
                }
            }

            ArrayList<String> avisos = Prestamo.personasConAviso(prestamos);

            for(String p : avisos){
                bw.write(p + "\n");
            }

            br.close();
            bw.close();

        }catch(IOException e){
            System.err.println("No se ha podido leer/escribir el/los fichero/s");
        }
    }
}
