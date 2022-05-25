package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class servicio {
    int edad;
    String nombre;
    String poblacion;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}