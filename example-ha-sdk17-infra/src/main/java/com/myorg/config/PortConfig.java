package com.myorg.config;


import com.myorg.adapter.in.ExampleVarDto;
import com.myorg.adapter.out.postgres.users.UsersAdapter;
import com.myorg.ports.UsersPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class PortConfig {



    @Bean
    public UsersPort getUserPort() {
        return new UsersAdapter();
    }

    @Bean
    public ExampleVarDto getExampleVarDto(@Value("${my-vars.clientId}") String clientId,
                                          @Value("${project.version}") String projectVersion,
                                          @Value("${trace.id}") String traceId,
                                          @Value("${span.id}") String spanId, @Autowired UsersPort usersPort) {
        return new ExampleVarDto(
                clientId,
                projectVersion,
                traceId,
                spanId,
                usersPort
        );
    }





}
