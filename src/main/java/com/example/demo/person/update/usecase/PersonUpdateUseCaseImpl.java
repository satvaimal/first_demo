package com.example.demo.person.update.usecase;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.update.adapter.PersonUpdateAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonUpdateUseCaseImpl implements PersonUpdateUseCase {

    private final PersonUpdateAdapter adapter;

    @Override
    public Person update(Person domain, String id) {
        return adapter.update(domain, id);
    }

}
