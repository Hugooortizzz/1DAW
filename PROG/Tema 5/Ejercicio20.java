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
		
		//Espacios de la primera línea (el número de espacios empieza siendo igual al número de líneas y se va restando conforme avanzan las líneas)
		for (int l = altura; l > 0; l--){
			System.out.print(" ");
		}
		System.out.print(caracter + "\n"); //Caracter de la primera línea


		//Cuantas líneas va a tener < altura - 1en vez de <= altura porque la primera línea y la última las pintamos fuera del bucle
		for (int i = 1; i < altura - 1; i++){
			for (int k = altura - i; k > 0; k--){ //Los espacios a la izquierda
					System.out.print(" ");
			}
			System.out.print(caracter); 
			for (int j = 1; j < i*2; j++){ //Los espacios entre el primer y el segundo carácter
				System.out.print(" ");
			}
			System.out.print(caracter + "\n");//El último caracter
		}

		for (int n = 0; n <= altura * 2; n++){//Caracteres de la última línea
			System.out.print(caracter);
		}
		s.close();
	}
}



