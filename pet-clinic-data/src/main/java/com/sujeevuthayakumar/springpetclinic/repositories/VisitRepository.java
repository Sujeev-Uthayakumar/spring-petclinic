package com.sujeevuthayakumar.springpetclinic.repositories;

import com.sujeevuthayakumar.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
