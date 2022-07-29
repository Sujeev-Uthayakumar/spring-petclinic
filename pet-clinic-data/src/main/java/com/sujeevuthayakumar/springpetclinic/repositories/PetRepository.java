package com.sujeevuthayakumar.springpetclinic.repositories;

import com.sujeevuthayakumar.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
