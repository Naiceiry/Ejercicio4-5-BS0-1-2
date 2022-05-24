package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    public static final String template = "Hello, %s!";

    @GetMapping("/user")
    public Greeting getHola(@RequestParam(value = "name", defaultValue = "lola")String name)
    {
        return new Greeting(String.format(template, name));
    }

    @PostMapping("/useradd")
    public String postPersona(@RequestBody PersonaModel persona){

        return persona.toString();
    }
}