package com.sujeevuthayakumar.springpetclinic.repositories;

import com.sujeevuthayakumar.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
