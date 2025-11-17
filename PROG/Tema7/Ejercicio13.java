import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numero = new int[100];
        int destacar = 0;
        int maximo = 0;
        int minimo = 500;
        int p_maximo = 0;
        int p_minimo = 0;

        

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        for (int i=0; i<numero.length; i++){
            numero[i] = r.nextInt(501);

            if (numero[i] > maximo){
                maximo = numero[i];
                p_maximo = i;
            }

            if (numero[i] < minimo){
                minimo = numero[i];
                p_minimo = i;
            }
        }

        for (int j=0; j<numero.length; j++){
            System.out.print(numero[j] + " ");
        }

        System.out.println();

        while (destacar < 1 || destacar > 2){
            System.out.print("¿Qué quiere destacar? (1-mínimo, 2-máximo): ");
            destacar = s.nextInt();

            if (destacar < 1 || destacar > 2){
                System.out.println("Introduzca una opción válida");
            }
        }

        if (destacar == 1){
            for (int k=0; k<numero.length; k++){
                if (k == p_minimo){
                    System.out.print("**" + numero[k] + "** ");
                }else{
                    System.out.print(numero[k] + " ");
                }
            }
        }else{
            for (int k=0; k<numero.length; k++){
                if (k == p_maximo){
                    System.out.print("**" + numero[k] + "** ");
                }else{
                    System.out.print(numero[k] + " ");
                }
            }
        }
        
        s.close();
    }
}
