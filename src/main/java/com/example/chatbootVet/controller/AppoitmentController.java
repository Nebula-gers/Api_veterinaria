package com.example.chatbootVet.controller;

import com.example.chatbootVet.model.Appoitment;
import com.example.chatbootVet.service.AppoitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/citas")
public class AppoitmentController {

    @Autowired
    private AppoitmentService appoitmentService;

    @PostMapping("/crear")
    public Appoitment createAppoitment(@RequestBody Appoitment appoitment) {
        return appoitmentService.saveAppoitment(appoitment);
        }

        @GetMapping("/obtener")
        public List<Appoitment> getAllAppoitments() {
            return appoitmentService.getAllAppoitments();
        }
        @GetMapping("/buscar/{id}")
        public Optional<Appoitment> findAppoitmentById(@PathVariable Long id) {
            return appoitmentService.getAppoitmentById(id);
        }
        @DeleteMapping("/borrar/{id}")
        public String deleteAppoitment(@RequestParam Long id) {
            appoitmentService.deleteAppoitment(id);
            return "Cita eliminada";
        }
    }
