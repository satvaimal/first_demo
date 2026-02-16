package com.example.demo.person.common.repository;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private final Map<UUID, PersonEntity> map = new HashMap<>();

    public PersonRepositoryImpl() {
        for (int i = 0; i < 2; i++) {
            PersonEntity entity = this.getPersonEntity();
            map.put(entity.getId(), entity);
        }
    }

    @Override
    public List<PersonEntity> list() {
        return map.values().stream().toList();
    }

    @Override
    public PersonEntity findById(UUID id) {
        return map.get(id);
    }

    @Override
    public PersonEntity save(PersonEntity entity) {
        entity.setId(UUID.randomUUID());
        map.put(entity.getId(), entity);
        return entity;
    }

    private PersonEntity getPersonEntity() {
        return new PersonEntity(
            UUID.randomUUID(),
            "Bob",
            "Dole",
            LocalDate.now()
        );
    }

}
