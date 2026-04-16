package Ejercicio10;

public class AgendaContactos {
    private Contacto[] agendaContactos;
    private static int contactosAñadidos = 0;

    public AgendaContactos(Contacto[] agendaContactos) {
        this.agendaContactos = agendaContactos;
    }

    public AgendaContactos() {
        this.agendaContactos = new Contacto[10];
    }

    public void añadirContacto(Contacto c){
        if (contactosAñadidos >= agendaContactos.length){
            System.out.println("No se pueden añadir más contactos a la agenda");
        }else{
            if(existeContacto(c)){
                System.out.println("El contacto ya existe en la agenda");
            }else{
                agendaContactos[contactosAñadidos] = c;
                System.out.println(c.getNombre() + " añadido a la agenda de contactos");
            }
        }
    }

    public boolean existeContacto(Contacto c){
        boolean existe = false;

        for (int i = 0; i < contactosAñadidos; i++) {
            if (c.getNombre() == agendaContactos[i].getNombre()){
                existe = true;
            }
        }

        return existe;
    }

    public void listarContacto(){
        for (int i = 0; i < contactosAñadidos; i++) {
            System.out.println(agendaContactos[i].toString());
        }
    }

    public void buscarContacto(String nombre){
        for (int i = 0; i < contactosAñadidos; i++) {
            if (agendaContactos[i].getNombre() == nombre){
                agendaContactos[i].toString();
            }
        }
    }

    public void eliminaContacto(Contacto c){
        if (existeContacto(c)){
            for (int i = 0; i < contactosAñadidos; i++) {
                if(agendaContactos[i] == c){
                    if(i != contactosAñadidos-1){
                        for (int j = i; j < contactosAñadidos; j++) {
                            agendaContactos[j-1] = agendaContactos[j];
                        }
                    }else {
                        agendaContactos[i] = null;
                    }

                    contactosAñadidos --;
                }

            }
        }else{
            System.out.println("Ese contacto no existe");
        }
    }

    public boolean agendaLlena(){
        boolean llena = false;

        if (contactosAñadidos == agendaContactos.length){
            llena = true;
            System.out.println("La agenda está llena");
        }else{
            System.out.println("La agenda no está llena");
        }

        return llena;
    }
}

