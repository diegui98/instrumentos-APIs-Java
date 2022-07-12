
package com.practica.Instrumentos.Model;


public class Instrumento {
    
    private int id;
    private String nombre;
    private String tipo;
    private String material;

    public Instrumento(int id, String nombre, String tipo, String material) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}
