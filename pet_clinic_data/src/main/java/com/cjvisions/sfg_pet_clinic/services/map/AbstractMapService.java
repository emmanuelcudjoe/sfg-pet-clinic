package com.cjvisions.sfg_pet_clinic.services.map;

import com.cjvisions.sfg_pet_clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T t){
        if (t.getId() != null){
            if (t.getId() == null) {
                t.setId(getNextId());
            }

            map.put(t.getId(), t);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return t;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Long getNextId(){
        Long nextId = null;

        try {
           nextId = Collections.max(map.keySet()) + 1;
        } catch(NoSuchElementException e){
            nextId = 1l;
        }
        return nextId;
    }
}
