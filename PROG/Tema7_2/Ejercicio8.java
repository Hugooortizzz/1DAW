import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] tablero = new int[8][8];
        String posicion_alfil;
        //int siguiente_movimientoI;
        //int siguiente_movimientoJ;
        final int VACIO = 0;
        final int ALFIL = 1;
        final int MOVIMIENTO = 2;

        Scanner s = new Scanner(System.in);

        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                tablero[i][j] = VACIO;
            }
        }

        System.out.print("Introduzca la posición del alfil: ");
        posicion_alfil = s.next();

        int alfilI = 8 - (posicion_alfil.charAt(1) - 48);
        int alfilJ = posicion_alfil.charAt(0) - 97;

        tablero[alfilI][alfilJ] = ALFIL;
        
        //siguiente_movimientoI = alfilI;
        //siguiente_movimientoJ = alfilJ;

        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                if (Math.abs(i-alfilI) == Math.abs(j-alfilJ)){
                    tablero[i][j] = MOVIMIENTO;
                }
            }
        }

        tablero[alfilI][alfilJ] = ALFIL;


        //Esta fue mi forma anterior de hacerlo
        /* while((siguiente_movimientoI <= 6) && (siguiente_movimientoJ <= 6)){
            tablero[siguiente_movimientoI+1][siguiente_movimientoJ+1] = MOVIMIENTO;
            siguiente_movimientoJ = siguiente_movimientoJ +1;
            siguiente_movimientoI = siguiente_movimientoI +1;
        }

        siguiente_movimientoI = alfilI;
        siguiente_movimientoJ = alfilJ;

        while((siguiente_movimientoI >= 1) && (siguiente_movimientoJ <= 6)){
            tablero[siguiente_movimientoI-1][siguiente_movimientoJ+1] = MOVIMIENTO;
            siguiente_movimientoJ = siguiente_movimientoJ +1;
            siguiente_movimientoI = siguiente_movimientoI -1;
        }
        siguiente_movimientoI = alfilI;
        siguiente_movimientoJ = alfilJ;

        while((siguiente_movimientoI <= 6) && (siguiente_movimientoJ >= 1)){
            tablero[siguiente_movimientoI+1][siguiente_movimientoJ-1] = MOVIMIENTO;
            siguiente_movimientoJ = siguiente_movimientoJ -1;
            siguiente_movimientoI = siguiente_movimientoI +1;
        }

        siguiente_movimientoI = alfilI;
        siguiente_movimientoJ = alfilJ;

        while((siguiente_movimientoI >= 1) && (siguiente_movimientoJ >= 1)){
            tablero[siguiente_movimientoI-1][siguiente_movimientoJ-1] = MOVIMIENTO;
            siguiente_movimientoJ = siguiente_movimientoJ -1;
            siguiente_movimientoI = siguiente_movimientoI -1;
        } */


        System.out.print(" ");
        for (int j=97; j<=104; j++){
            System.out.print((char)(j) + " ");
        }
        System.out.println();
        
        for (int i=0; i<tablero.length; i++){
            System.out.print(8-i);
            for (int j=0; j<tablero[i].length; j++){
                if (tablero[i][j] == ALFIL){
                    System.out.print("A ");
                }else if (tablero[i][j] == MOVIMIENTO){
                    System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("El alfil puede moverse a las siguientes posiciones");
        for (int i=0; i<tablero.length; i++){
            for (int j=0; j<tablero[i].length; j++){
                if (tablero[i][j] == MOVIMIENTO){
                    System.out.print((char) (97+j));
                    System.out.print(8-i);
                    System.out.print(", ");
                }
            }
        }
    }
    
}
