/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */

package Tema6;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        int nota;
        int suspensos = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;

        Random r = new Random();

        for (int i=1; i<=20; i++){ //Creo el bucle que se va a repetir 20 veces, una vez por nota
            nota = r.nextInt(11); //Indico la nota de forma aleatoria, del 0 al 10 (11 porque si pongo 10 sería del 0 al 9)
            System.out.print("Nota " + i + ": ");

            if(nota < 5){ //Condicionales para que identifique la nota, la imprima y la sume al contador
                System.out.print("Suspenso");
                suspensos ++;
            }else if(nota < 7 ){
                System.out.print("Bien");
                bienes ++;
            }else if(nota < 9){
                System.out.print("Notable");
                notables ++;
            }else{
                System.out.print("Sobresaliente");
                sobresalientes ++;
            }

            System.out.print("\n");
        }

        System.out.println("Suspensos: " + suspensos);
        System.out.println("Bienes: " + bienes);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
    }
}
