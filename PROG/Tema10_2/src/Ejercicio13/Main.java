//Modifica el programa Gestisimal realizado anteriormente añadiendo las
//siguientes mejoras:
//        • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
//        • Comprueba la existencia del código en el alta, la baja y la modificación de artículos para evitar errores.
//        • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta de varios
//          artículos y emitir la factura correspondiente. Se debe preguntar por los códigos y las cantidades de cada
//          artículo que se quiere comprar. Aplica un 21% de IVA.

package Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        ArrayList <Articulo> almacen = new ArrayList<Articulo>();
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        boolean existe;
        String codigo;
        String descripcion;
        double precioCompra;
        double precioVenta;

        while (!salir){
            System.out.println("1.- Listado");
            System.out.println("2.- Alta");
            System.out.println("3.- Baja");
            System.out.println("4.- Modificación");
            System.out.println("5.- Entrada de mercancia");
            System.out.println("6.- Venta");
            System.out.println("7.- Salir");

            switch(s.nextInt()){
                case 1:
                    for(Articulo a : almacen){
                        System.out.println(a);
                    }
                    break;
                case 2:
                    existe = false;
                    System.out.print("Introduzca el código del producto: ");
                    codigo = s.next();
                    for (Articulo a : almacen){
                        if (a.getCodigo().equals(codigo)){
                            existe = true;
                            System.out.println("Ese código ya existe");
                        }else{
                            System.out.println("Introduzca la descripción del producto: ");
                            descripcion = s.nextLine();
                            System.out.println("Introduzca el precio de compra: ");
                            precioCompra = s.nextDouble();
                            System.out.println("Introduzca el precio de venta: ");
                            precioVenta = s.nextDouble();

                            almacen.add(new Articulo(codigo, descripcion, precioCompra, precioVenta));
                        }
                    }
                    break;
                case 3:
                    existe = false;
                    System.out.print("Introduzca el código del producto que quiere borrar: ");
                    codigo = s.next();
                    for (Articulo a : almacen){
                        if (a.getCodigo().equals(codigo)){
                            existe = true;
                            almacen.remove(a);
                            System.out.println("Artículo borrado con éxito");
                        }
                    }

                    if (!existe){
                        System.out.println("Ese producto no existe");
                    }
                    break;
                case 4:
                    existe = false;
                    System.out.print("Introduzca el código del producto que quiere modificar: ");
                    codigo = s.next();
                    for (Articulo a : almacen){
                        if (a.getCodigo().equals(codigo)){
                            existe = true;
                            System.out.println("¿Qué quiere modificar?");
                            System.out.println("1.- Descripción");
                            System.out.println("2.- Precio de compra");
                            System.out.println("3.- Precio de venta");
                            System.out.println("4.- Stock");

                            switch(s.nextInt()){
                                case 1:
                                    System.out.println("Introduzca la nueva descripción: ");
                                    a.setDescripcion(s.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Introduzca el nuevo precio de compra: ");
                                    a.setPrecioCompra(s.nextDouble());
                                    break;
                                case 3:
                                    System.out.println("Introduzca el nuevo precio de venta: ");
                                    a.setPrecioVenta(s.nextDouble());
                                    break;
                                case 4:
                                    System.out.println("Introduzca el nuevo stock: ");
                                    a.setStock(s.nextInt());
                                    break;
                                default:
                                    System.out.println("Introduzca una opción válida");
                                    break;
                            }
                        }

                    }

                    if (!existe){
                        System.out.println("Ese producto no existe");
                    }
                    break;
                case 5:
                    existe = false;
                    System.out.print("Introduzca el código del producto al que quiere añadir: ");
                    codigo = s.next();
                    for (Articulo a : almacen){
                        if (a.getCodigo().equals(codigo)){
                            existe = true;
                            System.out.println("Cuantas unidades van a entrar: ");
                            a.entrada(s.nextInt());
                        }
                    }

                    if (!existe){
                        System.out.println("Ese producto no existe");
                    }
                    break;

                case 6:


            }
        }
    }
}
