package com.prt.pom;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class configuration {
    public OpenAPI openAPI(){
        return new OpenAPI();
    }

}
