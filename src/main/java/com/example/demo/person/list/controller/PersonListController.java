package com.example.demo.person.list.controller;

import com.example.demo.person.Person;
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

    @GetMapping
    public ResponseEntity<List<Person>> getList() {
        return ResponseEntity.ok(
            this.useCase.getList()
        );
    }

}
