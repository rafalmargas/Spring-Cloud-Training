package com.margas.rafal.feignclient.controller;

import com.margas.rafal.feignclient.feign.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    GreetingClient greetingClient;

    @GetMapping("test")
    public String test() {
        return greetingClient.greeting();
    }
}
