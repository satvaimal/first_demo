package com.example.demo.person.list.adapter;

import com.example.demo.person.Person;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Component
public class PersonListAdapterImpl implements PersonListAdapter {

    @Override
    public List<Person> getList() {
        return List.of(
            this.getPerson(),
            this.getPerson()
        );
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
