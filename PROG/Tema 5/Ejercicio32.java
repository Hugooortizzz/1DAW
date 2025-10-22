//Escribe un programa que, dado un número entero, diga cuáles son y cuánto
//suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
//izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
//números largos.

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio32 {
    public static void main(String[] args) {
        
    
    int numero;
    int digito;
    int total_pares = 0;
    int contar_cifras;
    int cifras = 0;
    int potencia;
  

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    numero = s.nextInt();
    contar_cifras = numero;

    //El procedimiento para identificar los digitos es el mismo que he usado en ejercicios anteriores, primero cuento las cifras
    while (contar_cifras > 0){ 
        contar_cifras = contar_cifras / 10;
        cifras++;
    }
    potencia = cifras - 1;

    System.out.print("Dígitos pares: ");
    for (int i = 1; i <= cifras; i++){
        digito = (int) ((numero / Math.pow(10,potencia)) % 10); //Y luego utilizo esta operación matemática para ir identificando los dígitos
        if (digito % 2 == 0){ //En caso de que el módulo de dividir el dígito entre 2 es igual a 0 (es decir, es par)
        System.out.print(digito + " "); //Se muestra por pantalla
        total_pares = total_pares + digito; //Y se suma al total de los pares
        }
        potencia--;
        }
        
        System.out.println("\nSuma de los digitos pares: " + total_pares);

        s.close();
    }   

}


