package com.microservice.account.config.openapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "GlobalTech API",
                version = "1.0.0",
                description = "API documentation for the Accounts APIs. This API allows Our Company to manage our service with our teams.",
                termsOfService = "https://www.microserviceTest.com/terms",
                contact = @Contact(
                        name = "GlobalTech Support",
                        url = "https://www.globaltech.com/support",
                        email = "support@globaltech.com"
                ), // Contact information for the API support
                license = @License(
                        name = "MIT",
                        url = "https://opensource.org/licenses/MIT"
                ) // License information
        ),
        externalDocs = @ExternalDocumentation(
            description = "TogashiBank accounts microservice Rest API Documentation",
            url = "togashi.com"
        ),
        servers = {
                @Server(
                        url = "http://localhost:8080/",
                        description = "LOCAL ENVIRONNEMENT"
                ),
                @Server(
                        url = "https://globaltech.com",
                        description = "PRODUCTION ENVIRONNEMENT"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT authentication using Bearer token",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class openApiConfig {
}
