package com.example.demo.person.create.controller.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PersonCreateDto(
    @NotNull
    String name,

    @NotNull
    String lastName,

    @NotNull
    LocalDate birthdate
) {}
