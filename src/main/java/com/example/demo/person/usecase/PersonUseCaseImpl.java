package com.example.demo.person.usecase;

import com.example.demo.person.Person;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class PersonUseCaseImpl implements PersonUseCase {

    @Override
    public Person get() {
        return new Person(
            UUID.randomUUID().toString(),
            "Bob",
            "Dole",
            LocalDate.now()
        );
    }

}
