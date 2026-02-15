package com.example.demo.person.repository;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
public class PersonRepositoryImpl implements PersonRepository {

    private Map<UUID, PersonEntity> map = Map.of(
        UUID.randomUUID(), this.getPersonEntity(),
        UUID.randomUUID(), this.getPersonEntity()
    );

    @Override
    public List<PersonEntity> list() {
        return map.values().stream().toList();
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
