package com.example.chatbootVet.service;

import com.example.chatbootVet.model.Persona;
import com.example.chatbootVet.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public Persona saveUser(Persona user) {
        return personaRepository.save(user);
    }

    public List<Persona> getAllUsers() {
        return personaRepository.findAll();
    }


    public Optional<Persona> getUserById(Long id) {
        return personaRepository.findById(id);
    }


    public void deleteUser(Long id) {
        personaRepository.deleteById(id);
    }
}
