package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**En Controlador1, en la URL /controlador1/addPersona, tipo GET,
 en los headers tiene que recibir, el nombre, población y edad.
*/
@Service
@RestController
public class Controlador1 {
    @Autowired
    servicio persona;

    @GetMapping("/addPersona")
    public servicio getPersona(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion, @RequestHeader("edad") int edad){
        persona.setNombre(nombre);
        persona.setPoblacion(poblacion);
        persona.setEdad(edad);
        return persona;
    }

 }

