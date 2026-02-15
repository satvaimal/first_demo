package com.example.demo.person.list.adapter;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonRepository;
import com.example.demo.person.repository.mapper.PersonEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonListAdapterImpl implements PersonListAdapter {

    private final PersonRepository repository;

    private final PersonEntityMapper mapper;

    @Override
    public List<Person> getList() {
        return this.mapper.fromEntityListToDomainList(
            this.repository.list());
    }

}
