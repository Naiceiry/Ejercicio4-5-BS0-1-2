package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface Interface {

    String getNombre();
    void setNombre(String nombre);
    String getPoblacion();
    void setPoblacion(String poblacion);
    int getEdad();
    int setEdad(int edad);
}