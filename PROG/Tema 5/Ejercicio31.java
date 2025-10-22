//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
//programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
//mitad (división entera entre 2) de la altura más uno.

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int altura;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        altura = s.nextInt();

        for (int i = 1; i <= altura; i++){ //El bucle se va a repetir el número de veces que indiquemos en altura
            if (i == altura){ //Cuando está en la última línea, introduce la mitad de los carácteres de la altura.
                for (int j=0; j<=altura/2; j++){
                    System.out.print("*");
        
                }
            }else{ //En cualquier otro caso (todas las líneas menos la última), solo se pinta un caracter y se salta de línea
                    System.out.print("*");
                    System.out.print("\n");
                    }
        }

        s.close();
    }
}
