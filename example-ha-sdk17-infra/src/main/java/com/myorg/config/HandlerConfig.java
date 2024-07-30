package com.myorg.config;

import com.myorg.handler.example.ExampleHandler;
import com.myorg.usecase.ExampleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public ExampleHandler exampleHandler(final ExampleUseCase useCase) {
        return new ExampleHandler(useCase);
    }
}
