package com.example.sistemaitbm_reg.persona;

public abstract class Persona {

    private String name;
    private String lastNameMother;
    private String lasNamefather;
    private int ci;

    private int age;

    public Persona(String name, String lastNameMother, String lasNamefather, int ci, int age) {
        this.name = name;
        this.lastNameMother = lastNameMother;
        this.lasNamefather = lasNamefather;
        this.ci = ci;
        this.age = age;
    }
    //metodos
    public abstract void getNote();

    //get and set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNameMother() {
        return lastNameMother;
    }

    public void setLastNameMother(String lastNameMother) {
        this.lastNameMother = lastNameMother;
    }

    public String getLasNamefather() {
        return lasNamefather;
    }

    public void setLasNamefather(String lasNamefather) {
        this.lasNamefather = lasNamefather;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
