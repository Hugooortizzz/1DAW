//Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
//(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
//almacenar las parejas de palabras. El programa pedirá una palabra en español
//y dará la correspondiente traducción en inglés.


package Ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        boolean salir = false;
        Scanner s = new Scanner(System.in);
        String color;

        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("naranja", "orange");
        diccionario.put("rosa", "pink");
        diccionario.put("morado", "purple");
        diccionario.put("negro", "black");
        diccionario.put("blanco", "white");
        diccionario.put("marrón", "brown");
        diccionario.put("gris", "grey");
        diccionario.put("amarillo", "yellow");
        diccionario.put("dorado", "gold");
        diccionario.put("beige", "beige");
        diccionario.put("turquesa", "turquoise");
        diccionario.put("plateado", "silver");
        diccionario.put("celeste", "skyblue");
        diccionario.put("violeta", "violet");
        diccionario.put("fucsia", "fuchsia");
        diccionario.put("índigo", "indigo");
        diccionario.put("coral", "coral");

        while (!salir){
            System.out.println("DICCIONARIO DE COLORES (ESPAÑOL E INGLES)");
            System.out.println("-----------------------------------------");
            System.out.println("1.- Español a Inglés");
            System.out.println("2.- Inglés a Español");
            System.out.println("3.- Salir");

            switch(s.nextInt()){
                case 1:
                    System.out.print("Introduzca un color en Español: ");
                    color = s.next();
                    System.out.print("Traduccion: ");
                    System.out.println(diccionario.get(color));
                    break;
                case 2:
                    System.out.print("Introduzca un color en Inglés: ");
                    color = s.next();
                    System.out.print("Traduccion: ");
                    for (Map.Entry c : diccionario.entrySet()){
                        if( c.getValue().equals(color)){
                            System.out.println(c.getKey());
                        }
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");

            }
        }



    }
}
