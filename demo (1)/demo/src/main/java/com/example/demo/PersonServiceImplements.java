package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplements implements Interface {

    servicio person = new servicio();

    public String getNombre(){
        return person.getNombre();
    }

    public void setNombre(String nombre) {
        person.setNombre(nombre);
    }

    public String getPoblacion() {
        return person.getPoblacion();
    }

    public void setPoblacion(String poblacion) {
        person.setPoblacion(poblacion);
    }

    public int getEdad() {
        return person.getEdad();
    }
    public void setEdad(int edad) {
        person.setEdad(edad);
    }
}