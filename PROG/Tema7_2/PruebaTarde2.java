import java.util.Scanner;

public class PruebaTarde2 {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];
        char pieza;
        int colpieza;
        int filapieza;
        int piezas_propias;
        int colpieza_propia;
        int filapieza_propia;
        int piezas_enemigas;
        int colpieza_enemiga;
        int filapieza_enemiga;

        Scanner s = new Scanner(System.in);

        System.out.print("Elige una pieza (T para torre y A para alfil): ");
        pieza = s.next().charAt(0);

        System.out.print("Introduce la colpieza de la pieza: ");
        colpieza = s.next().charAt(0) - 97;

        System.out.print("Introduce la fila de la pieza: ");
        filapieza = 8 - s.nextInt();

        tablero[filapieza][colpieza] = pieza;

        System.out.print("Introduce el número de piezas propias: ");
        piezas_propias = s.nextInt();

        for (int i = 0; i < piezas_propias; i++) {
            System.out.print("Introduce la colpieza de la pieza propia " + (i + 1) + ": ");
            colpieza_propia = s.next().charAt(0) - 97;

            System.out.print("Introduce la fila de la pieza propia " + (i + 1) + ": ");
            filapieza_propia = 8 - s.nextInt();

            tablero[filapieza_propia][colpieza_propia] = 'P';
        }

        System.out.print("Introduce el número de piezas enemigas: ");
        piezas_enemigas = s.nextInt();

        for (int i = 0; i < piezas_enemigas; i++) {
            System.out.print("Introduce la colpieza de la pieza enemiga " + (i + 1) + ": ");
            colpieza_enemiga = s.next().charAt(0) - 97;

            System.out.print("Introduce la fila de la pieza enemiga " + (i + 1) + ": ");
            filapieza_enemiga = 8 - s.nextInt();

            tablero[filapieza_enemiga][colpieza_enemiga] = 'E';
        }

        switch (pieza) {
            case 'T':
            case 't':
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        if (i == filapieza || j == colpieza) {
                            if (tablero[i][j] != 'P' && tablero[i][j] != 'E') {
                                tablero[i][j] = '*';
                            }
                        }
                    }
                }

                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j] == 'P') {
                                if (i > filapieza) {
                                    for (int k = i + 1; k < tablero[i].length; k++) {
                                        if (tablero[k][colpieza] != 'P') {
                                            tablero[k][colpieza] = ' ';
                                        }
                                    }
                                } else if (i < filapieza) {
                                    for (int k = i - 1; k >= 0; k--) {
                                        if (tablero[k][colpieza] != 'P') {
                                            tablero[k][colpieza] = ' ';
                                        }
                                    }
                                } else if (j < colpieza) {
                                    for (int k = j - 1; k >= 0; k--) {
                                        if (tablero[filapieza][k] != 'P') {
                                            tablero[filapieza][k] = ' ';
                                        }

                                    }
                                } else if (j > colpieza) {
                                    for (int k = j + 1; k < tablero[j].length; k++) {
                                        if (tablero[filapieza][k] != 'P') {
                                            tablero[filapieza][k] = ' ';
                                        }
                                    }
                                }
                            }

                            if (tablero[i][j] == 'E') {
                                if (i > filapieza) {
                                    for (int k = i + 1; k < tablero[i].length; k++) {
                                        if (tablero[k][colpieza] != 'E') {
                                            tablero[k][colpieza] = ' ';
                                        }
                                    }
                                    
                                } else if (i < filapieza) {
                                    for (int k = i - 1; k >= 0; k--) {
                                        if (tablero[k][colpieza] != 'E') {
                                            tablero[k][colpieza] = ' ';
                                        }
                                    }
                                } else if (j < colpieza) {
                                    for (int k = j - 1; k >= 0; k--) {
                                        if (tablero[filapieza][k] != 'E') {
                                            tablero[filapieza][k] = ' ';
                                        }

                                    }
                                } else if (j > colpieza) {
                                    for (int k = j + 1; k < tablero[j].length; k++) {
                                        if (tablero[filapieza][k] != 'E') {
                                            tablero[filapieza][k] = ' ';
                                        }
                                    }
                                }

                                tablero[i][j] = '*';
                            }
                            
                        }
                    }

                    
                

                tablero[filapieza][colpieza] = pieza;
                break;

                case 'A':
                case 'a':

                    for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            if (Math.abs(i-filapieza) <= 1 && Math.abs(j-colpieza) <= 1){
                                tablero[i][j] = '*';
                            }
                        }
                    }

                    for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            if (Math.abs(i-filapieza) == Math.abs(j-colpieza)){
                                if (tablero[i][j] != 'P' && tablero[i][j] != 'E'){
                                    tablero[i][j] = '*';
                                }
                            }
                        
                        }
                    }

                    for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            if (tablero[i][j] == 'P') {
                                if (i > filapieza && j > colpieza) {
                                    for (int k = 1; k < tablero[i].length; k++) {
                                        if (tablero[i+k][j+k] != 'P') {
                                            tablero[i+k][j+k] = ' ';
                                        }
                                    }
                                } else if (i < filapieza && j < colpieza) {
                                    for (int k = 1; k >= 0; k--) {
                                        if (tablero[k][colpieza] != 'P') {
                                            tablero[k][colpieza] = ' ';
                                        }
                                    }
                                } else if (j < colpieza) {
                                    for (int k = j - 1; k >= 0; k--) {
                                        if (tablero[filapieza][k] != 'P') {
                                            tablero[filapieza][k] = ' ';
                                        }

                                    }
                                } else if (j > colpieza) {
                                    for (int k = j + 1; k < tablero[j].length; k++) {
                                        if (tablero[filapieza][k] != 'P') {
                                            tablero[filapieza][k] = ' ';
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                    
        }
        

        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((8 - i) + "\t");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
