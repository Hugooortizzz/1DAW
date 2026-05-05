//Escribe un programa que guarde en un fichero con nombre primos.dat los
//números primos que hay entre 1 y 500.

package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int contador;
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            bw.write(1 + "\n");
            for (int i = 2; i <= 500; i++) {
                contador = 0;
                for (int j = 2; j <= i; j++) {
                    if(i%j == 0){
                        contador ++;
                    }
                }
                bw.write(i + "\n");
            }
        }catch (IOException ioe){
            System.out.println("No se ha podido escribir en el fichero");
        }

    }
}
