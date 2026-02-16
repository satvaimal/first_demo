package com.example.demo.person.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class PersonEntity {

    private UUID id;

    private String name;

    private String lastName;

    private LocalDate birthDate;

}
