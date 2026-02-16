package com.example.demo.person.list.usecase;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.list.adapter.PersonListAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonListUseCaseImpl implements PersonListUseCase {

    private final PersonListAdapter adapter;

    @Override
    public List<Person> getList() {
        return this.adapter.getList();
    }

}
