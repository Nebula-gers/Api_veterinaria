package com.example.chatbootVet.service;

import com.example.chatbootVet.model.Client;
import com.example.chatbootVet.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public Client saveUser(Client user) {
        return clientRepository.save(user);
    }

    public List<Client> getAllUsers() {
        return clientRepository.findAll();
    }


    public Optional<Client> getUserById(Long id) {
        return clientRepository.findById(id);
    }


    public void deleteUser(Long id) {
        clientRepository.deleteById(id);
    }
}
