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
        int[] numero_final = new int[10];
        int p_inicial;
        int p_final;

        p_inicial = -1;
        p_final = -2;

        Scanner s = new Scanner(System.in);

        
        for (int i = 0; i<numero.length; i++){
            System.out.print("Introduzca el número " + i + ": ");
            numero[i] = s.nextInt();
        }

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
        while (p_inicial>p_final){
            p_inicial = -1;
            p_final = -2;
            while (p_inicial<0 || p_inicial>9){
                System.out.print("Introduzca la posicion inicial (0-9): ");
                p_inicial  = s.nextInt();
                if (p_inicial<0 || p_inicial>9){
                    System.out.println("La posición inicial debe estar entre 0 y 9");
                }
            }

            while (p_final<0 || p_final>9){
                System.out.print("Introduzca la posición final (0-9): ");
                p_final = s.nextInt();
                if (p_final<0 || p_final>9){
                    System.out.println("La posición final debe estar entre 0 y 9");
                }
            }
            if (p_inicial > p_final){
                System.out.println("La posición inicial debe ser menor que la posición final");
            }
        }


        //Asignar los valores desde la posición inicial a la final
        for (int q=p_final; q<numero.length; q++){
            if (q == p_final){
                numero_final[q] = numero[p_inicial];
            }else{
                numero_final[q] = numero[q-1];
            }
            
            
        }

        //Asignar valores desde el 0 hasta la posición final
        for (int p=0; p<p_final; p++){
            if (p==0){
                numero_final[p] = numero[numero.length-1];
            }else if (p>p_inicial){
                numero_final[p] = numero[p];
            }else{
                numero_final[p] = numero[p-1];
            }
        }

        //Mostrar Indice 2
        for (int j=0; j<numero.length; j++){
            System.out.print(j + "\t");
        }

        System.out.println();

        //Mostrar Array final
        for (int k=0; k<numero.length; k++){
            System.out.print(numero_final[k] + "\t");
        }

        

    }
}
