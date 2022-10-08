package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/jeeps")


public interface JeepsSalesController {

  //@formatter:off
  @Operation(
      summary = "Returns a list of Jeeps",
      description = "Returns a list of Jeeps given an optional model and/or trim",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A list of Jeeps is returned.", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Jeep.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "Parameters are invalid.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No Jeeps were found with the criteria.", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occured.", 
              content = @Content(
                  mediaType = "application/json")),
      },
      parameters = {
          @Parameter(name = "model", allowEmptyValue = false, required = false, description = "The model name (i.e., 'WRANGLER')"),
          @Parameter(name = "trim", allowEmptyValue = false, required = false, description = "The trim level (i.e., 'SPORT')")
      }
      )
  //@formatter:on
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Jeep> fetchJeeps(@RequestParam JeepModel model, @RequestParam String trim);


}
