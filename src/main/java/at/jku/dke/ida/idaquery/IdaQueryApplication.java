package at.jku.dke.ida.idaquery;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title = "REST Endpoint for IDA Query Engine", version = "1.0", description = "The REST endpoint for executing queries from IDA.")
)
public class IdaQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdaQueryApplication.class, args);
    }

}
