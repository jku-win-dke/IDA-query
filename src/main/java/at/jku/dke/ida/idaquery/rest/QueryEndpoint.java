package at.jku.dke.ida.idaquery.rest;

import at.jku.dke.ida.idaquery.service.dto.AnalysisSituationDTO;
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
    public ResponseEntity generateAndExecuteQuery(@RequestBody AnalysisSituationDTO analysisSituation) {

        return null;
    }
}
