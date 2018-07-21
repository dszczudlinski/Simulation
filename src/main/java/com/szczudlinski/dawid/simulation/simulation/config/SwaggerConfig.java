package com.szczudlinski.dawid.simulation.simulation.config;


import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.szczudlinski.dawid.simulation.simulation.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "\"SIMULATION :: REST API\"",
                "Dokumentacja interfejsu RESTful'owego microserwisu MakeOfferCommand",
                "0.1",
                "Terms of service",
                new Contact("Dawid Szczudliński", "", ""),
                "License of API", "", Collections.emptyList());
    }
}