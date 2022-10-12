package br.com.fiap.checkpoint2.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(
		title = "CheckPoint 2 - Microservice and Web Engineering", 
		version = "1.0", 
		description = "CheckPoint 2 - Lucas Pavão Rm: 84451 / João Mendes Rm: 85041"))
public class SwaggerConfig {

}
