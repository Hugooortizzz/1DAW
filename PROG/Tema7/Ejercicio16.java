import java.util.Scanner;
import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int opcion = 0;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int i=0; i<numero.length; i++){
            numero[i] = r.nextInt(401);
        }

        for (int j=0; j<numero.length; j++){
            System.out.print(numero[j] + " ");
        }

        System.out.println();

        
        
        while (opcion<1 || opcion>2){
            System.out.print("¿Qué números quiere resaltar? (1- los múltiplos de 5, 2- los múltiplos de 7): ");
            opcion = s.nextInt();

            if (opcion<1 || opcion>2){
                System.out.print("Introduzca una opción válida");
            }
        }

        if (opcion == 1){
            for (int k = 0; k<numero.length; k++){
                if (numero[k] % 5 == 0){
                    System.out.print("["+ numero[k] + "] ");
                }else{
                    System.out.print(numero[k] + " ");
                }
            }
        }else{
            for (int k = 0; k<numero.length; k++){
                if (numero[k] % 7 == 0){
                    System.out.print("["+ numero[k] + "] ");
                }else{
                    System.out.print(numero[k] + " ");
                }
            }
        }
        
        s.close();
    }
}
