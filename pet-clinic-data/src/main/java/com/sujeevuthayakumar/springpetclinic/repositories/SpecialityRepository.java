package com.sujeevuthayakumar.springpetclinic.repositories;

import com.sujeevuthayakumar.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
