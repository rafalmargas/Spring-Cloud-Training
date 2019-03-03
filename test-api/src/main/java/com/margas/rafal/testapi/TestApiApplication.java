package com.margas.rafal.testapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApiApplication.class, args);
    }

}
