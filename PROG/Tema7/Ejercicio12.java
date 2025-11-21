/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7: */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int aux_ultimo;
        int aux_inicial;
        int p_inicial;
        int p_final;

        Scanner s = new Scanner(System.in);

        
        for (int i = 0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();
        }
        aux_ultimo = numero[numero.length-1];
        aux_inicial = numero[0];

        //Indice 1
        for (int j=0; j<numero.length; j++){
            System.out.print(j + "\t");
        }

        System.out.println();
        
        //Mostrar Array 1
        for (int k=0; k<numero.length; k++){
            System.out.print(numero[k] + "\t");
        }

        System.out.println();


        
        //Comprobaciones posicion inicial y final
        do {
            do{
                System.out.print("Introduzca la posicion inicial (0-9): ");
                p_inicial  = s.nextInt();
                if (p_inicial<0 || p_inicial>9){
                    System.out.println("La posición inicial debe estar entre 0 y 9");
                }
            }while (p_inicial<0 || p_inicial>9)

            do{ //Cambiar while por do-while
                System.out.print("Introduzca la posición final (0-9): ");
                p_final = s.nextInt();
                if (p_final<0 || p_final>9){
                    System.out.println("La posición final debe estar entre 0 y 9");
                }
            }while (p_final<0 || p_final>9)

            if (p_inicial > p_final){
                System.out.println("La posición inicial debe ser menor que la posición final");
            }
        } while (p_inicial>p_final)


        for (int i=p_inicial; i>0; i--){
            numero[i] = numero[i-1];
        }
        numero[0] = aux_ultimo;

        for (int i=numero.length-1; i>p_final; i--){
            numero[i] = numero[i-1];
        }
        numero[numero.length-1] = aux_inicial;

        //Mostrar Indice 2
        for (int j=0; j<numero.length; j++){
            System.out.print(j + "\t");
        }

        System.out.println();

        //Mostrar Array final
        for (int k=0; k<numero.length; k++){
            System.out.print(numero[k] + "\t");
        }

        
        s.close();
    }
}
