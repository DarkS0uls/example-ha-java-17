package com.myorg.config;

import com.myorg.service.time.TimeManagerService;
import com.myorg.service.users.UsersMangerService;
import com.myorg.service.uuid.UuidManagerService;
import com.myorg.usecase.ExampleUseCase;
import com.myorg.usecase.users.create.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ExampleUseCase exampleUseCase(final TimeManagerService timeManagerService) {
        return new ExampleUseCase(timeManagerService);
    }

    @Bean
    public CreateUserUseCase createUserUseCase(
                                                final UsersMangerService usersMangerService,
                                                final TimeManagerService timeManagerService,
                                                final UuidManagerService uuidManagerService)
    {

        return new CreateUserUseCase(usersMangerService, timeManagerService, uuidManagerService);
    }
}
