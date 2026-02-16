package com.example.demo.person.create.controller.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.create.controller.dto.PersonCreateDto;

public interface PersonCreateDtoMapper {

    Person fromCreateDtoToDomain(PersonCreateDto dto);

}
