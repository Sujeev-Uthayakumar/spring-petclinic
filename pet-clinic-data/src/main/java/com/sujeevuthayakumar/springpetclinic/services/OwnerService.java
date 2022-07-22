package com.sujeevuthayakumar.services;

import com.sujeevuthayakumar.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
