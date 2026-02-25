package com.example.demo.person.detail.controller;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.detail.usecase.PersonDetailUseCase;
import com.example.demo.person.common.controller.dto.PersonDto;
import com.example.demo.person.common.controller.dto.mapper.PersonDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonDetailControllerImpl implements PersonDetailController {

  private final PersonDetailUseCase useCase;

  private final PersonDtoMapper mapper;

  @Override
  @GetMapping("/{id}")
  public ResponseEntity<PersonDto> getDetail(@PathVariable String id) {
    Person person = this.useCase.getDetail(id);
    if (person == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(
      this.mapper.fromDomainToDto(person)
    );
  }

}
