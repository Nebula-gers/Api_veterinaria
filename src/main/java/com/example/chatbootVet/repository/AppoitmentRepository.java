package com.example.chatbootVet.repository;

import com.example.chatbootVet.model.Appoitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppoitmentRepository extends JpaRepository<Appoitment, Long> {


}
