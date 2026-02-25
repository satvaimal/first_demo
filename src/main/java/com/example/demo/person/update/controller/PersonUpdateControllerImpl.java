package com.example.demo.person.update.controller;

import com.example.demo.person.common.controller.dto.PersonDto;
import com.example.demo.person.common.controller.dto.mapper.PersonDtoMapper;
import com.example.demo.person.update.controller.dto.PersonUpdateDto;
import com.example.demo.person.update.controller.mapper.PersonUpdateDtoMapper;
import com.example.demo.person.update.usecase.PersonUpdateUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonUpdateControllerImpl implements PersonUpdateController {

  private final PersonUpdateUseCase useCase;

  private final PersonUpdateDtoMapper mapper;

  private final PersonDtoMapper dtoMapper;

  @Override
  @PutMapping("/{id}")
  public ResponseEntity<PersonDto> update(@PathVariable String id,
      @RequestBody @Valid PersonUpdateDto dto) {
    return new ResponseEntity<>(
      this.dtoMapper.fromDomainToDto(
        useCase.update(
          mapper.fromUpdateDtoToDomain(dto), id
        )
      ),
      HttpStatus.OK
    );
  }

}
