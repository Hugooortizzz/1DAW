package Tema7;

public class prueba {
    public static void main(String[] args) {
        int [4] notas = {3, 7, 4, 8};
        double nota_media = 0;
        
        for (int i=0; i<notas.length; i++){
            nota_media += notas[i];
        }

        nota_media = nota_media / notas.length;

        System.out.println(nota_media);
    }
}
