package com.margas.rafal.loggingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class LoggingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggingServerApplication.class, args);
    }
}
