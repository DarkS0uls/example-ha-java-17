package com.myorg.config;

import com.myorg.service.time.TimeManagerService;
import com.myorg.usecase.ExampleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ExampleUseCase exampleUseCase(final TimeManagerService timeManagerService) {
        return new ExampleUseCase(timeManagerService);
    }
}
