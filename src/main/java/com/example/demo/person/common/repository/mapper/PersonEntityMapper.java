package com.example.demo.person.common.repository.mapper;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.common.repository.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonEntityMapper {

    List<Person> fromEntityListToDomainList(List<PersonEntity> list);

    Person fromEntityToDomain(PersonEntity entity);

    PersonEntity fromDomainToEntity(Person domain);

}
