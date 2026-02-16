package com.example.demo.person.common.repository;

import java.util.List;
import java.util.UUID;

public interface PersonRepository {

    List<PersonEntity> list();

    PersonEntity findById(UUID id);

    PersonEntity save(PersonEntity entity);

}
