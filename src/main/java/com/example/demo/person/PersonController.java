package com.example.demo.person;

import com.example.demo.person.usecase.PersonUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonUseCase useCase;

    public PersonController(PersonUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<Person> get() {
        return ResponseEntity.ok(
            this.useCase.get()
        );
    }

}
