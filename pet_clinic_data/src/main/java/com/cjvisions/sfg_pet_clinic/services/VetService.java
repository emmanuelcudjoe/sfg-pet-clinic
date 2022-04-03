package com.cjvisions.sfg_pet_clinic.services;

import com.cjvisions.sfg_pet_clinic.model.Pet;

import java.util.Set;

public interface VetService {

    Pet findById(Pet id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
