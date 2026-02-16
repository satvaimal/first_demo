package com.example.demo.person.create.controller.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.create.controller.dto.PersonCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonCreateDtoMapper {

    @Mapping(target = "id", ignore = true)
    Person fromCreateDtoToDomain(PersonCreateDto dto);

}
