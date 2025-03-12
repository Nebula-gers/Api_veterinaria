package com.example.chatbootVet.controller;

import com.example.chatbootVet.model.Person;
import com.example.chatbootVet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/crear")
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }


    // 🔹 Obtener todos los usuarios
    @GetMapping("/obtener")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @DeleteMapping("/borrar/{id}")
    public String deltePerson(@RequestParam Long id){
        personService.deletePerson(id);
        return "Usuario eliminado";
    }
    @GetMapping("/buscar?{id}")
    public Optional<Person> findPersonbyId(@PathVariable Long id){
        return personService.getPersonById(id);
    }




}
