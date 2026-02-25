package com.example.demo.person.delete.controller;

import com.example.demo.common.error.MyErrors;
import com.example.demo.person.common.controller.PersonController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface PersonDeleteController extends PersonController {

  @Operation(
    summary = "Delete a person",
    description = "Given an ID, it deletes a person",
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
      responseCode = "204",
      description = "Person deleted"
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
  ResponseEntity<Void> delete(@PathVariable String id);

}
