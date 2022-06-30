package com.sujeevuthayakumar.services;

import com.sujeevuthayakumar.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
