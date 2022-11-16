package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.code.repo")
@PropertySources({
        @PropertySource({"file:D:\\springboot-microservice\\student.properties"})
})
public class SpringbootMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroserviceApplication.class, args);
    }

}
