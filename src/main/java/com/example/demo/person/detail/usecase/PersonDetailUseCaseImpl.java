package com.example.demo.person.detail.usecase;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.detail.adapter.PersonDetailAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonDetailUseCaseImpl implements PersonDetailUseCase {

    private final PersonDetailAdapter adapter;

    @Override
    public Person getDetail(String id) {
        return this.adapter.getDetail(id);
    }

}
