package com.cjvisions.sfg_pet_clinic.services;

import com.cjvisions.sfg_pet_clinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Pet id);

    Pet findByLastName(String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
