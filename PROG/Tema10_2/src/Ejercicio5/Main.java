package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Disco> coleccion = new ArrayList<Disco>();
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String autor;
        String codigo;
        int duracion;
        String genero;
        String titulo;

        while (!salir){
            System.out.println("¿Qué desea hacer?");
            System.out.println("1.- Añadir disco");
            System.out.println("2.- Borrar disco");
            System.out.println("3.- Actualizar disco");
            System.out.println("4.- Ver colección");
            System.out.println("5.- Salir");
            opcion = s.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Introduzca el código del disco: ");
                    codigo = s.next();
                    s.nextLine();
                    System.out.print("Introduzca el título del disco: ");
                    titulo = s.nextLine();
                    System.out.print("Introduzca el autor del disco: ");
                    autor = s.nextLine();
                    System.out.print("Introduzca el género del disco: ");
                    genero = s.nextLine();
                    System.out.print("Introduzca la duración del disco: ");
                    duracion = s.nextInt();

                    coleccion.add(new Disco(autor, codigo, duracion, genero, titulo));
                    break;
                case 2:
                    System.out.println("Introduzca el código del disco que quiere eliminar: ");
                    codigo = s.next();

                    for (Disco disco : coleccion){
                        if (disco.getCodigo().equals(codigo)){
                            System.out.println(disco.getTitulo() + " eliminado con exito");
                            coleccion.remove(disco);
                        }
                    }
                    break;
                case 3:
                    System.out.println("¿Que disco desea modificar (código)?");
                    codigo = s.next();

                    for (Disco disco : coleccion){
                        if(disco.getCodigo().equals(codigo)){
                            System.out.println("¿Qué campo desea modificar?");
                            System.out.println("1.- Código");
                            System.out.println("2.- Título");
                            System.out.println("3.- Autor");
                            System.out.println("4.- Género");
                            System.out.println("5.- Duración");

                            opcion = s.nextInt();
                            s.nextLine();

                            switch(opcion){
                                case 1:
                                    System.out.print("Nuevo código: ");
                                    disco.setCodigo(s.next());
                                    break;
                                case 2:
                                    System.out.print("Nuevo Título: ");
                                    disco.setTitulo(s.nextLine());
                                    break;
                                case 3:
                                    System.out.print("Nuevo Autor: ");
                                    disco.setAutor(s.nextLine());
                                    break;
                                case 4:
                                    System.out.print("Nuevo Género: ");
                                    disco.setGenero(s.nextLine());
                                    break;
                                case 5:
                                    System.out.print("Nueva Duración: ");
                                    disco.setDuracion(s.nextInt());
                                    break;
                                default:
                                    System.out.println("Introduzca una opción válida");
                            }
                        }
                    }
                    break;
                case 4:
                    for(Disco disco : coleccion){
                        System.out.println(disco);
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
            }
        }

    }
}
