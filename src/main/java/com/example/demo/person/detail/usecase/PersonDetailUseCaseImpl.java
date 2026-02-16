package com.example.demo.person.detail.usecase;

import com.example.demo.person.Person;
import com.example.demo.person.detail.adapter.PersonDetailAdapter;
import org.springframework.stereotype.Component;

@Component
public class PersonDetailUseCaseImpl implements PersonDetailUseCase {

    private final PersonDetailAdapter adapter;

    public PersonDetailUseCaseImpl(PersonDetailAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Person getDetail(String id) {
        return this.adapter.getDetail(id);
    }

}
