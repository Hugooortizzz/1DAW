/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. */


package PROG.Tema6;

import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero_aleatorio;
        String apuesta;

        Random r = new Random();

        for (int i = 1; i < 15; i++){
             System.out.print("Partido " + i + ":\t");
             for (int j = 0; j<3; j++){
                numero_aleatorio = r.nextInt(7);
                //Este ejercicio es igual que el anterior pero cambiando las condiciones, en vez de que sea un numero fijo va a ser
                //un rango de números, siendo este rango mas amplio o mas pequeño según tenga mas o menos posibilidades de que salga.
                if ((numero_aleatorio >= 0) && (numero_aleatorio <= 2)){ //Si está entre 0 y 2 saldrá 1, teniendo 3/6 posibilidades de salir
                    apuesta = "1";
                }else if (numero_aleatorio == 3){ //Si es exactamente 3, será 2, teniendo 1/6 posibilidades de salir
                    apuesta = "2";
                }else{ //El resto de números representarán a la X, teniendo 2/6 posibilidades de salir
                    apuesta = "X";
                }
                System.out.print(apuesta + "\t");
             }
             System.out.print("\n");
        }

        //PLENO AL 15
        System.out.println("Pleno a 15:");
        for (int k = 1; k<=2; k++){
            numero_aleatorio = r.nextInt(4);
            System.out.print("Equipo " + k + ": ");
            if (numero_aleatorio == 3){
                System.out.print("M");
            }else{
                System.out.print(numero_aleatorio);
            }
            System.out.print("\n");
        }
    }
}
