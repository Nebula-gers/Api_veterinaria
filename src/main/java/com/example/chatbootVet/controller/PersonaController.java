package com.example.chatbootVet.controller;

import com.example.chatbootVet.model.Persona;
import com.example.chatbootVet.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/crear")
    public Persona createUser(@RequestBody Persona user) {
        return personaService.saveUser(user);
    }

    // 🔹 Obtener todos los usuarios
    @GetMapping("/obtener")
    public List<Persona> getAllUsers() {
        return personaService.getAllUsers();
    }




}
