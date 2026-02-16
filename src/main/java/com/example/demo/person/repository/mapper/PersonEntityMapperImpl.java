package com.example.demo.person.repository.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonEntityMapperImpl implements PersonEntityMapper {

    @Override
    public List<Person> fromEntityListToDomainList(List<PersonEntity> list) {
        return list.stream().map(this::fromEntityToDomain).toList();
    }

    @Override
    public Person fromEntityToDomain(PersonEntity entity) {
        if (entity == null) { return null; };
        return new Person(
            entity.getId().toString(),
            entity.getName(),
            entity.getLastName(),
            entity.getBirthDate()
        );
    }

}
