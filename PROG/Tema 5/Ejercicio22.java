//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class Ejercicio22 {
    public static void main(String[] args) {
		int divisible = 0;
		
        for (int i = 2; i<=100; i++){
		
            for (int l = 1; l <= i; l++){
			if (i % l == 0){
				divisible ++;
			}
		}
		if (divisible <= 2){
            System.out.println(i);

    }
    divisible = 0;
    }
}
}
