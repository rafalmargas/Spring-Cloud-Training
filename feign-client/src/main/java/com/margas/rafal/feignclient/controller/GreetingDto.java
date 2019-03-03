package com.margas.rafal.feignclient.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GreetingDto {
    private String greeting;
    private Long count;

}