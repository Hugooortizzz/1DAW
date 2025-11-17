import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        int[] suma_c = new int[5];
        int[] suma_f = new int[4];
        int total = 0;

        Random r = new Random();

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                numeros[i][j] = r.nextInt(899)+100;
                suma_f[i] += numeros[i][j];
                suma_c[j] += numeros[i][j];
                total += numeros[i][j];
            }
        }

        System.out.print("\t\t");
        for (int i=0; i<numeros[0].length; i++){
            System.out.print("Columna " + i + "\t");
        }
        System.out.println("Suma filas");

        
        for (int i=0; i<numeros.length; i++){
            System.out.print("Fila " + i + "\t\t");
            for (int j=0; j<=numeros[i].length; j++){
                if (j == numeros[i].length){
                    System.out.print(suma_f[i]);
                }else{
                    System.out.print(numeros[i][j] + "\t\t");
                }
                
            }
            System.out.println();
        }

        System.out.print("Suma Columnas\t");
        for (int i=0; i<numeros[0].length; i++){
            System.out.print(suma_c[i] + "\t\t");
        }

        System.out.println(total + " <-- TOTAL");

    }
}

