package com.cjvisions.sfg_pet_clinic.services;

import com.cjvisions.sfg_pet_clinic.model.Owner;

import java.util.Set;

public interface OwnerService {

   Owner findById(Owner id);

   Owner findByLastName(String lastName);

   Owner save(Owner owner);

   Set<Owner> findAll();
}
