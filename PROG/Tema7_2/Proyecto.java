import java.util.Scanner;
import java.util.Random;

public class Proyecto {
    public static void main(String[] args) {
        int VACIO = 0;
        int MOVIMIENTO = 1;
        int ALFIL = 2;
        int TORRE = 3;
        int REY = 4;
        int[][] tablero = new int[8][8];
        int pieza;
        int filapieza;
        int colpieza;
        String movimiento;

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        pieza = r.nextInt(3) + 2;
        filapieza = r.nextInt(8);
        colpieza = r.nextInt(8);

        switch (pieza){
            case 2:
                for (int i=0; i<tablero.length; i++){
                    for (int j=0; j<tablero[i].length; j++){
                        if (Math.abs(i-filapieza) == Math.abs(j-colpieza)){
                            tablero[i][j] = MOVIMIENTO;
                        }
                    }
                }
                tablero[filapieza][colpieza] = pieza;
                break;

            case 3:
                for (int i=0; i<tablero.length; i++){
                    for (int j=0; j<tablero[i].length; j++){
                        if (i == filapieza || j == colpieza) {
                            tablero[i][j] = MOVIMIENTO;
                        }
                    }
                }
                tablero[filapieza][colpieza] = pieza;
                break;

            case 4:
                for (int i=0; i<tablero.length; i++){
                    for (int j=0; j<tablero[i].length; j++){
                        if (Math.abs(i-filapieza) <= 1 && Math.abs(j-colpieza) <= 1){
                            tablero[i][j] = MOVIMIENTO;
                        }
                    }
                }
                tablero[filapieza][colpieza] = pieza;
                break;
        }

        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        for (int i=0; i<tablero.length; i++){
            System.out.print(i+"\t");
                    for (int j=0; j<tablero[i].length; j++){
                        if (tablero[i][j] == ALFIL){
                            System.out.print("A\t");
                        }else if (tablero[i][j] == TORRE){
                            System.out.print("T\t");
                        }else if (tablero[i][j] == REY){
                            System.out.print("R\t");
                        }else{
                            System.out.print(" \t");
                        }
                    }
            System.out.println();
        }

        System.out.print("Introduce un posible movimiento (Ej: d5): ");
        movimiento = s.next();



        /* System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        for (int i=0; i<tablero.length; i++){
            System.out.print(i+"\t");
                    for (int j=0; j<tablero[i].length; j++){
                        if (tablero[i][j] == MOVIMIENTO){
                            System.out.print("*\t");
                        }else if (tablero[i][j] == ALFIL){
                            System.out.print("A\t");
                        }else if (tablero[i][j] == TORRE){
                            System.out.print("T\t");
                        }else if (tablero[i][j] == REY){
                            System.out.print("R\t");
                        }else{
                            System.out.print(" \t");
                        }
                    }
            System.out.println();
        } */



    }
}
