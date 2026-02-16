package com.example.demo.person.detail.adapter;

import com.example.demo.person.Person;
import com.example.demo.person.repository.PersonRepository;
import com.example.demo.person.repository.mapper.PersonEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PersonDetailAdapterImpl implements PersonDetailAdapter {

    private final PersonRepository repository;

    private final PersonEntityMapper mapper;

    @Override
    public Person getDetail(String id) {
        return this.mapper.fromEntityToDomain(
            this.repository.findById(UUID.fromString(id)));
    }

}
