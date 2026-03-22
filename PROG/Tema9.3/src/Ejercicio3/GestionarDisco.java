package Ejercicio3;

import java.util.Scanner;

public class GestionarDisco {
    public Disco añadir() {
        Disco disco = new Disco();

        Scanner s = new Scanner(System.in);

        System.out.print("Nombre: ");
        disco.setTitulo(s.next());
        System.out.print("Autor: ");
        disco.setAutor(s.next());
        System.out.print("Código");
        disco.setCodigo(s.next());
        System.out.println();

        return disco;
    }
}
