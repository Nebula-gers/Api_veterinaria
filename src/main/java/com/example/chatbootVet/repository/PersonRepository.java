package com.example.chatbootVet.repository;


import com.example.chatbootVet.model.Person;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByCorreo(String correo);

    Boolean existsByCorreo(String correo);
}
