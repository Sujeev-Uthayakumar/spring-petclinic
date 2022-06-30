package com.sujeevuthayakumar.services;

import com.sujeevuthayakumar.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
