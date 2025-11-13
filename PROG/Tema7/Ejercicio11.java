import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int contador;

        contador = 0;

        Scanner s = new Scanner(System.in);

        for (int i=0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();
        }

        for (int j=0; j<numero.length; j++){
            System.out.print(j + "\t");
        }

        System.out.print("\n");

        for (int k=0; k<numero.length; k++){
            System.out.print(numero[k] + "\t");
        }

        for (int p=0; p<numero.length; p++){
            System.out.print(numero[k] + "\t");
        }

        
    }
}
