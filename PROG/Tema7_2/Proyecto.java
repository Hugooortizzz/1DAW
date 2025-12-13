import java.util.Scanner;
import java.util.Random;

public class Proyecto {
    public static void main(String[] args) {
        //Inicialización de todas las variables necesarias
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

        //El bucle jugar tendrá la función de repetir el juego hasta que, o el jugador se quede sin vidas, o gane las 10 rondas.
        while (jugar){
            //
            pieza = r.nextInt(3) + 2;
            filapieza = r.nextInt(8);
            colpieza = r.nextInt(8);

            //Este bucle asigna un valor inicial vacío a todos los cuadrantes del tablero
            for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            tablero[i][j] = VACIO;
                        }
                    }

            //Según la pieza que ha salido, se asignarán sus movimientos posibles teniendo en cuenta su posición
            switch (pieza){
                //Si pieza aleatoriamente saca 2, la pieza será un alfil.
                case 2:
                    for (int i=0; i<tablero.length; i++){
                        for (int j=0; j<tablero[i].length; j++){
                            if (Math.abs(i-filapieza) == Math.abs(j-colpieza)){
                                tablero[i][j] = MOVIMIENTO;
                            }
                        }
                    }
                    //Se asginará el valor pieza a su posición una vez asignados ya los movimientos y no antes, para que movimiento no sobreescriba a pieza
                    tablero[filapieza][colpieza] = pieza;
                    break;

                //Si pieza aleatoriamente saca 3, la pieza será una torre.
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

                //Si pieza aleatoriamente saca 4, la pieza será un rey.
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
            //Este bucle pintará un tablero solo con la pieza que toque
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

            //En esta parte, el usuario introducira un movimiento en una variable tipo String
            System.out.print("Introduce un posible movimiento (Ej: d5): ");
            movimiento = s.next();

            System.out.println("---------------------------------------------------------------------------------");

            //Sacaremos la fila cogiendo el segundo caracter del string, convirtiendolo a un entero y restandole 49, puesto que en el codigo ascii el
            //caracter 1 es igual a 49, por lo que si el usuario introduce la fila 1, le restara 49 y será la fila 0. Luego, se le resta
            //7 porque el tablero de ajedrez aparece al revés, por lo que la fila 0 el usuario la ve como fila 8.
            movimientoFila = 7 - (movimiento.charAt(1) - 49);

            //La columna la sacaremos igual, pero restandole 97 puesto que la a es el caracter 97 en el código ascii.
            movimientoCol= movimiento.charAt(0) - 97;

            //Si la posición que ha introducido el usuario contiene el valor movimiento, significará que es un movimiento válido por lo que ahora se
            //sobreescribirá como correcto, si no como incorrecto.
            if (tablero[movimientoFila][movimientoCol] == MOVIMIENTO){
                tablero[movimientoFila][movimientoCol] = CORRECTO;
            }else{
                tablero[movimientoFila][movimientoCol] = INCORRECTO;
            }


            //Ahora, el tablero se pintará mostrando todos los elementos
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

            //De nuevo, si la posicion que ha introducido el usuario es un movimiento válido, mostrará un mensaje de que el usuario ha acertado.
            if (tablero[movimientoFila][movimientoCol] == CORRECTO){
                System.out.println("Has acertado, ese es un movimiento válido");
            }else{ //En caso contrario, mostrará que el usuario ha fallado y restará una vida.
                System.out.println("Has fallado, ese no es un movimiento válido para esta pieza");
                vidas --;
            }

            //Este bucle controlará cuando se acaba el bucle;
            if (vidas < 1 || jugada == 10){
                jugar = false;
            }

            //Al final del bucle, se suma 1 al contador de jugada.
            jugada ++;

            System.out.println("================================================================================");
        }


        //Esta condición mostrará al usuario si ha ganado o si ha perdido
        if (vidas > 0){
            System.out.println("Has ganado con " + vidas + " vidas");
        }else{
            System.out.println("Has perdido");
        }


        s.close();
    }
}
