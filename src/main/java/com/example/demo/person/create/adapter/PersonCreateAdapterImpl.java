package com.example.demo.person.create.adapter;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonRepository;
import com.example.demo.person.repository.mapper.PersonEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonCreateAdapterImpl implements PersonCreateAdapter {

    private final PersonRepository repository;

    private final PersonEntityMapper mapper;

    @Override
    public Person create(Person domain) {
        return mapper.fromEntityToDomain(
            repository.save(
                mapper.fromDomainToEntity(domain)));
    }

}
