package com.cjvisions.sfg_pet_clinic.services.map;

import com.cjvisions.sfg_pet_clinic.model.Owner;
import com.cjvisions.sfg_pet_clinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}