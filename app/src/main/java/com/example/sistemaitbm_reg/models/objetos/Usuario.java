package com.example.sistemaitbm_reg.Models;

public class Usuario extends Persona{
    private String password;
    private int privilegio;
    private int intentos;
    private String estado;
    private String fecha_registro;
    private String ruta;

    public Usuario(String name, String lastNameMother, String lasNamefather, int ci, int age, String password, int privilegio, int intentos, String estado, String fecha_registro, String ruta) {
        super(name, lastNameMother, lasNamefather, ci, age);
        this.password = password;
        this.privilegio = privilegio;
        this.intentos = intentos;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
        this.ruta = ruta;
    }

    //set and get

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(int privilegio) {
        this.privilegio = privilegio;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void login() {

    }
}
