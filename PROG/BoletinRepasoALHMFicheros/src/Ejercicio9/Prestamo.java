package Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Prestamo {
    private String material;
    private String persona;
    private String devuelto;

    public Prestamo(String material, String persona, String devuelto) {
        this.devuelto = devuelto;
        this.material = material;
        this.persona = persona;
    }

    public static ArrayList<String> materialesNoDevueltos(ArrayList<Prestamo> prestamos){
        ArrayList<String> noDevueltos = new ArrayList<>();

        for(Prestamo p : prestamos){
            if(p.getDevuelto().equals("NO")){
                noDevueltos.add(p.getMaterial());
            }
        }

        return noDevueltos;
    }

    public static HashMap<String, Integer> pendientesPorPersona(ArrayList<Prestamo> prestamos){
        HashMap<String, Integer> pendientes = new HashMap<>();

        for(Prestamo p : prestamos){
            if (p.getDevuelto().equals("NO")){
                if(!pendientes.containsKey(p.getPersona())){
                    pendientes.put(p.getPersona(), 1);
                }else{
                    pendientes.put(p.getPersona(), pendientes.get(p.getPersona()) + 1);
                }
            }
        }

        return pendientes;
    }

    public static ArrayList<String> personasConAviso(ArrayList<Prestamo> prestamos){
        HashMap<String, Integer> pendientes = pendientesPorPersona(prestamos);
        ArrayList<String> avisos = new ArrayList<>();

        for(Map.Entry pareja : pendientes.entrySet()){
            if((Integer) pareja.getValue() >= 2){
                avisos.add((String) pareja.getKey());
            }
        }

        Collections.sort(avisos);

        return avisos;
    }

    public String getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(String devuelto) {
        this.devuelto = devuelto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }
}
