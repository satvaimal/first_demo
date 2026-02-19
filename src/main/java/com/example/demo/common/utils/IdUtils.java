package com.example.demo.common.utils;

import com.example.demo.common.error.MyError;
import com.example.demo.common.error.MyValidationException;

import java.util.UUID;

public class IdUtils {

  public static void validateId(String id, String errorMessagePrefix)
      throws MyValidationException {
    try {
      UUID.fromString(id);
    } catch (IllegalArgumentException e) {
      throw new MyValidationException(
          new MyError("id", errorMessagePrefix + ".id.invalid"));
    }
  }
}
