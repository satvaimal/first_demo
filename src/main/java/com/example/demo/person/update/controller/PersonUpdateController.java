package com.example.demo.person.update.controller;

import com.example.demo.common.error.MyErrors;
import com.example.demo.person.common.controller.dto.PersonDto;
import com.example.demo.person.common.controller.PersonController;
import com.example.demo.person.update.controller.dto.PersonUpdateDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonUpdateController extends PersonController {

  @Operation(
    summary = "Update a person",
    description = "Given an ID, it updates the details of a person",
    parameters = {
      @Parameter(
        in = ParameterIn.PATH,
        name = "id",
        description = "The ID of the person"
      )
    }
  )
  @ApiResponses(value = {
    @ApiResponse(
      responseCode = "200",
      description = "Person updated",
      content = @Content(
        schema = @Schema(implementation = PersonUpdateDto.class),
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
  ResponseEntity<PersonDto> update(@PathVariable String id,
      @RequestBody @Valid PersonUpdateDto dto);

}
