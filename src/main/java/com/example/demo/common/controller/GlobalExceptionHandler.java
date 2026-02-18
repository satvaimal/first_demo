package com.example.demo.common.controller;

import com.example.demo.common.error.MyError;
import com.example.demo.common.error.MyErrors;
import com.example.demo.common.error.MyValidationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<MyErrors> handleValidationErrors(
      MethodArgumentNotValidException ex) {
    List<FieldError> errors = ex.getBindingResult().getFieldErrors();
    List<MyError> myErrors = new ArrayList<>();
    for ( FieldError error : errors) {
      myErrors.add(new MyError(error.getField(), error.getDefaultMessage()));
    }
    return new ResponseEntity<>(getErrorsMap(myErrors), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MyValidationException.class)
  public ResponseEntity<MyErrors> handleValidationErrors(
      MyValidationException ex) {
    List<MyError> MyErrors = new ArrayList<>();
    MyErrors.add(ex.getError());
    return new ResponseEntity<>(getErrorsMap(MyErrors),
        new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

  private MyErrors getErrorsMap(List<MyError> errors) {
    return new MyErrors(errors);
  }

}