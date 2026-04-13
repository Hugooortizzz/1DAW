public class Main {
    public static void main() {
        Direccion d = new Direccion("Sevilla");
        Persona p1 = new Persona("Ana", d);
        Persona p2 = p1.clone();
        p2.direccion.ciudad = "Granada";
        System.out.println(p1.direccion.ciudad);
        System.out.println(p2.direccion.ciudad);


    }
}
