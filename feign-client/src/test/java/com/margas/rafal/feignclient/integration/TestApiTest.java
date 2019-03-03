package com.margas.rafal.feignclient.integration;

import com.margas.rafal.feignclient.controller.GreetingDto;
import com.margas.rafal.feignclient.feign.GreetingClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(ids = "com.margas.rafal:test-api:+:stubs:6565", workOffline = true)
@ActiveProfiles("integration")
public class TestApiTest {

    @Autowired
    GreetingClient greetingClient;

    @Test
    public void shouldReturnGreeting() {
        GreetingDto greeting = greetingClient.greeting();

        assertThat(greeting, notNullValue());
        assertThat(greeting.getGreeting(), equalTo("Hello from EurekaClient!"));
        assertThat(greeting.getCount(), equalTo(1L));
    }
}
