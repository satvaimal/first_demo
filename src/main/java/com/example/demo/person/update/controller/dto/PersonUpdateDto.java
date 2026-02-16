package com.example.demo.person.update.controller.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PersonUpdateDto(
    @NotNull
    @Size(min = 1, max = 100)
    String name,

    @NotNull
    @Size(min = 1, max = 100)
    String lastName,

    @NotNull
    LocalDate birthdate
) {}
