package com.margas.rafal.testapi;

import com.margas.rafal.testapi.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.text.MessageFormat;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Slf4j
public class TestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApiApplication.class, args);
    }


    @GetMapping("/greeting")
    public String greeting() {
        log.info("Endpoint invoked!");
        return "Hello from EurekaClient!";
    }

    @GetMapping("/greeting/{name}")
    @ApiOperation(value = "Typical greeting operation")
    public String greeting(
            @ApiParam(value = "This is a simple name description", required = true) @NotNull @PathVariable String name,
            @ApiParam(value = "User object", required = true) @Valid UserDTO user) {
        log.info("Endpoint invoked!");
        return MessageFormat.format("Hello {0} from EurekaClient!", name);
    }
}
