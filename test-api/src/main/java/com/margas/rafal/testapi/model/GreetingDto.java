package com.margas.rafal.testapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GreetingDto {
    private String greeting;
    private Long count;
    private byte[] bytes;

}