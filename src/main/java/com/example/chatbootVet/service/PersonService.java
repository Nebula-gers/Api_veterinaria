package com.example.chatbootVet.service;

import com.example.chatbootVet.model.Person;
import com.example.chatbootVet.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }


    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }


    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
