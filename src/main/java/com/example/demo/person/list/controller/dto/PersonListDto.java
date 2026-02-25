package com.example.demo.person.list.controller.dto;

import com.example.demo.common.controller.dto.ListDto;
import com.example.demo.person.common.controller.dto.PersonDto;

import java.util.List;

public class PersonListDto extends ListDto<PersonDto> {

  public PersonListDto(List<PersonDto> items) {
    super(items);
  }

}
