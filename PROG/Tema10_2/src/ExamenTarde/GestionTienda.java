package ExamenTarde;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionTienda {
        ArrayList<Pedido> pedidos;
        HashMap<String, Double> descuentosCliente;

    public GestionTienda() {
        pedidos = new ArrayList<>();
        descuentosCliente = new HashMap<>();
    }

    public Pedido pedidoExiste(String codigo){
        for (Pedido p : pedidos){
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }

        return null;
    }

    /*Añade el pedido a la lista solo si no existe ya otro pedido con el mismo codigo. Si el cliente
    no aparece en descuentosCliente, deberá quedar registrado con descuento 0.0. Devuelve true si se
    añade y false en caso
    contrario.*/
    public boolean registrarPedido(Pedido p){
        if(!pedidos.contains(p)){
            pedidos.add(p);
            if(!descuentosCliente.containsKey(p.getCliente())){
                descuentosCliente.put(p.getCliente(), 0.0);
            }
            System.out.println("El cliente se ha añadido correctamente");
            return true;
        }

        System.out.println("El cliente ya está registrado");
        return false;
    }

//    Asigna o modifica el descuento de un cliente. El descuento solo será válido si está entre 0 y 50, ambos
//    incluidos. Devuelve true si se guarda el descuento y false si el porcentaje no es válido.
    public boolean asignarDescuento(String cliente, double descuento){
        if (descuentosCliente.containsKey(cliente)){
            if (descuento >= 0 && descuento <= 50){
                descuentosCliente.put(cliente, descuento/100);
                return true;
            }else{
                System.out.println("El porcentaje no es valido");
            }
        }else{
            System.out.println("El cliente no existe en la tabla de descuentos");
        }

        return false;
    }

//    Devuelve el importe final de un pedido después de aplicar el descuento de su cliente. Si el pedido no
//    existe, devuelve -1
    public double importeFinal(String codigoPedido){
        Pedido pedido = pedidoExiste(codigoPedido);
        if(pedido != null) {
            return pedido.getImporteBase() - (pedido.getImporteBase() * descuentosCliente.get(codigoPedido));
        }

        System.out.println("El pedido no existe");
        return -1;
    }

//    Avanza el estado del pedido una sola fase siguiendo este orden: pendiente -> preparado -> enviado ->
//    entregado. Si el pedido no existe o ya está entregado, devuelve false. En caso contrario, modifica el
//    estadov y devuelve true.
    public boolean avanzarEstado(String codigoPedido){
        Pedido pedido = pedidoExiste(codigoPedido);


    }




}
