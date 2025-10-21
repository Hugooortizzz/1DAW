//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class Ejercicio22 {
    public static void main(String[] args) {
		int divisible = 0;
		
        for (int i = 2; i<=100; i++){ //Crea un bucle que se repetirá desde que i empieza siendo 2 hasta que valga 100
		
            for (int l = 1; l <= i; l++){ //Dentro del bucle, otro bucle dividirá todos los número que hay entre 1 e i
			if (i % l == 0){ //Y si i es divisible por ese número, se sumará uno al contador de números divisibles
				divisible ++;
			}
		}
		if (divisible <= 2){ //Si el número solo es divisible entre 2 o menos números, el número es primo y se mostrará por pantalla                                                                                                                                                                                                                                                                                                                                                                                                                                                    e por 2 o menos números, el número es primo y se mostrará por pantalla
            System.out.println(i);

    }
    divisible = 0; //Al final del primer bucle, el contador de divisibles vuelve a 0
    }
}
}
