//Escribe un programa capaz de quitar los comentarios de un programa de Java.
//Se utilizaría de la siguiente manera:
//quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
//Por ejemplo:
//quita_comentarios hola.java holav2.java
//crea un fichero con nombre holav2.java que contiene el código de hola.java pero
//sin los comentarios.

package Ejercicio5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String linea = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            while(linea != null){
                linea = bf.readLine();

                if (linea != null){
                    if(!linea.contains("//") && !linea.contains("/*") && !linea.contains("*/")){
                        bw.write(linea + "\n");
                    }
                }

            }

            bf.close();
            bw.close();
        }catch(IOException e){
            System.err.print("No se ha podido leer el fichero");
        }
    }
}
