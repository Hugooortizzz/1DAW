//Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. El programa irá pidiendo que el usuario
//teclee la traducción al inglés de cada una de las palabras y comprobará si
//son correctas. Al final, el programa deberá mostrar cuántas respuestas son
//válidas y cuántas erróneas.

package Ejercicio11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String color;
        int intentos = 5;
        int correctas = 0;

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




        while(intentos > 0){
            for(Map.Entry c : diccionario.entrySet()){
                if (intentos > 0 && r.nextInt(0,10) == 0 && (!c.getValue().equals("Acertado"))){ //Hay una probabilidad de 1 entre 10 de que esa entrada sea la válida, ademas no puede ser ya acertada
                    System.out.println("¿Cómo se dice " + c.getKey() + " en inglés?: ");
                    color = s.next();

                    if (color.equals(c.getValue())){
                        System.out.println("¡Has acertado!");
                        correctas ++;
                        diccionario.put((String) c.getKey(), "Acertado");

                    }else{
                        System.out.println("Has fallado, se dice " + c.getValue());
                    }

                    intentos --;
                }
            }
        }

        System.out.println("Acertados: " + correctas);
        System.out.println("Fallados: " + (5-correctas));

    }
}
