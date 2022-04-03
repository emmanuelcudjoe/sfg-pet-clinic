package com.cjvisions.sfg_pet_clinic.services;

import com.cjvisions.sfg_pet_clinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Vet id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
