package com.example.demo.person.list.adapter;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonEntity;
import com.example.demo.person.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonListAdapterImpl implements PersonListAdapter {

    private final PersonRepository repository;

    @Override
    public List<Person> getList() {
        return this.fromEntityListToDomainList(this.repository.list());
    }

    private List<Person> fromEntityListToDomainList(List<PersonEntity> list) {
        return list.stream().map( entity ->
            new Person(
                entity.getId().toString(),
                entity.getName(),
                entity.getLastName(),
                entity.getBirthDate()
            )
        ).toList();
    }

}
