import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main (String[] args) {
		int altura;
		String caracter;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de líneas que quieres que mida la pirámide: ");
		altura = s.nextInt();
		
		System.out.print("Introduzca el carácter del que se va a formar la pirámide: ");
		caracter = s.next();
		
		//Espacios de la primera línea (el número de espacios empieza siendo igual al número de líneas menos uno y se va restando conforme avanzan las líneas)
		for (int l = altura - 1; l > 0; l--){
			System.out.print(" ");
		}
		System.out.print(caracter + "\n"); //Caracter de la primera línea


		//Cuantas líneas va a tener, < altura - 1 en vez de <= altura porque la primera línea y la última las pintamos fuera del bucle
		for (int i = 1; i < altura - 1; i++){
			for (int k = altura - 1 - i; k > 0; k--){ //Los espacios a la izquierda del resto de líneas. Es igual que el anterior pero restandole lo que vale i en ese momento
					System.out.print(" ");
			}
			System.out.print(caracter); //Pinta el primer caracter de la línea (fuera de los bucles anidados porque siemre es 1)
			for (int j = 1; j < i*2; j++){ //Los espacios entre el primer y el segundo carácter, el límite es que el valor sea menor que i * 2 para que el numero de espacios siempre sea impar
				System.out.print(" ");
			}
			System.out.print(caracter + "\n");//Pinta el último caracter de la línea (fuera de los bucles anidados porque siemre es 1)
		}

		for (int n = 1; n < altura * 2; n++){//Caracteres de la última línea, va a pintar caracteres hasta que la i sea menor que altura * 2 (y no igual para que sea impaar)
			System.out.print(caracter);
		}
		s.close();
	}
}



