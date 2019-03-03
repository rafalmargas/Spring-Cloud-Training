package com.margas.rafal.testapi.controller;

import com.margas.rafal.testapi.model.GreetingDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {
    @GetMapping("/greeting")
    public GreetingDto greeting() {
        log.info("Endpoint invoked!");
        return new GreetingDto("Hello from EurekaClient!", 1L, new byte[10]);
    }
}
