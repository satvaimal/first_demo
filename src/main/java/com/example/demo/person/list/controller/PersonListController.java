package com.example.demo.person.list.controller;

import com.example.demo.person.common.controller.dto.PersonDto;
import com.example.demo.person.list.controller.mapper.PersonListDtoMapper;
import com.example.demo.person.list.usecase.PersonListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonListController {

    private final PersonListUseCase useCase;

    private final PersonListDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<PersonDto>> getList() {
        return ResponseEntity.ok(
            this.mapper.fromDomainListToDtoList(
                this.useCase.getList()
            )
        );
    }

}
