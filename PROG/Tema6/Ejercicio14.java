/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir. */

package PROG.Tema6;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numero;
        int intento;
        int mayor = 100;
        int menor = 0;
        String indicacion;
        int oportunidades = 5;

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        System.out.print("¿En que número estás pensando? (la máquina no lo va a saber) (0-100): ");
        numero = s.nextInt(); //Primero el usuario indica el número en el que está pensando

        while ((numero < 0) || (numero > 100)){ //He creado el bucle para que el programa solo continue cuando el número sea válido
            System.out.print("Introduce un número válido: ");
            numero = s.nextInt(); 
        }

        System.out.println("--------------------------------------------------------------------");
        

        System.out.println("Voy a adivinar en que número estás pensando, tengo 5 intentos");

        do{ //EL bucle se repite 5 veces hasta que el contador de oportunidades llegue a 0
            //El intento será un número aleatorio teniendo como límite las variables menor y mayor, para 
            //que así la máquina vaya teniendo en cuenta si el número es mayor o menor que los intentos que 
            //ha dicho antes
            intento = r.nextInt(menor, mayor); 

            System.out.println("Estás pensando en el número " + intento);

            if (intento == numero){ //Cuando lo haya adivinado, esta condición lo detectará y hará que el programa salga del bucle
                System.out.print("¡He ganado!");
                oportunidades = -1;
            }else if (oportunidades > 1){ //He añadido esta condición ya que después de su último intento, no tiene sentido darle indicaciones ya que no va a poder hacer otro intento
                System.out.print("Vaya, he fallado. ¿Tú número es mayor o menor que " + intento + "?: ");
                indicacion = s.next(); //Aquí le tendremos que dar la indicación a la máquina (mayor o menor)

                switch(indicacion){
                    case "mayor":
                    case "Mayor":
                    menor = intento; //En caso de que el número sea mayor, el intento de la máquina se establecera
                    break;  //como la variable menor, ya que el número no puede ser más pequeño que el intento en este caso

                    case "menor":
                    case "Menor":
                    mayor = intento; //Igual que la condición anterior pero al revés, ya que el número no puede ser mayor
                    break; //que el intento ya que hemos dicho que es menor.

                    default:
                    System.out.print("Perdon, no te he entendido");
                    break;
                }

                
            }
            System.out.println("-------------------------------------------------------------");
            oportunidades --; //Aquí se restan las oportunidades del contador
        }while(oportunidades > 0);

        if (oportunidades == 0){ //Cuando la condición SOLO sea 0 (-1 indica que la máquina ha ganado)
            System.out.println("Se me han acabado los intentos :("); // y mostrará que la máquina ha perdido
        }

        s.close();
    }
}
