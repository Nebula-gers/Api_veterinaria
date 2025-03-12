package com.example.chatbootVet.service;


import com.example.chatbootVet.model.Pet;
import com.example.chatbootVet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    public Pet savePet(Pet pet){
        return petRepository.save(pet);

    }

    public Optional<Pet> getPetById(Long id){
        return petRepository.findById(id);

    }

    public void deletePet(Long id){
         petRepository.deleteById(id);
    }
}
