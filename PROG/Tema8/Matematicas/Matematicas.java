package Tema8.Matematicas;

public class Matematicas {
	public static boolean esCapicua(int numero) {
		int primer_digito = 0;
		int segundo_digito = 0;
		int tercer_digito = 0;
		int cuarto_digito = 0;
		int quinto_digito = 0;
		int numero_cifras = 0;
		boolean capicua = false;

		if ((numero >= 10) && (numero <= 99)) {
			numero_cifras = 2;
		} else if ((numero >= 100) && (numero <= 999)) { // Si tiene 3 cifras
			numero_cifras = 3;
		} else if ((numero >= 1000) && (numero <= 9999)) { // Si tiene 4 cifras
			numero_cifras = 4;
		} else if ((numero >= 10000) && (numero <= 99999)) { // Si tiene 5 cifras
			numero_cifras = 5;
		}

		switch (numero_cifras) {
			case 2:
				primer_digito = (int) (numero / 10);
				segundo_digito = numero % 10;

				if (primer_digito == segundo_digito) {
					capicua = true;
				}
				break;

			case 3:
				primer_digito = (int) (numero / 100);
				tercer_digito = numero % 10;

				if (primer_digito == tercer_digito) {
					capicua = true;
				}
				break;

			case 4:
				primer_digito = (int) (numero / 1000);
				segundo_digito = (int) ((numero % 1000) / 100);
				tercer_digito = (int) ((numero % 100) / 10);
				cuarto_digito = numero % 10;

				if ((primer_digito == cuarto_digito) && (segundo_digito == tercer_digito)) {
					capicua = true;
				}
				break;

			case 5:
				primer_digito = (int) (numero / 10000);
				segundo_digito = (int) ((numero % 10000) / 1000);
				cuarto_digito = (int) ((numero % 100) / 10);
				quinto_digito = numero % 10;

				if ((primer_digito == quinto_digito) && (segundo_digito == cuarto_digito)) {
					capicua = true;
				}
				break;
		}

		if ((numero_cifras < 2) || (numero_cifras > 5)) {
			System.out.println("Introduzca un valor correcto");
		} else {
			if (capicua) {
				return true;
			} else {
				return false;
			}
		}
	}
}
