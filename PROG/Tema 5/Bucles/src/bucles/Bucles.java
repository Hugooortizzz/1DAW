/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author hugom
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    	public static void main (String[] args) {
		
		int limite = 5;
		
		for (int i = 0; i<limite; i++){ //capitan
			for (int j = 0; j < limite - i; j++){ //subordinados
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
