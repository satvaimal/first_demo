package com.example.demo.person.delete.usecase;

import com.example.demo.person.delete.adapter.PersonDeleteAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonDeleteUseCaseImpl implements PersonDeleteUseCase {

    private final PersonDeleteAdapter adapter;

    @Override
    public boolean delete(String id) {
        return adapter.delete(id);
    }

}
