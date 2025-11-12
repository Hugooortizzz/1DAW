package Tema7;

import java.util.Scanner;

public class pedirnotas {
    public static void main(String[] args) {
        int[] notas = new int[4];
        double media = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i<notas.length; i++){
            System.out.print("Introduzca la nota " + (i+1) + ": ");
            notas[i] = s.nextInt();

            media += notas[i];
        }

        media = media / notas.length;

        System.out.println(media);

        s.close();
    }
    
}
