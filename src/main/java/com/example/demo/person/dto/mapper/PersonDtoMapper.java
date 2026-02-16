package com.example.demo.person.dto.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonDtoMapper {

    PersonDto fromDomainToDto(Person domain);

}
