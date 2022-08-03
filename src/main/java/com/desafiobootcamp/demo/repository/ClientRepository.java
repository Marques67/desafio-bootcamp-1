package com.desafiobootcamp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiobootcamp.demo.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
