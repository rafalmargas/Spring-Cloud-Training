package com.margas.rafal.feignclient.controller;

import com.margas.rafal.feignclient.feign.GreetingClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FeignController {
    @Autowired
    GreetingClient greetingClient;

    @GetMapping(value = "test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public GreetingDto test() {
        log.info("Calling greeting client");
        return greetingClient.greeting();
    }
}
