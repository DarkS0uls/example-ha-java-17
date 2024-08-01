package com.myorg.config;

import com.myorg.handler.example.ExampleHandler;
import com.myorg.handler.users.create.CreateUserHandler;
import com.myorg.usecase.ExampleUseCase;
import com.myorg.usecase.users.create.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public ExampleHandler exampleHandler(final ExampleUseCase useCase) {
        return new ExampleHandler(useCase);
    }

    @Bean
    public CreateUserHandler usersHandler(final CreateUserUseCase useCase) {
        return new CreateUserHandler(useCase);
    }
}
