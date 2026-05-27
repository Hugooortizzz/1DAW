package personajes;

import java.util.ArrayList;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugom
 */
public class Personaje {
    private String nombre;
    private String[] estiloCombate;
    private int poder;
    private String imagen;

    public Personaje() {
    }

    
    
    public Personaje(String nombre, String[] estiloCombate, int poder, String imagen) {
        this.nombre = nombre;
        this.estiloCombate = estiloCombate;
        this.poder = poder;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEstiloCombate() {
        return estiloCombate;
    }
    
    public String mostrarEstiloCombate() {
        String resultado = "";
        
        for (int i=0; i < this.estiloCombate.length; i++){
            resultado += this.estiloCombate[i];
            if (i < this.estiloCombate.length - 1){
                resultado += " | ";
            }
        }
        
        return resultado;
    }

    public void setEstiloCombate(String[] estiloCombate) {
        this.estiloCombate = estiloCombate;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personaje other = (Personaje) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    

   
    
    
    
}
