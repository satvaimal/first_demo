package com.example.demo.person.update.controller.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PersonUpdateDto(
  @NotNull(message = "person.name.null")
  @Size(min = 1, max = 100, message = "person.name.size.error")
  String name,

  @NotNull(message = "person.lastName.null")
  @Size(min = 1, max = 100, message = "person.lastName.size.error")
  String lastName,

  @NotNull(message = "person.birthdate.null")
  LocalDate birthdate
) {}
