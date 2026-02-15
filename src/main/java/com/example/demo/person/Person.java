package com.example.demo.person;

import java.time.LocalDate;

public record Person(
    String id,
    String name,
    String lastName,
    LocalDate birthday) {}
