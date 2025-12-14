import java.util.Scanner;
import java.util.Random;

public class EjercicioExtra1 {
    public static void main(String[] args) {
        int[][] ventas = new int[4][6];
        int[] totalseccion = new int[4];
        int [] totalmes = new int[6];

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < ventas.length; i++){
            System.out.println("Sección " + (i+1));
            for (int j = 0; j < ventas[i].length; j++){
                //System.out.print("Mes " + (j+1) + ": ");
                //ventas[i][j] = s.nextInt();
                ventas[i][j] = r.nextInt(1000, 9999);
            }
        }


        System.out.println("\t\tMes 1\tMes2\tMes3\tMes4\tMes5\tMes6");
        for (int i = 0; i < ventas.length; i++){
            System.out.print("Sección " + (i+1) + "\t");
            for (int j = 0; j < ventas[i].length; j++){
                System.out.print(ventas[i][j] + "\t");
                totalseccion[i] += ventas[i][j];
                totalmes[j] += ventas[i][j];
            }
            System.out.print(totalseccion[i]);
            System.out.println();
        }

        System.out.print("\t\t");
        for (int i = 0; i < totalmes.length; i++){
            System.out.print(totalmes[i] + "\t");
        }



    }
}
