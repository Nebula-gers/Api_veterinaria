package com.example.chatbootVet.repository;

import com.example.chatbootVet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository <Pet, Long>{

}
