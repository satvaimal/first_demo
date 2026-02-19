package com.example.demo.person.delete.adapter;

import com.example.demo.common.utils.IdUtils;
import com.example.demo.person.common.repository.PersonEntity;
import com.example.demo.person.common.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PersonDeleteAdapterImpl implements PersonDeleteAdapter {

  private final PersonRepository repository;

  @Override
  public boolean delete(String id) {
    IdUtils.validateId(id, "person");
    PersonEntity entity = repository.findById(UUID.fromString(id)).orElse(null);
    if (entity != null) {
      repository.delete(entity);
      return true;
    }
    return false;
  }

}
