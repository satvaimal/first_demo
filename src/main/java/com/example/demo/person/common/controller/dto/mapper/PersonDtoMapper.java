package com.example.demo.person.common.controller.dto.mapper;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.common.controller.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonDtoMapper {

    PersonDto fromDomainToDto(Person domain);

}
