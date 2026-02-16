package com.example.demo.person.list.controller.mapper;

import com.example.demo.person.Person;
import com.example.demo.person.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonListDtoMapper {

    List<PersonDto> fromDomainListToDtoList(List<Person> domainList);

}
