import java.util.Scanner;
import java.util.Arrays; //He importado la clase Arrays para poder comprobar que la palabra tenga un valor que se encuentre en el array colores

public class Ejercicio14 {
    public static void main(String[] args) {
        String[] palabra = new String[8];
        String[] palabra_final = new String[8];
        String[] colores = new String[9];
        int contador = 0;

        colores[0] = "verde";
        colores[1] = "rojo";
        colores[2] = "azul";
        colores[3] = "amarillo";
        colores[4] = "naranja";
        colores[5] = "rosa";
        colores[6] = "negro";
        colores[7] = "blanco";
        colores[8] = "morado";

        Scanner s = new Scanner(System.in);

        for (int i=0; i<palabra.length; i++){
            
            System.out.print("Introduzca la palabra " + i + ": ");
            palabra[i] = s.next();
        }

        for (int j=0; j<palabra.length; j++){
            System.out.println( j + "\t" + palabra[j]);
        }

        System.out.println();

        for (int k=0; k<palabra.length; k++){
            if (Arrays.asList(colores).contains(palabra[k])){
                palabra_final[contador] = palabra[k];
                contador++;
            }
        }

        for (int p=0; p<palabra.length; p++){
            if (Arrays.asList(colores).contains(palabra[p])){
            
            }else{
                palabra_final[contador] = palabra[p];
                contador ++;
            }
        }

        for (int j=0; j<palabra.length; j++){
            System.out.println( j + "\t" + palabra_final[j]);
        }
    }
}
