package com.margas.rafal.feignclient.feign;

import com.margas.rafal.feignclient.controller.GreetingDto;
import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.encoding.HttpEncoding;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {
    @RequestMapping(value = "/greeting", headers = HttpEncoding.CONTENT_TYPE + "=" + MediaType.APPLICATION_JSON_VALUE)
    @Headers(MediaType.APPLICATION_JSON_VALUE)
    GreetingDto greeting();
}