package com.example.chatbootVet.controller;

import com.example.chatbootVet.model.Person;
import com.example.chatbootVet.service.PersonService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonController {

    private final PersonService personService;

    
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/crear")
    public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person) {
        return ResponseEntity.ok(personService.savePerson(person));
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPerson());
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Person> findPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }
}
