package com.example.demo;


public class PersonaModel {

    private String name;
    private String poblacion;
    private int edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" +
                "name='" + name + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", edad=" + (edad+1) +
                '}';
    }
}
