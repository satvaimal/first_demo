package com.example.demo.person.update.adapter;

import com.example.demo.common.utils.IdUtils;
import com.example.demo.person.common.domain.Person;
import com.example.demo.person.common.repository.PersonEntity;
import com.example.demo.person.common.repository.PersonRepository;
import com.example.demo.person.common.repository.mapper.PersonEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PersonUpdateAdapterImpl implements PersonUpdateAdapter {

  private final PersonRepository repository;

  private final PersonEntityMapper mapper;

  @Override
  public Person update(Person domain, String id) {
    IdUtils.validateId(id, "person");
    Optional<PersonEntity> entityOpt = repository.findById(UUID.fromString(id));
    if (entityOpt.isEmpty()) {
      return null;
    }
    PersonEntity entity = entityOpt.get();
    mapper.update(domain, entity);
    entity = repository.save(entity);
    return mapper.fromEntityToDomain(entity);
  }

}
