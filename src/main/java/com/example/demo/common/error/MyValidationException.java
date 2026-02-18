package com.example.demo.common.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MyValidationException extends RuntimeException {

  private final MyError error;

}
