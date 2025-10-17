/* Juego de Adivinar la Palabra mostrando guiones por cada letra (versión simple).
(Es una versión primitiva, hay muchas cosas que se podrán mejorar cuando veamos los arrays)
 */

import java.util.Scanner;
import java.lang.Math;

public class AdivinaPalabra {
    public static void main(String[] args) {
        int palabra_aleatoria;
        String palabra = " ";
        String intento;
        int longitud_palabra = 0;
        int vidas = 5;

        Scanner s = new Scanner(System.in);

        palabra_aleatoria = (int) (Math.random() * 10);

        switch(palabra_aleatoria){
            case 0:
            palabra = "mesa";
            break;

            case 1:
            palabra = "batido";
            break;

            case 2:
            palabra = "arbol";
            break;

            case 3:
            palabra = "terreno";
            break;

            case 4:
            palabra = "reloj";
            break;

            case 5:
            palabra = "mando";
            break;

            case 6:
            palabra = "altavoz";
            break;

            case 7:
            palabra = "miniatura";
            break;

            case 8:
            palabra = "parapente";
            break;

            case 9:
            palabra = "tailandia";
            break;

        }
        longitud_palabra = palabra.length();

         System.out.println("Estoy pensando en una palabra");
        for (int i = 0; i < longitud_palabra; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        
        while ((vidas > 0) && (vidas <= 5)){
            System.out.println("Tienes " + vidas + " vidas");
            do{
            System.out.print("¿Cuál es la palabra? (Con la misma longitud): ");
            intento = s.nextLine();
            }while (intento.length() != palabra.length());

            for (int j = 0; j < longitud_palabra; j++){
                if ((intento.charAt(j) == palabra.charAt(j)) || (intento.charAt(j) == Character.toUpperCase(palabra.charAt(j)))){
                    System.out.print(palabra.charAt(j));
                }else{
                    System.out.print("-");
                }
            }
            System.out.print("\n");

            if (intento.equalsIgnoreCase(palabra)){
                System.out.println("¡Has acertado!");
                vidas = 6;
            }else{
                System.out.println("No has adivinado la palabra completa, por lo que has perdido una vida");
                vidas --;
            }
        }

        if (vidas == 0){
            System.out.println("Has perdido, la palabra era " + palabra);
        }

        s.close();
    }
}
