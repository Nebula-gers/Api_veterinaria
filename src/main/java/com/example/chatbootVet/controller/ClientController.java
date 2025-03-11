package com.example.chatbootVet.controller;

import com.example.chatbootVet.model.Client;
import com.example.chatbootVet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/crear")
    public Client createUser(@RequestBody Client user) {
        return clientService.saveUser(user);
    }

    // 🔹 Obtener todos los usuarios
    @GetMapping("/obtener")
    public List<Client> getAllUsers() {
        return clientService.getAllUsers();
    }




}
