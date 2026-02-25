package com.example.demo.person.list.controller;

import com.example.demo.person.list.controller.dto.PersonListDto;
import com.example.demo.person.list.controller.mapper.PersonListDtoMapper;
import com.example.demo.person.list.usecase.PersonListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonListControllerImpl implements PersonListController {

  private final PersonListUseCase useCase;

  private final PersonListDtoMapper mapper;

  @Override
  @GetMapping
  public ResponseEntity<PersonListDto> getList() {
    return ResponseEntity.ok(new PersonListDto(
      this.mapper.fromDomainListToDtoList(
        this.useCase.getList()
      )
    ));
  }

}
