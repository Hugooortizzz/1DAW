import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] mesa = new int[10];
        int ocupacion_total = 0;
        int grupo = 0;
        int contador;
        boolean disponible = false;
        boolean espacio_restaurante = true;

        Scanner s = new Scanner(System.in);

        System.out.print("Mesa nº\t\t");
        for (int i=0; i<mesa.length; i++){
            System.out.print((i+1) + "\t");
        }

        System.out.println();

        System.out.print("Ocupación\t");
        for (int j=0; j<mesa.length; j++){
            System.out.print(mesa[j] + "\t");
        }

        System.out.println();

        

        while (grupo != -1){
            disponible = false;
            contador = 0;

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            grupo = s.nextInt();

            while (grupo<-1 ||grupo == 0 || grupo>4){
                System.out.println("Lo siento, los grupos deben ser de entre 1 y 4 personas");
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                grupo = s.nextInt();
            }

            if (grupo + ocupacion_total > 40){
                System.out.println("Lo siento, ahora mismo no queda sitio");
            }else if (grupo == -1){

            }else{
                while (!disponible){
                    for (int k=contador; k<contador+1; k++){
                        if (mesa[k] + grupo <= 4){
                            disponible = true;
                            if (mesa[k] == 0){
                                System.out.println("Por favor, siéntese en la mesa número " + (k+1));
                            }else{
                                System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa número " + (k+1));
                            }
                            mesa[k] += grupo;
                            ocupacion_total += grupo;
                        }
                    }
                    contador++;
                }
            }

            System.out.print("Mesa nº\t\t");
            for (int i=0; i<mesa.length; i++){
                System.out.print((i+1) + "\t");
            }

            System.out.println();

            System.out.print("Ocupación\t");
            for (int j=0; j<mesa.length; j++){
                System.out.print(mesa[j] + "\t");
            }

            System.out.println();
        

        
        }
    }
    
}
