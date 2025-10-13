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

    while (contar_cifras > 0){
        contar_cifras = contar_cifras / 10;
        cifras++;
    }
    potencia = cifras - 1;

    System.out.print("Dígitos pares: ");
    for (int i = 1; i <= cifras; i++){
        digito = (int) ((numero / Math.pow(10,potencia)) % 10);
        if (digito % 2 == 0){
        System.out.print(digito + " ");
        total_pares = total_pares + digito;
        }
        potencia--;
        }
        
        System.out.println("\nSuma de los digitos pares: " + total_pares);

        s.close();
    }   

}


