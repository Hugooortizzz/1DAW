import java.util.Scanner;
import java.util.Random;

public class Proyecto {
    public static void main(String[] args) {
        int VACIO = 0;
        int MOVIMIENTO = 1;
        int ALFIL = 2;
        int TORRE = 3;
        int REY = 4;
        int CORRECTO = 5;
        int INCORRECTO = 6;
        int[][] tablero = new int[8][8];
        int pieza;
        int filapieza;
        int colpieza;
        String movimiento;
        int movimientoFila;
        int movimientoCol;
        int vidas = 3;
        int jugada = 1;
        boolean jugar = true;

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println("Debes adivinar 10 movimientos de ajedrez de piezas aleatorias. Tienes 3 vidas");

        while (jugar){
            pieza = r.nextInt(3) + 2;
            filapieza = r.nextInt(8);
            colpieza = r.nextInt(8);

            for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            tablero[i][j] = VACIO;
                            
                        }
                    }

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

            System.out.println("Jugada " + jugada);
            System.out.println("Vidas restantes: " + vidas);

            System.out.println("\ta\tb\tc\td\te\tf\tg\th");
            for (int i=0; i<tablero.length; i++){
                System.out.print((8-i)+"\t");
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

            movimientoFila = 7 - (movimiento.charAt(1) - 49);
            movimientoCol= movimiento.charAt(0) - 97;

            if (tablero[movimientoFila][movimientoCol] == MOVIMIENTO){
                tablero[movimientoFila][movimientoCol] = CORRECTO;
            }else{
                tablero[movimientoFila][movimientoCol] = INCORRECTO;
            }


            System.out.println("\ta\tb\tc\td\te\tf\tg\th");
            for (int i=0; i<tablero.length; i++){
                System.out.print((8 - i)+"\t");
                        for (int j=0; j<tablero[i].length; j++){
                            if (tablero[i][j] == MOVIMIENTO){
                                System.out.print("*\t");
                            }else if (tablero[i][j] == ALFIL){
                                System.out.print("A\t");
                            }else if (tablero[i][j] == TORRE){
                                System.out.print("T\t");
                            }else if (tablero[i][j] == REY){
                                System.out.print("R\t");
                            }else if (tablero[i][j] == CORRECTO){
                                System.out.print("O\t");
                            }else if (tablero[i][j] == INCORRECTO){
                                System.out.print("X\t");
                            }else{
                                System.out.print(" \t");
                            }
                        }
                System.out.println();
            }

            if (tablero[movimientoFila][movimientoCol] == CORRECTO){
                System.out.println("Has acertado, ese es un movimiento válido");
            }else{
                System.out.println("Has fallado, ese no es un movimiento válido para esta pieza");
                vidas --;
            }

            if (vidas < 1 || jugada == 10){
                jugar = false;
            }

            jugada ++;

            System.out.print("================================================================================");
        }

        if (vidas > 0){
            System.out.println("Has ganado");
        }else{
            System.out.println("Has perdido");
        }



    }
}
