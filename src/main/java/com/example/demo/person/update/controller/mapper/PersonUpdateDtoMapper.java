package com.example.demo.person.update.controller.mapper;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.update.controller.dto.PersonUpdateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonUpdateDtoMapper {

    @Mapping(target = "id", ignore = true)
    Person fromUpdateDtoToDomain(PersonUpdateDto dto);

}
