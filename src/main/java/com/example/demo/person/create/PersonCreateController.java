package com.example.demo.person.create;

import com.example.demo.person.Person;
import com.example.demo.person.create.usecase.PersonCreateUseCase;
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

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(useCase.create(person), HttpStatus.CREATED);
    }

}
