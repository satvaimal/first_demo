package com.example.demo.person.repository.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonEntity;

import java.util.List;

public interface PersonEntityMapper {

    List<Person> fromEntityListToDomainList(List<PersonEntity> list);

}
