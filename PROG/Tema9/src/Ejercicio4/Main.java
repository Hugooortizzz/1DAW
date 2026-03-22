package Ejercicio4;

public class Main {
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(24, 12);
        Fraccion f2 = new Fraccion(9, 3);
        Fraccion f3 = new Fraccion (25, 15);
        Fraccion f4 = new Fraccion(30,12);


        System.out.println(f1.toString() + " * " + f2.toString());

        System.out.println(f1.multiplica(f2));

        System.out.println(f3.toString() + " / " + f4.toString());

        System.out.println(f3.divide(f2));


    }
}
