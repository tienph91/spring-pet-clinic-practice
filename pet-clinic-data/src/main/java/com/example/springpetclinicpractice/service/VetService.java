package com.example.springpetclinicpractice.service;

import com.example.springpetclinicpractice.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet) ;

    Set<Vet> findAll();
}
