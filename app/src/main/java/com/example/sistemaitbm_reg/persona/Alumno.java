package com.example.sistemaitbm_reg.persona;

public class Alumno extends Persona{
    private String address;
    private int bachelorCode;
    private String depositCode;

    public Alumno(String name, String lastNameMother, String lasNamefather, int ci, int age, String address, int bachelorCode, String depositCode) {
        super(name, lastNameMother, lasNamefather, ci, age);
        this.address = address;
        this.bachelorCode = bachelorCode;
        this.depositCode = depositCode;
    }

    @Override
    public void getNote() {

    }
}
