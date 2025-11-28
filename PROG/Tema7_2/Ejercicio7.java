/**
 * Minijuego "Busca el tesoro"
 *
 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
 * está el tesoro.
 *
 * @author Luis José Sánchez
 */
public class Ejercicio7 {
    // se definen constantes para representar el
    // contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;
    static final int CERCAMINA = 4;
    static final int INTENTOMINA = 5;

    public static void main(String[] args) {
        int x;
        int y;
        int[][] cuadrante = new int[5][4];
        // inicializa el array
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
        // coloca la mina
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        cuadrante[minaX][minaY] = MINA;

        for (x = 0; x < cuadrante.length; x++) {
            for (y = 0; y < cuadrante[x].length; y++) {
                if ((x >= (minaX-1) && x <= (minaX+1)) && (y >= (minaY-1) && y <= (minaY+1))){
                    if (cuadrante[x][y] != MINA){
                        cuadrante[x][y] = CERCAMINA;
                    }
                    
                }
            }
        }   
        

        // coloca el tesoro
        int tesoroX;

        int tesoroY;
        do{
            do {
                tesoroX = (int) (Math.random() * 4);
                tesoroY = (int) (Math.random() * 3);
            } while ((minaX == tesoroX) && (minaY == tesoroY));
        }while (cuadrante[tesoroX][tesoroY] == CERCAMINA);
        cuadrante[tesoroX][tesoroY] = TESORO;
        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
            // pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO)
                        System.out.print("X");
                    else if (cuadrante[x][y] == INTENTOMINA){
                        System.out.print("O");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");
            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(System.console().readLine());
            
            // mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    break;
                case CERCAMINA:
                    cuadrante[x][y] = INTENTOMINA;
                    System.out.println("Cuidado, estás cerca de una mina");
                    break;
                default:
            }

        } while (!salir);
        // pinta el cuadrante
        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        c = "*";
                        break;
                    case TESORO:
                        c = "€";
                        break;
                    case INTENTO:
                        c = "x";
                        break;
                    case CERCAMINA:
                        c = "o";
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");
    }
}