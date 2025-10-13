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

        for (int i = 1; i <= altura; i++){
            if (i == altura){ //Cuando está en la última línea, introduce la mitad de los carácteres de la altura.
                for (int j=0; j<=altura/2; j++){
                    System.out.print("*");
        
                }
            }else{
                    System.out.print("*");
                    System.out.print("\n");
                    }
        }

        s.close();
    }
}
