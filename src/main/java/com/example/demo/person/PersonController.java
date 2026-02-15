package com.example.demo.person;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello, World!");
    }

}
