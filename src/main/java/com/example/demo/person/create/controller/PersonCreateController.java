package com.example.demo.person.create.controller;

import com.example.demo.common.error.MyErrors;
import com.example.demo.person.common.controller.dto.PersonDto;
import com.example.demo.person.common.controller.PersonController;
import com.example.demo.person.create.controller.dto.PersonCreateDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonCreateController extends PersonController {

  @Operation(
    summary = "Create a person",
    description = "Given some attributes, it creates a new person"
  )
  @ApiResponses(value = {
    @ApiResponse(
      responseCode = "201",
      description = "Person created",
      content = @Content(
        schema = @Schema(implementation = PersonCreateDto.class),
        mediaType = "application/json"
      )
    ),
    @ApiResponse(
      responseCode = "400",
      description = "Bad Request",
      content = @Content(
        schema = @Schema(implementation = MyErrors.class),
        mediaType = "application/json"
      )
    )
  })
  ResponseEntity<PersonDto> create(@RequestBody @Valid PersonCreateDto dto);

}
