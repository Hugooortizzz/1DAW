/* Realiza el juego de las tres en raya. */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int VACIO = 0;
        int CIRCULO = 1;
        int X = 2;
        int[][] cuadrante = new int[3][3];
        int movimiento;
        int movimientoI;
        int movimientoJ;
        boolean juego = true;

        Scanner s = new Scanner(System.in);

        

        for (int i=0; i<cuadrante.length; i++){
            for (int j = 0; j<cuadrante[i].length; j++){
                cuadrante[i][j] = VACIO;
            }
        }

        while (juego){
            System.out.println("TRES EN RAYA");

            System.out.println("\t1\t2\t3");
            for (int i=0; i<cuadrante.length; i++){
                System.out.print((i+1)+ "\t");
                for (int j = 0; j<cuadrante[i].length; j++){
                   switch (cuadrante[i][j]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2: 
                            System.out.print("X");
                            break;
                   }
                   System.out.print("\t");
            }

            System.out.println();
        }

            System.out.print("Movimiento del jugador 1 (O): (Ej 31 (fila 3 columna 1)): ");
            movimiento = s.nextInt();
            movimientoI = (movimiento / 10) -1;
            movimientoJ = (movimiento % 10) -1;

            cuadrante[movimientoI][movimientoJ] = CIRCULO;

            System.out.println("\t1\t2\t3");
            for (int i=0; i<cuadrante.length; i++){
                System.out.print((i+1)+ "\t");
                for (int j = 0; j<cuadrante[i].length; j++){
                   switch (cuadrante[i][j]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2: 
                            System.out.print("X");
                            break;
                   }
                   System.out.print("\t");
            }
            
            System.out.println();

        }
        

        System.out.print("Movimiento del jugador 2 (X): (Ej 31 (fila 3 columna 1)): ");
            movimiento = s.nextInt();
            movimientoI = (movimiento / 10) -1;
            movimientoJ = (movimiento % 10) -1;

            cuadrante[movimientoI][movimientoJ] = X;

            System.out.println("\t1\t2\t3");
            for (int i=0; i<cuadrante.length; i++){
                System.out.print((i+1)+ "\t");
                for (int j = 0; j<cuadrante[i].length; j++){
                   switch (cuadrante[i][j]){
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("O");
                            break;
                        case 2: 
                            System.out.print("X");
                            break;
                   }
                   System.out.print("\t");
            }
            System.out.println();
        }
        }
    }
}
