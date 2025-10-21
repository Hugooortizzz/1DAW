package PROG.Tema6;

import java.util.Random;

public class Ejemplo {
    public static void main(String[] args) {
        Random r = new Random();

        boolean verdaderoFalso = r.nextBoolean();

        System.out.println("El valor del boolean es: " + verdaderoFalso);

        int dado = r.nextInt(3, 6+1);

        System.out.println("El valor del dado es: " + dado);
    }
}
