package PROG.Tema6;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        int numero_aleatorio;
        String figura = "";
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";
        char repetir;
        int saldo = 1; //El saldo siempre empezará en uno, ya que metes una única moneda por tirada
        boolean jugar = true;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        while (jugar) { //Este bucle se repetirá constantemente hasta que, cumpliendose ciertas condiciones, la variable jugar sea falsa
            for (int i = 1; i <= 3; i++) { //Este bucle representa las 3 figuras que salen por tirada
                numero_aleatorio = r.nextInt(5); //Este será el número que indicará que figura sale
                switch (numero_aleatorio) { //Y este switch indicará a que figura corresponde cada número
                    case 0:
                        figura = "corazón";
                        break;

                    case 1:
                        figura = "diamante";
                        break;

                    case 2:
                        figura = "herradura";
                        break;

                    case 3:
                        figura = "campana";
                        break;

                    case 4:
                        figura = "limón";
                        break;
                }

                switch (i) { //Este switch establecerá a que figura (primera, segunda o tercera) se le asginará la figura dependiendo de que repetición del bucle sea...
                    case 1: //... es decir, la primera repetición se le asignará a figura1, la segunda repetición a figura2, etc.
                        figura1 = figura;
                        break;

                    case 2:
                        figura2 = figura;
                        break;

                    default:
                        figura3 = figura;
                        break;
                }
            }

            System.out.println(figura1 + "\t\t" + figura2 + "\t\t" + figura3);

            //Estos ifs van a dar los resultados de la tirada
            if ((figura1 == figura2) && (figura2 == figura3)) { 
                System.out.println("Enhorabuena, has ganado 10 monedas");
                saldo += 10;
            } else if ((figura1 == figura2) || (figura2 == figura3) || (figura3 == figura1)) {
                System.out.println("Bien, ha recuperado su moneda");
            } else {
                System.out.println("Lo siento, ha perdido");
                saldo--;
            }

            //En caso de que se haya acabado el saldo, jugar se establecerá como falso y el bucle se parará
            if (saldo == 0) {
                jugar = false;
            } else { //En cualquier otro caso, el programa pregunta al usuario si quiere seguir jugando
                System.out.println("Saldo actual: " + saldo);
                System.out.println("¿Quieres volver a jugar? (S/N): ");
                repetir = s.next().charAt(0);

                if ((repetir == 'N') || (repetir == 'n')) {
                    jugar = false; //Y si el usuario indica que no, jugar se pondrá como falso y el bucle parará
                }
            }

        }

        //Por último, el programa mostrará cuantas monedas se han ganado o se han perdido
        if (saldo > 0){
            System.out.println("Has empezado con 1 moneda y has acabado con " + saldo + " monedas, por lo que has ganado " + (saldo - 1) + " monedas");
        }else{
            System.out.println("Has empezado con 1 moneda y has acabado con 0, por lo que has perdido 1 moneda");
        }

        s.close();
    }
}
