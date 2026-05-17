package ExamenTarde;

public class Main {
    public static void main(String[] args) {
        GestionTienda tienda = new GestionTienda();

        Pedido p = new Pedido("Hugo", "123", "Enviado", 20, "Utrera" );
        Pedido p2 = new Pedido("Hugo", "1234", "Enviado", 20, "Utrera" );

        tienda.registrarPedido(p);
        tienda.registrarPedido(p2);
    }
}
