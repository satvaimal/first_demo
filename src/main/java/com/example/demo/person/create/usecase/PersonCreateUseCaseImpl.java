package com.example.demo.person.create.usecase;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.create.adapter.PersonCreateAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonCreateUseCaseImpl implements PersonCreateUseCase {

    private final PersonCreateAdapter adapter;

    @Override
    public Person create(Person domain) {
        return adapter.create(domain);
    }

}
