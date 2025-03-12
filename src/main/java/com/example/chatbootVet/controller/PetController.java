package com.example.chatbootVet.controller;


import com.example.chatbootVet.model.Pet;
import com.example.chatbootVet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pets")
public class PetController {


    @Autowired
    private PetService petService;

    @GetMapping("/obtener")
    public List<Pet> getAllPets(){
        return petService.getAllPets();
    }

    @PostMapping("/crear")
    public Pet createPet(@RequestBody Pet pet) {
        return petService.savePet(pet);
    }
    @DeleteMapping("/borrar/{id}")
    public String deletePet(@RequestParam Long id){
        petService.deletePet(id);
        return "Pet eliminado";
    }
    @GetMapping("/buscar/{id}")
    public Pet findPetById(@PathVariable Long id){
        return petService.getPetById(id).get();
    }



}
