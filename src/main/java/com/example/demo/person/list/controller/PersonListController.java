package com.example.demo.person.list.controller;

import com.example.demo.person.common.controller.PersonController;
import com.example.demo.person.list.controller.dto.PersonListDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;

public interface PersonListController extends PersonController {

  @Operation(
    summary = "List all available people",
    description = "It shows all the people and their details"
  )
  @ApiResponses(value = {
    @ApiResponse(
      responseCode = "200",
      description = "People found",
      content = @Content(
        schema = @Schema(implementation = PersonListDto.class),
        mediaType = "application/json"
      )
    )
  })
  ResponseEntity<PersonListDto> getList();

}
