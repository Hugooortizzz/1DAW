//Implementa el control de acceso al área restringida de un programa. Se debe
//pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
// el programa dirá “Ha accedido al área restringida”. El
//usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
//el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
//de usuario con sus correspondientes contraseñas deben estar almacenados
//en una estructura de la clase HashMap.

package Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> credenciales = new HashMap<String, String>();
        Scanner s = new Scanner(System.in);
        int oportunidades = 3;
        boolean accedido = false;
        String usuario;

        credenciales.put("Hugo", "hugocontraseña");

        while (oportunidades > 0){
            System.out.println("Nombre de usuario: ");
            usuario = s.nextLine();
            System.out.println("Contraseña: ");
            if (credenciales.get(usuario).equals(s.next())){
                System.out.print("Ha accdedido al área restringida");
                accedido = true;
                oportunidades = 0;

            }else{
                System.out.println("Credenciales incorrectas");
                oportunidades --;
            }
            s.nextLine();
        }

        if (!accedido){
            System.out.println("No tienes acceso al área restringida");
        }
    }
}
