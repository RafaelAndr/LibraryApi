package rafaelandrade.libraryapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.stereotype.Component;

@Component
@OpenAPIDefinition(
        info = @Info(
                title = "Library API",
                version = "v1",
                contact = @Contact(
                        name = "Dougllas Sousa",
                        email = "dougllas.sousa@libraryapi.com",
                        url = "libraryapi.com"
                )
        )
)
public class OpenApiConfiguration {
}
