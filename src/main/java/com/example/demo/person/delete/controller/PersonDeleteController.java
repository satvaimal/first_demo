package com.example.demo.person.delete.controller;

import com.example.demo.person.common.domain.Person;
import com.example.demo.person.delete.usecase.PersonDeleteUseCase;
import com.example.demo.person.detail.usecase.PersonDetailUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/people")
@RequiredArgsConstructor
public class PersonDeleteController {

    private final PersonDeleteUseCase useCase;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        if (this.useCase.delete(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
