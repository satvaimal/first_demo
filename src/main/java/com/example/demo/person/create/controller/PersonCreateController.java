package com.example.demo.person.create.controller;

import com.example.demo.person.Person;
import com.example.demo.person.create.controller.dto.PersonCreateDto;
import com.example.demo.person.create.controller.mapper.PersonCreateDtoMapper;
import com.example.demo.person.create.usecase.PersonCreateUseCase;
import com.example.demo.person.dto.PersonDto;
import com.example.demo.person.dto.mapper.PersonDtoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonCreateController {

    private final PersonCreateUseCase useCase;

    private final PersonCreateDtoMapper mapper;

    private final PersonDtoMapper dtoMapper;

    @PostMapping
    public ResponseEntity<PersonDto> create(@RequestBody @Valid PersonCreateDto dto) {
        return new ResponseEntity<>(
            this.dtoMapper.fromDomainToDto(
                useCase.create(
                    mapper.fromCreateDtoToDomain(dto)
                )
            ),
            HttpStatus.CREATED
        );
    }

}
