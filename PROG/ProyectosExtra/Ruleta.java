import java.util.Scanner;
import java.util.Random;

public class Ruleta {
    public static void main(String[] args) {
        int tipo_apuesta;
        int d_apuesta; // Dinero de la apuesta
        int saldo = 0;
        int docena = 1;
        int linea = 1;
        String color = " ";
        String falta_pasa = " ";
        String apuesta;
        boolean par = false;
        boolean repetir = true;
        char sn_repetir;

        int numero;

        Random r = new Random();
        Scanner s = new Scanner(System.in);


        while (repetir) {
            par = false;
            numero = r.nextInt(37);

            switch (numero) {
                case 1:
                    color = "Rojo";
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 2:
                    color = "Negro";
                    par = true;
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 3:
                    color = "Rojo";
                    falta_pasa = "Falta";
                    break;

                case 4:
                    color = "Negro";
                    par = true;
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 5:
                    color = "Rojo";
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 6:
                    color = "Negro";
                    par = true;
                    falta_pasa = "Falta";
                    break;

                case 7:
                    color = "Rojo";
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 8:
                    color = "Negro";
                    par = true;
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 9:
                    color = "Rojo";
                    falta_pasa = "Falta";
                    break;

                case 10:
                    color = "Negro";
                    par = true;
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 11:
                    color = "Negro";
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 12:
                    color = "Rojo";
                    par = true;
                    falta_pasa = "Falta";
                    break;

                case 13:
                    color = "Negro";
                    docena = 2;
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 14:
                    color = "Rojo";
                    par = true;
                    docena = 2;
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 15:
                    color = "Negro";
                    docena = 2;
                    falta_pasa = "Falta";
                    break;

                case 16:
                    color = "Rojo";
                    par = true;
                    docena = 2;
                    falta_pasa = "Falta";
                    linea = 3;
                    break;

                case 17:
                    color = "Negro";
                    docena = 2;
                    falta_pasa = "Falta";
                    linea = 2;
                    break;

                case 18:
                    color = "Rojo";
                    par = true;
                    docena = 2;
                    falta_pasa = "Falta";
                    break;

                case 19:
                    color = "Rojo";
                    docena = 2;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 20:
                    color = "Negro";
                    par = true;
                    docena = 2;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 21:
                    color = "Rojo";
                    docena = 2;
                    falta_pasa = "Pasa";
                    break;

                case 22:
                    color = "Negro";
                    par = true;
                    docena = 2;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 23:
                    color = "Rojo";
                    docena = 2;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 24:
                    color = "Negro";
                    par = true;
                    docena = 2;
                    falta_pasa = "Pasa";
                    break;

                case 25:
                    color = "Rojo";
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 26:
                    color = "Negro";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 27:
                    color = "Rojo";
                    docena = 3;
                    falta_pasa = "Pasa";
                    break;

                case 28:
                    color = "Negro";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 29:
                    color = "Negro";
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 30:
                    color = "Rojo";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    break;

                case 31:
                    color = "Negro";
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 32:
                    color = "Rojo";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 33:
                    color = "Negro";
                    docena = 3;
                    falta_pasa = "Pasa";
                    break;

                case 34:
                    color = "Rojo";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 3;
                    break;

                case 35:
                    color = "Negro";
                    docena = 3;
                    falta_pasa = "Pasa";
                    linea = 2;
                    break;

                case 36:
                    color = "Rojo";
                    par = true;
                    docena = 3;
                    falta_pasa = "Pasa";
                    break;
            }

            System.out.print("¿Cuánto quieres apostar?: ");
            d_apuesta = s.nextInt();

            System.out.println("¿Qué tipo de apuesta quieres realizar? (1-7)");
            System.out.println("1.- Rojo / Negro");
            System.out.println("2.- Par / Impar");
            System.out.println("3.- Falta (1-18) / Pasa (19-36)");
            System.out.println("4.- Docena / Columna");
            System.out.println("5.- Transversal (Línea)");
            System.out.println("6.- Pleno (1 número)");
            tipo_apuesta = s.nextInt();
            System.out.println("------------------------------------------------");

            switch (tipo_apuesta) {
                // Apuestas de Rojo o Negro
                case 1:
                    System.out.print("¿Quieres apostar al rojo o al negro?: ");
                    apuesta = s.next();

                    switch (apuesta) {
                        case "rojo":
                        case "Rojo":
                        case "ROJO":
                            if (color == "Rojo") {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + color
                                        + ",  por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.println("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + color
                                        + ", por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;

                        case "negro":
                        case "Negro":
                        case "NEGRO":
                            if (color == "Negro") {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + color + ",  por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.print("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + color + ", por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;
                    }
                    break;

                // Apuestas de Par o Impar
                case 2:
                    System.out.print("¿Quieres apostar a par o a impar?: ");
                    apuesta = s.next();

                    switch (apuesta) {
                        case "par":
                        case "Par":
                        case "PAR":
                            if (par) {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es par, por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.println("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es impar, por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;

                        case "impar":
                        case "Impar":
                        case "IMPAR":
                            if (par == false) {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println(
                                        "El número " + numero + " es impar,  por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.println("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out
                                        .println("El número " + numero + " es par, por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;
                    }
                    break;

                // Apuestas de Falta o Pasa
                case 3:
                    System.out.print("¿Quieres apostar a falta (1-18) o a pasa (19-36)?: ");
                    apuesta = s.next();

                    switch (apuesta) {
                        case "falta":
                        case "Falta":
                        case "FALTA":
                            if (falta_pasa == "Falta") {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + falta_pasa + ",  por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.println("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + falta_pasa + ", por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;

                        case "pasa":
                        case "Pasa":
                        case "PASA":
                            if (color == "Pasa") {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + falta_pasa + ",  por lo que has ganado la apuesta.");
                                System.out.println("Has ganado " + d_apuesta + " * 2 = " + (d_apuesta * 2));
                                saldo += d_apuesta * 2;
                                System.out.println("Saldo actual: " + saldo);
                            } else {
                                System.out.println("Ha salido el número " + numero);
                                System.out.println("El número " + numero + " es " + falta_pasa + ", por lo que has perdido la apuesta.");
                                System.out.println("Has perdido " + d_apuesta);
                                saldo -= d_apuesta;
                                System.out.println("Saldo actual: " + saldo);
                            }
                            break;
                    }
                    break;

                    // Apuestas de Falta o Pasa
                    case 4:
                        System.out.print("¿A qué docena quieres apostar (1, 2 o 3)?: ");
                        apuesta = s.next();

                        if (docena == Integer.parseInt(apuesta) ) {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("El número " + numero + " pertenece a la docena " + docena + ",  por lo que has ganado la apuesta.");
                            System.out.println("Has ganado " + d_apuesta + " * 3 = " + (d_apuesta * 3));
                            saldo += d_apuesta * 3;
                            System.out.println("Saldo actual: " + saldo);
                        } else {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("El número " + numero + " pertenece a la docena " + docena + ", por lo que has perdido la apuesta.");
                            System.out.println("Has perdido " + d_apuesta);
                            saldo -= d_apuesta;
                            System.out.println("Saldo actual: " + saldo);
                            }
                    break;

                    //Apuesta de Línea
                    case 5:
                        System.out.print("¿A qué línea quieres apostar (1, 2 o 3)?: ");
                        apuesta = s.next();

                        if (linea == Integer.parseInt(apuesta) ) {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("El número " + numero + " pertenece a la línea " + linea + ",  por lo que has ganado la apuesta.");
                            System.out.println("Has ganado " + d_apuesta + " * 12 = " + (d_apuesta * 12));
                            saldo += d_apuesta * 12;
                            System.out.println("Saldo actual: " + saldo);
                        } else {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("El número " + numero + " pertenece a la línea " + linea + ", por lo que has perdido la apuesta.");
                            System.out.println("Has perdido " + d_apuesta);
                            saldo -= d_apuesta;
                            System.out.println("Saldo actual: " + saldo);
                            }
                    break;

                    //Apuesta de Línea
                    case 6:
                        System.out.print("¿A qué número quieres apostar?: ");
                        apuesta = s.next();

                        if (numero == Integer.parseInt(apuesta) ) {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("Has ganado " + d_apuesta + " * 12 = " + (d_apuesta * 36));
                            saldo += d_apuesta * 36;
                            System.out.println("Saldo actual: " + saldo);
                        } else {
                            System.out.println("Ha salido el número " + numero);
                            System.out.println("Has perdido " + d_apuesta);
                            saldo -= d_apuesta;
                            System.out.println("Saldo actual: " + saldo);
                            }
                    break;


                        }
                        
                        System.out.println("¿Quiéres seguir apostando? (S/N)");
                        sn_repetir = s.next().charAt(0);
                        if ((sn_repetir == 'N') || (sn_repetir == 'n')){
                            repetir = false;
                        }

                      

                }

                if (saldo >= 0){
                    System.out.println("Has ganado " + saldo);
                }else{
                    System.out.println("Has perdido " + (saldo * -1));
                }

                

            }

        }

    

