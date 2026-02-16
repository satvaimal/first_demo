package com.example.demo.person.create.controller.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.create.controller.dto.PersonCreateDto;
import org.springframework.stereotype.Component;

@Component
public class PersonCreateDtoMapperImpl implements PersonCreateDtoMapper {

    @Override
    public Person fromCreateDtoToDomain(PersonCreateDto dto) {
        return new Person(
        null,
            dto.name(),
            dto.lastName(),
            dto.birthdate()
        );
    }

}
