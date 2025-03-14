package com.example.chatbootVet.service;

import com.example.chatbootVet.model.Appoitment;
import com.example.chatbootVet.repository.AppoitmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppoitmentService {

    @Autowired
    private AppoitmentRepository appoitmentRepository;

    public List<Appoitment> getAllAppoitments(){
        return appoitmentRepository.findAll();

    }

    public Appoitment saveAppoitment(Appoitment appoitment){
        return appoitmentRepository.save(appoitment);
    }

    public Optional<Appoitment> getAppoitmentById(Long id){
        return appoitmentRepository.findById(id);
    }

    public void deleteAppoitment(Long id){
        appoitmentRepository.deleteById(id);
    }
}
