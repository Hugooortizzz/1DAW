/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as */

package PROG.Tema6;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n_palo;
        String palo = " ";
        String numero;
        
        n_palo = (int) (Math.random()*4);

        numero = String.valueOf((int) ((Math.random()*10)+1)); //Este ejercicio es igual que el anterior, pero el número aleatorio debe
        //estar entre el 1 y el 10 en vez de entre el 1 y el 13

        switch (n_palo){
            case (0):
            palo = "Espadas";
            break;

            case (1):
            palo = "Bastos";
            break;

            case (2):
            palo = "Oro";
            break;

            case (3):
            palo = "Copas";
            break;
        }

        switch (numero){
            case ("1"):
            numero = "As";
            break;

            case ("8"):
            numero = "Sota";
            break;

            case ("9"):
            numero = "Caballo";
            break;

            case ("10"):
            numero = "Rey";
            break;
        }

        System.out.println("Te ha salido " + numero + " de " + palo);
    }
}
