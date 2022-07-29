package com.sujeevuthayakumar.springpetclinic.repositories;

import com.sujeevuthayakumar.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
