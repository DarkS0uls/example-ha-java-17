package com.myorg;

import com.myorg.adapter.in.example.ExampleRestService;
import com.myorg.adapter.in.users.create.CreateUserAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(
        basePackages = {"com.myorg.config"},
        basePackageClasses = {
                ExampleRestService.class,
                CreateUserAdapter.class
        }
)

public class Application {

    public static void main(final String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
