package com.example.sistemaitbm_reg.persona;

public class Carrera {
   private String nombre;
   private String estado;
   private String tipo;
   private int rango;

    public Carrera(String nombre, String estado, String tipo, int rango) {
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
        this.rango = rango;
    }

    //get nad set
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
