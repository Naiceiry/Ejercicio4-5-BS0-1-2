package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    Interface createPersonService;
    @GetMapping("/getpersona")
    Interface getControlador2(){
        System.out.println("Controlador 2");

        createPersonService.setAge(createPersonService.getAge()*2);
        return createPersonService;
    }
}