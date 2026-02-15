package com.example.demo.person;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/people")
public class PersonController {

    @GetMapping
    public ResponseEntity<Person> get() {
        return ResponseEntity.ok(this.getPerson());
    }

    private Person getPerson() {
        return new Person(
            UUID.randomUUID().toString(),
            "Bob",
            "Dole",
            LocalDate.now()
        );
    }

}
