import java.util.Random;

public class metodo_burbuja {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int aux;

        Random r = new Random();

        for (int i = 0; i<numero.length-1; i++){
            numero[i] = r.nextInt(1001);
            System.out.print(numero[i] + " ");
        }
        System.out.println();


        for (int i = 0; i<numero.length-1; i++){
            for (int j=0; j<numero.length - i - 1; j++){
                if (numero[j + 1] > numero[j]){
                    aux = numero[j+1];
                    numero[j+1] = numero[j];
                    numero[j] = aux;
                }
            }
        }

        for (int i = 0; i<numero.length-1; i++){
            System.out.print(numero[i] + " ");
        }
        System.out.println("\n");
    }
}
