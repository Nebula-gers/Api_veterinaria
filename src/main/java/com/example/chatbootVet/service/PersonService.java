package com.example.chatbootVet.service;

import com.example.chatbootVet.model.Person;
import com.example.chatbootVet.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService implements IPersonService {

    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(@Valid Person person) {
        // Verificar si el correo ya está registrado
        if (personRepository.findByCorreo(person.getCorreo()).isPresent()) {
            throw new IllegalArgumentException("El correo ya está registrado");
        }
        return personRepository.save(person);
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    public void deletePerson(Long id) {
        if (!personRepository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar, usuario no encontrado con ID: " + id);
        }
        personRepository.deleteById(id);
    }
}
