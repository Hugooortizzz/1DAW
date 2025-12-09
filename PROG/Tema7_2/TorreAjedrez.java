import java.util.Scanner;

public class TorreAjedrez {
    public static void main(String[] args) {
        int [][] cuadrante = new int[8][8];
        int VACIO = 0;
        int TORRE = 1;
        int MOVIMIENTO = 2;
        char columna;
        int fila;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la columna de la torre (a-h): ");
        columna = s.next().charAt(0);

        System.out.print("Introduzca la fila de la torre (1-8)");
        fila = s.nextInt();


        for (int i=0; i<cuadrante.length; i++){
            for (int j=0; j<cuadrante[i].length; j++){
                if (i == 8-fila || j == (int) columna - 97 ){
                    cuadrante[i][j] = MOVIMIENTO;
                }else{
                    cuadrante[i][j] = VACIO;
                }
            }
        }

        cuadrante[8-fila][(int) columna - 97] = TORRE;

        for (int i=0; i<cuadrante.length; i++){
            System.out.print(8-i + "\t");
            for (int j=0; j<cuadrante[i].length; j++){
                if (cuadrante[i][j] == VACIO){
                    System.out.print(".\t");
                }else if (cuadrante[i][j] == MOVIMIENTO){
                    System.out.print("*\t");
                }else{
                    System.out.print("T\t");
                }
            }
            System.out.println();
        }

        System.out.print("\ta\tb\tc\td\te\tf\tg\th");

        

        
        s.close();
    }
}
