package com.example.demo.person.common.controller.dto;

import java.time.LocalDate;

public record PersonDto(
    String id,
    String name,
    String lastName,
    LocalDate birthdate
) {}
