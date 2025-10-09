import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main (String[] args) {
		int altura;
		String caracter;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de líneas que mida la pirámide: ");
		altura = s.nextInt();
		
		System.out.print("Introduzca el carácter del que se va a formar la pirámide: ");
		caracter = s.next();
		
		//Espacios de la primera línea
		for (int l = 1; l <= altura * 2; l++){
			System.out.print(" ");
		}
		System.out.print(caracter + "\n"); //Caracter de la primera línea


		//Cuantas líneas va a tener
		for (int i = 2; i < altura; i++){
			for (int k = i; k < altura * 2; k++){ //Los espacios a la izquierda
					System.out.print(" ");
			}
			System.out.print(caracter); 
			for (int j = 1; j < i*2; j++){ //Los espacios entre el primer y el segundo carácter
				System.out.print(" ");
			}
			System.out.print(caracter + "\n");//El último caracter
		}
		
		for (int p = 0; p < altura; p++){ //Espacios a la izquierda de la última línea
			System.out.print(" ");
		}

		for (int n = 0; n <= altura * 2; n++){//Caracteres de la última línea
			System.out.print(caracter);
		}
		s.close();
	}
}



