package com.example.sistemaitbm_reg.Models;

public class Carrera {
    private int id;
   private String nombre;
   private String estado;
   private String tipo;
   private int rango;

    public Carrera(int id, String nombre, String estado, String tipo, int rango) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
        this.rango = rango;
    }


    //get nad set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
