
import java.util.Scanner;

public class PiramideNevada {
	
	public static void main (String[] args) {
		int altura;
		int linea = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de las montañas (mínimo 6): ");
		altura = s.nextInt();
		
		while (altura < 6){
			System.out.print("Introduzca una altura válida: ");
			altura = s.nextInt();
		} 
				
				for(int j = 1; j <= 3; j++){ //Altura de la pirámide
					linea++;
					if (linea != altura){
					for (int i = 0; i < altura / 3; i++){
						//Primeros espacios a la izquierda
						for(int l = 3 - j; l >= 0; l--){
							System.out.print(" ");
						}
						//Caracteres
						for (int k = 1; k < j * 2; k++){
							System.out.print("*");
						}
						//Espacios a la derecha
						for(int l = 3 - j; l >= 0; l--){
							System.out.print(" ");
						}
						System.out.print(" ");
					
					}
				System.out.print("\n");
				
				
			}
			}
			
	}
}