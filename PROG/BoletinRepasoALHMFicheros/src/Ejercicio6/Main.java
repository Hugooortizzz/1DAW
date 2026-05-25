package Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
            Catalogo catalogo = new Catalogo();

            catalogo.guardarCatalogo();
            catalogo.cerrar();
        } catch (IOException e) {
            System.err.println("No se ha podido leer/escribir el/los fichero/s");
        }

    }
}
