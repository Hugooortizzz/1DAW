package personajes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugom
 */
public class GestionPersonajes {
    private static ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    
    public static void registrarDeFichero() throws IOException{
        personajes.clear();
        BufferedReader br = new BufferedReader(new FileReader("/home/hugo/Documents/1DAW/PROG/ProyectoJSP/personajes.txt"));
        
        String linea = "";
        
        while(linea != null){
            linea = br.readLine();
            
            if(linea != null){
                String[] division = linea.split(";");
                String[] estiloCombate = division[1].split(","); 
                
                personajes.add(new Personaje(division[0], estiloCombate, Integer.parseInt(division[2]), division[3]));
            }
        }
        
        br.close();
    }
    
    public static boolean añadirPersonaje(Personaje p){
        if(!personajes.contains(p)){
            personajes.add(p);
            return true;
        }
        
        return false;
    }
    
    public static void borrarPersonaje(String nombre){
        Personaje borrar = new Personaje();
        for(Personaje p : personajes){
            if(p.getNombre().equals(nombre)){
                borrar = p;
            }
        }
        personajes.remove(borrar);
    }
    
    public static int buscarIndice(String nombre){
        for(Personaje p : personajes){
               if(p.getNombre().equals(nombre)){
                   return personajes.indexOf(p);
               }
        }
        
        return -1;
    }
    
   
    
    public static ArrayList<String> nombresPersonajes(){
        ArrayList<String> resultado = new ArrayList<>();
        
        for(Personaje p : personajes){
            resultado.add(p.getNombre());
        }
        
        return resultado;
    }

    public static ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    
    
}
