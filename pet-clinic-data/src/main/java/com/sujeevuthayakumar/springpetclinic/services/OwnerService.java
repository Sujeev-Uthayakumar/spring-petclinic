package com.sujeevuthayakumar.springpetclinic.services;

import com.sujeevuthayakumar.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
