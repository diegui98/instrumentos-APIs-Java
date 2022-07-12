
package com.practica.Instrumentos.DTO;

import java.io.Serializable;


public class InstruAlumDTO implements Serializable {
    
    private int id_instru;
    private String nombre_instru;
    private String nombre_alum;
    private String apellido_alum;
    
    public InstruAlumDTO(){
        
    }

    public int getId_instru() {
        return id_instru;
    }

    public void setId_instru(int id_instru) {
        this.id_instru = id_instru;
    }

    public String getNombre_instru() {
        return nombre_instru;
    }

    public void setNombre_instru(String nombre_instru) {
        this.nombre_instru = nombre_instru;
    }

    public String getNombre_alum() {
        return nombre_alum;
    }

    public void setNombre_alum(String nombre_alum) {
        this.nombre_alum = nombre_alum;
    }

    public String getApellido_alum() {
        return apellido_alum;
    }

    public void setApellido_alum(String apellido_alum) {
        this.apellido_alum = apellido_alum;
    }
    
    
    
}
