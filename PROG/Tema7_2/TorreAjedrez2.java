import java.util.Scanner;

public class TorreAjedrez2 {
    public static void main(String[] args) {
      int [][] cuadrante = new int[8][8];
        int VACIO = 0;
        int TORRE = 1;
        int MOVIMIENTO = 2;
        int OBSTACULO = 3;
        char columna;
        int fila;
        int n_obstaculos;
        char obstaculocol;
        int obstaculofil;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la columna de la torre (a-h): ");
        columna = s.next().charAt(0);

        System.out.print("Introduzca la fila de la torre (1-8)");
        fila = s.nextInt();

        System.out.print("¿Cuántos obstáculos quiere colocar?: ");
        n_obstaculos = s.nextInt();

        

        cuadrante[8-fila][(int) columna - 97] = TORRE;


        for (int i=0; i<cuadrante.length; i++){
            for (int j=0; j<cuadrante[i].length; j++){
                if (i == 8-fila || j == (int) columna - 97 ){
                    cuadrante[i][j] = MOVIMIENTO;
                }
                else{
                    cuadrante[i][j] = VACIO;
                }
            }
        }

        for (int i=0; i<n_obstaculos; i++){
            System.out.print("Introduzca la columna del obstáculo " + (i + 1) + " (a-h):");
            obstaculocol = s.next().charAt(0);
            System.out.print("Introduzca la fila del obstáculo " + (i + 1) + " (1-8):");
            obstaculofil = s.nextInt();

            cuadrante[8-obstaculofil][(int) obstaculocol - 97] = OBSTACULO;
        }

        for (int i=0; i<cuadrante.length; i++){
            for (int j=0; j<cuadrante[i].length; j++){
                if (cuadrante[i][j] == OBSTACULO){
                    if (i > 8-fila){
                        for (int k = i+1; k<cuadrante[i].length; k++){
                            cuadrante[k][(int) columna - 97] = VACIO;
                        }
                    } else if (i < 8-fila){
                        for (int k = i-1; k>=0; k--){
                            cuadrante[k][(int) columna - 97] = VACIO;
                        }
                    } else if (j < (int) columna - 97){
                        for (int k = j-1; k>=0; k--){
                            cuadrante[8-fila][k] = VACIO;
                        }
                    } else if (j > (int) columna - 97){
                        for (int k = j+1; k<cuadrante[j].length; k++){
                            cuadrante[8-fila][k] = VACIO;
                        }
                    }
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
                }else if (cuadrante[i][j] == OBSTACULO){
                    System.out.print("O\t");
                }
                else{
                    System.out.print("T\t");
                }
            }
            System.out.println();
        }


        System.out.print("\ta\tb\tc\td\te\tf\tg\th");

        

        
        s.close();  
    }
}
