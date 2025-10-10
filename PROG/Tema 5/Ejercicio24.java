//Escribe un programa que lea un número n e imprima una pirámide de números
//con n filas como en la siguiente figura:
//   1
//  121
// 12321
//1234321

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int filas;
        int numero = 1;
        int multiplo_resta = 1;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el número de filas de la pirámide: ");
        filas = s.nextInt();

        //Este primer bucle representa lo que va a ocurrir en cada línea, repitiendose el numero de veces que indiquemos en el valor filas
        for (int i = 1; i <= filas; i++){
            //Espacios a la izquierda, el valor va a comenzar siendo el mismo que filas y va a ir hacia abajo, ya que la primera fila tiene el mismo número de
            //espacios a la izquierda que el número de la fila. El operador es negativo puesto que mientras más baja la fila menos espacios necesita ya que ocupa
            //más caracteres
            for (int l = filas - i; l > 0; l--){
                System.out.print(" ");
            }

            //Este bucle genera los caracteres de cada línea. Como quiero el número de carácteres siempre vaya aumentado siempre siendo impar, hago que el
            //límite del bucle sea que el contador sea menor que la línea en la que se encuentra * 2. Es decir, en la segunda línea introducirá tres caracteres
            //ya que va introduciendo estos hasta que el contador del bucle sea menor que 4, es decir, 3.
            for (int k = 1; k < i * 2; k++){
                //Este if sirve para distinguir los numeros de la izquierda y de la derecha, la primera condicion es para generar los numeros de la derecha
                //puesto que si k (el caracter que se va a introducir) es mayor que el número de la línea en la que estamos, el número que se mostrará será
                //el número que tocaría en ese caso menos 2 por un contador que va aumentando a medida que el número es mayor.
                if (k > i){
                System.out.print(numero * k - 2 * multiplo_resta);
                multiplo_resta ++;
                
                }else{
                     System.out.print(numero * k);
                }
            }
            System.out.print("\n");
            multiplo_resta = 1;
            
        }

        s.close();
    }
}
