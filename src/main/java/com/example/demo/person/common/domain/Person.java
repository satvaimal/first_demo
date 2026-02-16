package com.example.demo.person.common.domain;

import java.time.LocalDate;

public record Person(
    String id,
    String name,
    String lastName,
    LocalDate birthdate) {}
