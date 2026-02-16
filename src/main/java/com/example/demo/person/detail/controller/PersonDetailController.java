package com.example.demo.person.detail.controller;

import com.example.demo.person.Person;
import com.example.demo.person.detail.usecase.PersonDetailUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonDetailController {

    private final PersonDetailUseCase useCase;

    @GetMapping("/{id}")
    public ResponseEntity<Person> getDetail(@PathVariable String id) {
        Person person = this.useCase.getDetail(id);
        if (person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }

}
