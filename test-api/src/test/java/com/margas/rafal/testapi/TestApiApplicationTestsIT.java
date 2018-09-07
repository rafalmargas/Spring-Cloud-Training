package com.margas.rafal.testapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApiApplicationTestsIT {

    @Test
    public void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject("https://api.github.com/users/rafalmargas/repos", String.class);
        assertThat(forObject, containsString( "https://api.githsub.com/users/rafalmargas/received_events"));
    }

}
