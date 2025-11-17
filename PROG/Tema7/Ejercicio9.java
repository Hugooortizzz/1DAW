import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numero = new int[8];
        String[] par_impar = new String[8];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i<numero.length; i++){
            System.out.println("Introduzca el número " + (i+1));
            numero[i] = s.nextInt();

            if (numero[i] % 2 == 0){
                par_impar[i] = "Par";
            }else{
                par_impar[i] = "Impar";
            }
        }

        for (int j = 0; j<numero.length; j++){
            System.out.println("Número " + (j+1) + ": " + numero[j] + " " + par_impar[j]); 
        }

        s.close();
    }
}
