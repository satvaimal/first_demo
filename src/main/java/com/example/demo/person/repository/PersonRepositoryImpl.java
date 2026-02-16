package com.example.demo.person.repository;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private Map<UUID, PersonEntity> map = new HashMap<>();

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
        System.out.println("MAP GET: " + map.get(id));
        return map.get(id);
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
