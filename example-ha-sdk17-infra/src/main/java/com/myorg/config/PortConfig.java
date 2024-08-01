package com.myorg.config;


import com.myorg.adapter.out.postgres.users.UsersAdapter;
import com.myorg.ports.UsersPort;
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


}
