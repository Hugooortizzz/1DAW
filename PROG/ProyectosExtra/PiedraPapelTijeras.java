import java.lang.Math;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        String jugador;
        int maquina;
        int vidas_jugador = 5;
        int vidas_maquina = 5;

        Scanner s = new Scanner(System.in);

        while ((vidas_jugador > 0) || (vidas_maquina > 0)){

            maquina = (int) (Math.random() * 3); //0 = Piedra, 1 = Papel, 2 = Tijeras
            System.out.println("Tus vidas: " + vidas_jugador);
            System.out.println("Vidas de la máquina: " + vidas_maquina);
            System.out.print("¿Qué quieres sacar? (Piedra, Papel o Tijeras): ");
            jugador = s.next();

            switch(jugador){
                case "piedra":
                case "Piedra":
                case "PIEDRA":
                switch (maquina){
                    case 0:
                    System.out.println("        *****");
                    System.out.println("     ***********");
                    System.out.println("   ***************");
                    System.out.println("  *****************");
                    System.out.println(" *******************");
                    System.out.println("*********************");
                    System.out.println("*********************");
                    System.out.println(" *******************");
                    System.out.println("  *****************");
                    System.out.println("   ***************");
                    System.out.println("     ***********");
                    System.out.println("        *****");
                    System.out.println("La máquina ha sacado piedra, habéis quedado empate");
                    break;

                    case 1:
                    System.out.println("******************************");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("******************************");
                    System.out.println("La máquina ha sacado papel, has perdido");
                    vidas_jugador --;
                    break;

                    case 2:
                    System.out.println("      \\       /");
                    System.out.println("       \\     /");
                    System.out.println("        \\   /");
                    System.out.println("         \\ /");
                    System.out.println("          X");
                    System.out.println("         / \\");
                    System.out.println("        /   \\");
                    System.out.println("       /     \\");
                    System.out.println("      /       \\");
                    System.out.println("La máquina ha sacado tijeras, has ganado");
                    vidas_maquina --;
                }
                break;

                case "papel":
                case "Papel":
                case "PAPEL":
                switch (maquina){
                    case 0:
                    System.out.println("        *****");
                    System.out.println("     ***********");
                    System.out.println("   ***************");
                    System.out.println("  *****************");
                    System.out.println(" *******************");
                    System.out.println("*********************");
                    System.out.println("*********************");
                    System.out.println(" *******************");
                    System.out.println("  *****************");
                    System.out.println("   ***************");
                    System.out.println("     ***********");
                    System.out.println("        *****");
                    System.out.println("La máquina ha sacado piedra, has ganado");
                    vidas_maquina --;
                    break;

                    case 1:
                    System.out.println("******************************");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("******************************");
                    System.out.println("La máquina ha sacado papel, habeis quedado empate");
                    break;

                    case 2:
                    System.out.println("      \\       /");
                    System.out.println("       \\     /");
                    System.out.println("        \\   /");
                    System.out.println("         \\ /");
                    System.out.println("          X");
                    System.out.println("         / \\");
                    System.out.println("        /   \\");
                    System.out.println("       /     \\");
                    System.out.println("      /       \\");
                    System.out.println("La máquina ha sacado tijeras, has perdido");
                    vidas_jugador --;
                }
                break;

                case "tijeras":
                case "Tijeras":
                case "TIJERAS":
                switch (maquina){
                    case 0:
                    System.out.println("        *****");
                    System.out.println("     ***********");
                    System.out.println("   ***************");
                    System.out.println("  *****************");
                    System.out.println(" *******************");
                    System.out.println("*********************");
                    System.out.println("*********************");
                    System.out.println(" *******************");
                    System.out.println("  *****************");
                    System.out.println("   ***************");
                    System.out.println("     ***********");
                    System.out.println("        *****");
                    System.out.println("La máquina ha sacado piedra, has perdido");
                    vidas_jugador --;
                    break;

                    case 1:
                    System.out.println("******************************");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("*                            *");
                    System.out.println("******************************");
                    System.out.println("La máquina ha sacado papel, has ganado");
                    vidas_maquina --;
                    break;

                    case 2:
                    System.out.println("      \\       /");
                    System.out.println("       \\     /");
                    System.out.println("        \\   /");
                    System.out.println("         \\ /");
                    System.out.println("          X");
                    System.out.println("         / \\");
                    System.out.println("        /   \\");
                    System.out.println("       /     \\");
                    System.out.println("      /       \\");
                    System.out.println("La máquina ha sacado tijeras, habeis empatado");
                }
                break;

                default:
                System.out.print("Introduzca un valor válido");
                break;
            }
            break;

        }
    }
}
