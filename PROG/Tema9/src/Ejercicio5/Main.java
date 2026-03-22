package Ejercicio5;

public class Main {
    public static void main(String[] args){
        Pizza p1 = new Pizza(Tipo.Margarita, Tamaño.Mediana);
        Pizza p2 = new Pizza(Tipo.Funghi, Tamaño.Familiar);
        p2.servirPizza();
        Pizza p3 = new Pizza(Tipo.CuatroQuesos, Tamaño.Mediana);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        p2.servirPizza();
        System.out.println("pedidas: " + Pizza.getPizzasPedidas());
        System.out.println("servidas: " + Pizza.getPizzasServidas());
    }
}
