//La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
//un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
//anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
//céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
//cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
//siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
//de la clase Moneda y la secuencia se debe ir almacenando en una lista

package Ejercicio7;

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();
        Random r = new Random();
        Moneda monedaAleatoria = new Moneda();
        monedaAleatoria.generaPosicionAleatoria();
        monedaAleatoria.generarMonedaAleatoria();

        monedas.add(monedaAleatoria);

        for (int i = 0; i < 5; i++) {
            if(r.nextInt(0,2) == 0){
                monedaAleatoria = new Moneda();
                monedaAleatoria.setMoneda(monedas.get(monedas.size() - 1).getMoneda());
                monedaAleatoria.generaPosicionAleatoria();
            }else{
                monedaAleatoria = new Moneda();
                monedaAleatoria.setPosicion(monedas.get(monedas.size() - 1).getPosicion());
                monedaAleatoria.generarMonedaAleatoria();
            }

            monedas.add(monedaAleatoria);
        }

        for (Moneda m : monedas){
            System.out.println(m);
        }
    }
}
