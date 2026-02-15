package com.example.demo.person.list;

import com.example.demo.person.Person;
import com.example.demo.person.list.usecase.PersonListUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/people")
public class PersonListController {

    private final PersonListUseCase useCase;

    public PersonListController(PersonListUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<Person>> get() {
        return ResponseEntity.ok(
            this.useCase.getList()
        );
    }

}
