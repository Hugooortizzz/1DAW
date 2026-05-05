import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File downloads = new File("/home/hugo/Downloads");
        File fichero;
        Scanner s = new Scanner(System.in);

        String[] listaArchivos = downloads.list();

        for (int i = 0; i < listaArchivos.length; i++) {
            fichero = new File(listaArchivos[i]);

            System.out.println("¿Desea borrar el archivo " + listaArchivos[i] + "?[s/n]: ");

            switch(s.next().charAt(0)){
                case 's':
                    fichero.delete();
                    break;
            }
        }


    }
}