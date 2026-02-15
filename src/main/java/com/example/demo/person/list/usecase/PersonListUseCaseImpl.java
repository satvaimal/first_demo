package com.example.demo.person.list.usecase;

import com.example.demo.person.Person;
import com.example.demo.person.list.adapter.PersonListAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonListUseCaseImpl implements PersonListUseCase {

    private final PersonListAdapter adapter;

    public PersonListUseCaseImpl(PersonListAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public List<Person> getList() {
        return this.adapter.getList();
    }

}
