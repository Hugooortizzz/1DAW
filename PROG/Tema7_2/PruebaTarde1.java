import java.util.Scanner;

public class PruebaTarde1 {
    public static void main(String[] args) {
        int[][] sala = new int[10][12];
        int LIBRE = 0;
        int OCUPADO = 1;
        int n_entradas;
        int contador_vacios = 0;
        int contador_asientos = 0;
        boolean asignado = false;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = LIBRE;
            }
        }

        for (int i = 0; i < sala.length; i++) {
            System.out.print("Fila " + (10 - i) + "\t");
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == OCUPADO) {
                    System.out.print("O\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }

        while (contador_asientos < 120) {
            do {
                System.out.print("Cuantas entradas quiere comprar (1-5): ");
                n_entradas = s.nextInt();
            } while (n_entradas < 1 || n_entradas > 5);


            if (contador_asientos + n_entradas <= 120){
                contador_asientos += n_entradas;
            }else{
                System.out.print("No hay suficientes asientos contiguos libres para este grupo.");
            }
            



            contador_vacios = 0;
            asignado = false;
            System.out.print("Se han asignado los asientos ");
            for (int i = 0; i < sala.length && asignado == false; i++) {
                for (int j = 0; j < sala[i].length && asignado == false; j++) {
                    if ((sala[i].length - j >= n_entradas) && (sala[i][j] == LIBRE)) {
                        for (int k = 0; k < n_entradas; k++) {
                            if (sala[i][j + k] == LIBRE) {
                                contador_vacios++;
                            }
                        }
                        if (contador_vacios == n_entradas) {
                            for (int k = 0; k < n_entradas; k++) {
                                sala[i][j + k] = OCUPADO;
                                System.out.print((k + j + 1) + " ");
                            }
                            System.out.println("de la fila " + (10 - i));
                            asignado = true;
                        }
                    }

                }
            }

            for (int i = 0; i < sala.length; i++) {
                System.out.print("Fila " + (10 - i) + "\t");
                for (int j = 0; j < sala[i].length; j++) {
                    if (sala[i][j] == OCUPADO) {
                        System.out.print("O\t");
                    } else {
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
        }

    }
}
