package com.example.demo.person.update.usecase;

import com.example.demo.person.common.domain.Person;

public interface PersonUpdateUseCase {

    Person update(Person domain, String id);

}
