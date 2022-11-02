package at.jku.dke.ida.idaquery.rest;

import at.jku.dke.ida.idaquery.service.dto.AnalysisSituationDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryEndpoint {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: Figure out what to return: CSV? In what format?
    @PostMapping(value = "queries", consumes = "application/json", produces = "application/json")
    @Operation(
            description = "Register an airspace user's client for regulations at an airport; overwrite existing registration of an airspace user if already exists.",
            summary = "Register airspace user for regulations at an airport",
            responses = {
                    @ApiResponse(description="Generation and execution of query from an analysis situation", content = @Content(schema = @Schema(implementation = AnalysisSituationDTO.class))),
                    @ApiResponse(responseCode = "201", description = "Resource created"),
                    @ApiResponse(responseCode = "200", description = "Resource updated"),
                    @ApiResponse(responseCode = "400", description = "Invalid input supplied")
            }
    )
    public ResponseEntity generateAndExecuteQuery(@RequestBody AnalysisSituationDTO analysisSituation) {

        return null;
    }
}
